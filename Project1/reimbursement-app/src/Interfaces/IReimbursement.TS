import { IUser } from "./IUser"

export interface IReimbursement {
    reimbursementId?: number,
    amount: number,
    submittedDate?:string,
    resolvedDate?: string,
    description: string,
    reimbursementAuthor?: string,
    reimbursementResolver?: string,
    reimbursementStatus?: number,
    reimbursementType: number

   
}