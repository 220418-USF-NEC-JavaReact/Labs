import React from 'react';
import { IUser } from '../../Interfaces/IUser';


export const EmployeeInfo: React.FC<IUser> = (user:IUser) => {
    return(
        <>
            <p>User Id: {user.userId}</p>
            <p>User name: {user.username}</p>
            <p>User password: {user.password}</p>
            <p>First name: {user.firstName}</p>
            <p>Last name: {user.lastName}</p>
            <p>Email: {user.email}</p>
            <p>Role: {user.role}</p>
        </>
    )
}