import React, { useEffect, useState } from "react";
import { IReimbursement } from "../../Interfaces/IReimbursement";
import {Link} from 'react-router-dom';

import "./SubmitReimbursement.css"

interface IOnSubmit {
    onSubmitProp : (data:any) => void;
}

export const SubmitReimbursement: React.FC<IOnSubmit> = ({onSubmitProp}) =>{
    const [amount, setAmount] = useState(0);
    const [description, setDescription] = useState();
    const [reimburseType, setReimburseType] = useState();
    
    const handleOnChange = (e:any) => {
        if(e.target.name === "amount"){
            setAmount(parseFloat(e.target.value));
        } else if(e.target.name === "description"){
            setDescription(e.target.value);
        } else{
            setReimburseType(e.target.value);
        }
    }

    const handleOnSubmit = (e:any) => {
        e.preventDefault();
        onSubmitProp({amount, description, reimburseType})
    }
    return(
        <>
            <form onSubmit={handleOnSubmit}>
            <label>Amount : </label>
            <input type="text" id="amount" name="amount" onChange={handleOnChange}/><br></br>
            <label>Description : </label>
            <input type="text" id="description" name="description" onChange={handleOnChange}/><br></br>
            <label>Type : </label>
            <input type="text" id="type" name="type" onChange={handleOnChange}/><br></br>
            <input type="submit" value="Submit" />
            </form>
            <button><Link to={"/employee/reimbursement/pending"} className="link">Pending</Link></button>
            <button><Link to={"/employee/reimbursement/resolved"} className="link">Resolved</Link></button>
        </>
    )
}