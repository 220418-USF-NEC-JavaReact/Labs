import React from 'react';
import { IReimbursement } from "../../Interfaces/IReimbursement";


export const ReimbursementInfo: React.FC<IReimbursement> = (reimbursement) => {
    return(
        <>
            <tr>
                <td>{reimbursement.reimbursementId}</td>
                <td>{reimbursement.amount}</td>
                <td>{reimbursement.description}</td>
                <td>{reimbursement.reimbursementAuthor}</td>
                <td>{reimbursement.reimbursementResolver}</td>
                <td>{reimbursement.submittedDate}</td>
                <td>{reimbursement.resolvedDate}</td>
                <td>{reimbursement.reimbursementType}</td>
                <td>{reimbursement.reimbursementStatus}</td>
            </tr>
        </>
    )
}