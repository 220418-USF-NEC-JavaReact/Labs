
export interface IReimbursement {
    id?: number,
    amount: number,
    submitedDate?: string,
    resolvedDate?: string,
    description: string,
    author?: string,
    resolver?: string, 
    status?: string,
    reimburseType: string
}