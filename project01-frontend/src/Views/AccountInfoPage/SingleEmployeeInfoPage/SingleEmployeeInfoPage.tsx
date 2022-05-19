import React, { useEffect } from "react";
import { useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
import { Navbar } from "../../../Components/Navbar/Navbar";
import { SingleEmployeeInfo } from "../../../Components/SingleEmployeeInfo/SingleEmployeeInfo";
import { IUser } from "../../../Interfaces/IUser";
import { RootState } from "../../../store";

export const SingleEmployeeInfoPage : React.FC = () => {
    
    const userState = useSelector((state:RootState) => state.user.user);
    const isLogged = useSelector((state:RootState) => state.user.isLogged);
    const navigator = useNavigate();
    useEffect(() =>{
        if(!isLogged){
            navigator("/login");
        }
    },[])
    return(
        <>
            <Navbar />
            { userState !== undefined ? <SingleEmployeeInfo {...userState} /> : <></> }
        </>
    )
}