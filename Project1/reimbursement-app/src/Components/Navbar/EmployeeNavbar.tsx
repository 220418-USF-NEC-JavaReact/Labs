import React from 'react';

import {Link} from 'react-router-dom';

import { useSelector, useDispatch } from 'react-redux';                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
import { logout } from '../../Slices/UserSlice';
import { AppDispatch, RootState } from '../../store';


export const EmployeeNavbar: React.FC = () => {

    const dispatch:AppDispatch = useDispatch();

    const handleLogout = () => {
        dispatch(logout());
      
    }

    const user = useSelector((state:RootState) => state.user.user);

    return(
        <nav className="navbar">
          
            <ul className='nav-menu'>
                <li className="nav-item">
                    <Link to={"/home"} className="nav-link">Home</Link>
                </li>
                <li className="nav-item">
                    <Link to={`/user/${user?.userId}`} className="nav-link">Account Information</Link>
                </li>
                <li className="nav-item">
                    <Link to={"/search"} className="nav-link">Search</Link>
                </li>
                <li className="nav-item">
                    <Link to={"/reimbursement"} className="nav-link">Reimbursement</Link>
                </li>
                <li className="logout">
                    <Link to={"/login"} className="nav-link">
                        <button className="logout-btn" onClick={handleLogout}>Logout</button>
                    </Link>
                </li>
            </ul>
        </nav>
    )

}