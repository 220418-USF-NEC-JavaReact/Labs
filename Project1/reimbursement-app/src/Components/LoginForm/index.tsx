import React, {useState, useEffect} from 'react';
import { useDispatch } from 'react-redux';
import { loginUser, toggleError } from '../../Slices/UserSlice';
import { AppDispatch } from '../../store';


export const Login: React.FC = () => {
    // Setting the input 
    const [username, setUsername] = useState<string>("");
    const [password, setPassword] = useState<string>("");

    const dispatch: AppDispatch = useDispatch();

    const handleInput = (event:React.ChangeEvent<HTMLInputElement>) => {
        if(event.target.name === "username"){
            setUsername(event.target.value);
        }
        else {
            setPassword(event.target.value);
        }
    }
    // Handler Event of login
    const handleLogin = (event:React.MouseEvent<HTMLButtonElement>) => {
        let credentials = {
            username,
            password
        };

        dispatch(loginUser(credentials));
    }
    

    return(
        <div>
            <form className="login-form">
                <div className="input-form-div">
                    <h4 className="input-label">Please Enter Your Username: </h4>
                    <input autoComplete="off" className="login-input" type="text" placeholder="username" name="username" onChange={handleInput}/>
                </div>
                
                <div className="input-form-div">
                    <h4 className="input-label">Please Enter Your Password: </h4>
                    <input className="login-input" type="password" name="password" placeholder="password" onChange={handleInput}/>
                </div>
            </form>
            <button className="login-button" onClick={handleLogin}>Login</button>
        </div>
    )
    
}
