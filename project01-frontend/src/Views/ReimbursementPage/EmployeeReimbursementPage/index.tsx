import React, { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { useParams } from "react-router-dom";

import { EmployeeReimbursement } from "../../../Components/EmployeeReimbursement"
import { pendingReimbursement } from "../../../Slices/userSlice";
import { AppDispatch, RootState } from "../../../store";


export const EmployeeReimbursementPage: React.FC = () => {
    const reimbursementList = useSelector((state:RootState) => state.user.reimbursementList);
    const dispatch:AppDispatch = useDispatch();
    const { status } = useParams();
    const reimburseData = {
        reimburseStatus: status
    }
    
    useEffect(()=>{
        
            dispatch(pendingReimbursement(reimburseData));   
          
    },[]);

    return (
        <>
          <table>
              <thead>
                  <tr>
                  <th>Id</th>
                  <th>Amount</th>
                  <th>Description</th>
                  <th>Author</th>
                  <th>Resolver</th>
                  <th>Submitted Date</th>
                  <th>Resolved Date</th>
                  <th>Status</th>
                  <th>Type</th>
                  </tr>
              </thead>
              <tbody>
                  {reimbursementList && reimbursementList.map(item => <EmployeeReimbursement {...item} key={item.id}/>)}
              </tbody>
          </table>  
        </>)
}