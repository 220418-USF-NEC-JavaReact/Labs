import React from 'react';

import {Link} from 'react-router-dom';

import { useDispatch, useSelector } from 'react-redux';

import defaultImage from '../../deafultpic.jpg';

import './NavbarManager.css';
import { AppDispatch, RootState } from '../../store';
import { logout } from '../../Slices/UserSlice';

export const NavbarManager: React.FC = () => {

    const userState = useSelector((state:RootState) => state.user.user);
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
                    <Link to={"/reimbursement/employee"} className="nav-link">Reimbursement</Link>
                </li>
                <li className="nav-item">
                    <Link to={"/employees"} className="nav-link">Accounts Info</Link>
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