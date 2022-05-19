import React, { useEffect } from "react";
import { useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
import { NavbarManager } from "../../../Components/NavbarManager/NavbarManager";
import { RootState } from "../../../store";



export const ManagerHomePage: React.FC = () => {
    const userState = useSelector((state:RootState) => state.user.user);
    const navigator = useNavigate();

    useEffect(()=>{
        if(!userState){
            navigator("/login");
        }
    },[userState, navigator]);

    return (
        <>
            <NavbarManager />
            <h1>Welcome {userState?.firstName} {userState?.lastName}</h1>
        </>
    )
}