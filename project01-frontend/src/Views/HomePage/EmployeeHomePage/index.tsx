import React, { useEffect } from "react";
import { useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
import { Navbar } from "../../../Components/Navbar/Navbar";
import { RootState } from "../../../store";



export const EmployeeHomePage: React.FC = () =>{

    const userState = useSelector((state:RootState) => state.user.user);
    const navigator = useNavigate();

    useEffect(()=>{
        if(!userState){
            navigator("/login");
        }
    },[userState, navigator]);
    return(
        <>
            <Navbar/>
            <h1>Welcome {userState?.firstName} {userState?.lastName}</h1>
        </>
    )
}