import React, {useEffect} from 'react';
import { Link } from 'react-router-dom';



export const HomePage: React.FC = () => {

  

    return(
        <div className="home-page">
            <div className='Header'>
                <Link to='/home'>Home</Link>
                <Link to='/update'>Update you information</Link>
                <Link to='/search'>Search</Link>
                <Link to='/'>Logout</Link>
            </div>
            
        </div>
    )
}