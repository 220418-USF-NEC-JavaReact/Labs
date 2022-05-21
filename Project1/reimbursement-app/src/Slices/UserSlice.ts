import {createSlice, createAsyncThunk} from "@reduxjs/toolkit";
import axios from "axios";
import {IUser} from "../Interfaces/IUser";
import { IReimbursement } from "../Interfaces/IReimbursement";

//Figure out our default state for this slice

interface UserSliceState {
    loading: boolean,
    error: boolean,
    user?: IUser,
    isLogged: boolean,
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

export const loginUser = createAsyncThunk(
    'user/login',
    async (credentials:Login, thunkAPI) => {
        try{
            const res = await axios.post('http://localhost:8080/users/login', credentials);

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

export const getUserDetails = createAsyncThunk(
    'users/get',
    async (id: number | string, thunkAPI) => {
        try{
            const res = await axios.get(`http://localhost:8080/users/viewInfo/${id}`);

            return {
                userId: res.data.userId,
                username: res.data.username,
                password: res.data.password,
                firstName: res.data.firstName,
                lastName: res.data.lastName,
                email: res.data.email,
                role: res.data.role
            }
        } catch(error){
            console.log(error);
        }
    }
);

export const logout = createAsyncThunk(
    "user/logout",
    async (thunkAPI) => {
        try{
            axios.defaults.withCredentials = true;
            const res = axios.get("http://localhost:8080/users/logout");
        } catch(e){
            console.log(e);
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
        });
        builder.addCase(loginUser.rejected, (state, action)=> {
            state.error = true;
            state.loading = false;
        });
        builder.addCase(getUserDetails.pending, (state, action) => {
            state.loading = true;
        });
        builder.addCase(getUserDetails.fulfilled, (state, action) => {
            state.loading =false;
          
        });
        builder.addCase(logout.fulfilled, (state, action)=> {
            state.user = undefined;
        })
    }
})

//If we had normal actions and reducers we would export them like this
export const {toggleError} = UserSlice.actions;

export default UserSlice.reducer;