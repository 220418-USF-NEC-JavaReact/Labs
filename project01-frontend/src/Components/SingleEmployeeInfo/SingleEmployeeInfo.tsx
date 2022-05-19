import React from "react";
import { IUser } from "../../Interfaces/IUser";


export const SingleEmployeeInfo: React.FC<IUser> = (user:IUser) => {
    return(
        <>
            <p>User Id: {user.userId}</p>
            <p>First name: {user.firstName}</p>
            <p>Last name: {user.lastName}</p>
            <p>User name: {user.username}</p>
            <p>Email: {user.email}</p>
            <p>Role: {user.role}</p>
        </>
    )
}