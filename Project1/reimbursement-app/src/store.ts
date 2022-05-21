import { configureStore } from "@reduxjs/toolkit";
import userReducer from "./Slices/UserSlice";

export const store = configureStore({
    reducer: {
       
        user: userReducer
    
    }
});

//We must export these two things to make our lives easier later
export type RootState = ReturnType<typeof store.getState>;

export type AppDispatch = typeof store.dispatch;