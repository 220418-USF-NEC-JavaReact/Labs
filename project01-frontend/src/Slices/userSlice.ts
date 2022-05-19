import {createSlice, createAsyncThunk} from "@reduxjs/toolkit";
import axios from "axios";
import { IReimbursement } from "../Interfaces/IReimbursement";
import {IUser} from "../Interfaces/IUser";

//Figure out our default state for this slice

interface UserSliceState {
    loading: boolean,
    error: boolean,
    isLogged: boolean,
    user?: IUser,
    reimbursement?: IReimbursement,
    reimbursementList?: IReimbursement[]
}

const initialUserState: UserSliceState = {
    loading: false,
    error: false,
    isLogged: false
}

type Login = {
    username: string,
    password: string
}

type reimburseData = {
    reimburseStatus?: string
}

export const loginUser = createAsyncThunk(
    'user/login',
    async (credentials:Login, thunkAPI) => {
        try{
            const res = await axios.post('http://localhost:8000/user/login', credentials);
            console.log(res.data);
            return {
                userId: res.data.userId,
                username: res.data.username,
                firstName: res.data.firstName,
                lastName: res.data.lastName,
                email: res.data.email,
                role: res.data.role
            }
        } catch(e){
            return thunkAPI.rejectWithValue('something went wrong');
        }
    }
)

export const logoutUser = createAsyncThunk(
    "user/logout",
    async (thunkAPI) => {
        try{
            axios.defaults.withCredentials = true;
            const res = axios.get("http://localhost:8000/user/logout");
        } catch(e){
            console.log(e);
        }
    }
)

export const submitReimbursement = createAsyncThunk(
    'user/post',
    async (reimburseData: IReimbursement, thunkAPI) => {
        try{
            const res = await axios.post("http://localhost:8000/reimbursement/submit",reimburseData);
            console.log(res.data);
            return {
                id: res.data.id,
                amount: res.data.amount,
                submitDate: res.data.submitedDate,
                resolveDate: res.data.resolvedDate,
                description: res.data.description,
                author: res.data.reimburseAuthor,
                resolver: res.data.reimburseResolver, 
                status: res.data.reimburseStatus,
                reimburseType: res.data.reimburseType
            }
        } catch(error){
            console.log(error);
        }
    }
)

export const pendingReimbursement = createAsyncThunk(
    'user/reimbursement',
    async (reimburseData: reimburseData, thunkAPI) => {
        try{
            const res = await axios.post("http://localhost:8000/reimbursement/show",reimburseData);
            return res.data;
            
        } catch(error){
            console.log(error);
        }
    }
)

//Create the slice
export const UserSlice = createSlice({
    name: "user",
    initialState: initialUserState,
    reducers: {
        toggleError : (state) => {
            state.error = !state.error;
        }
    },
    extraReducers: (builder) => {
        //This is where we would create our reducer logic
        builder.addCase(loginUser.pending, (state, action)=> {
            state.loading = true;
        });
        builder.addCase(loginUser.fulfilled, (state, action) => {
            //The payload in this case, is the return from our asyncThunk from above
            state.user = action.payload;
            state.error = false;
            state.loading = false;
            state.isLogged = true;
        });
        builder.addCase(loginUser.rejected, (state, action)=> {
            state.error = true;
            state.loading = false;
        });
        builder.addCase(logoutUser.fulfilled, (state, action) => {
            state.user = undefined;
            state.isLogged = false;
        });
        builder.addCase(submitReimbursement.fulfilled, (state, action) => {
            state.reimbursement = action.payload;
        });
        builder.addCase(pendingReimbursement.fulfilled, (state, action) => {
            state.reimbursementList = action.payload;
        });
        
    }
})

//If we had normal actions and reducers we would export them like this
export const {toggleError} = UserSlice.actions;

export default UserSlice.reducer;