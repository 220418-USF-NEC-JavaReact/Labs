import React from "react";
import { IReimbursement } from "../../Interfaces/IReimbursement";


export const EmployeeReimbursement: React.FC<IReimbursement> = (reimbursement) => {
    return(
        <>
            <tr>
                <td>{reimbursement.id}</td>
                <td>{reimbursement.amount}</td>
                <td>{reimbursement.description}</td>
                <td>{reimbursement.author}</td>
                <td>{reimbursement.resolver}</td>
                <td>{reimbursement.submitedDate}</td>
                <td>{reimbursement.resolvedDate}</td>
                <td>{reimbursement.reimburseType}</td>
                <td>{reimbursement.status}</td>
            </tr>
        </>
    )
}