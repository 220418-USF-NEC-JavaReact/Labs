import React, {useState, useEffect} from 'react';

interface UpdateFormProps {
    onClick: (username: string, password: string, first_name: string, last_name: string, email_name: string ) => void
}


export const UpdateForm : React.FC = () => {
    // Setting the input 
    const [username, setUsername] = useState<string>("");
    const [password, setPassword] = useState<string>("");
    const [first_name, setFirstName] = useState<string>("");
    const [last_name, setLastName] = useState<string>("");
    const [email, setEmail] = useState<string>("");

    const handleInput = (event:React.ChangeEvent<HTMLInputElement>) => {
        // Getting the input value with matching HTML element names
        if(event.target.name === "username"){
            setUsername(event.target.value);
        } else if (event.target.name === "password"){
            setPassword(event.target.value);
        } else if (event.target.name === "first_name"){
            setFirstName(event.target.value);
        } else if (event.target.name === "last_name"){
            setLastName(event.target.value);
        } else {
            setEmail(event.target.name);
        }
    }
    
    const handleUpdate = (event:React.MouseEvent<HTMLButtonElement>) => {
        let update = {
            username,
            password,
            first_name,
            last_name,
            email
        };
    }
    

    return(
        <div>
            <form className="update-form">
                <div className="input-form-div">
                    <h4 className="input-label">Please Enter Your Username: </h4>
                    <input autoComplete="off" className="update-input" type="text" placeholder="username" name="username" onChange={handleInput}/>
                </div>
                
                <div className="input-form-div">
                    <h4 className="input-label">Please Enter Your Password: </h4>
                    <input className="update-input" type="password" name="password" placeholder="password" onChange={handleInput}/>
                </div>

                <div className="input-form-div">
                    <h4 className="input-label">Please Enter Your First Name: </h4>
                    <input className="update-input" type="text" name="first_name" placeholder="first name" onChange={handleInput}/>
                </div>

                <div className="input-form-div">
                    <h4 className="input-label">Please Enter Your Last Name: </h4>
                    <input className="update-input" type="text" name="last_name" placeholder="last name" onChange={handleInput}/>
                </div>

                <div className="input-form-div">
                    <h4 className="input-label">Please Enter Your Email: </h4>
                    <input className="update-input" type="email" name="email" placeholder="email" onChange={handleInput}/>
                </div>
            </form>
            <button className="update-button" onClick={handleUpdate}>Update</button>
        </div>
    )
    
}