import React, {useState, useEffect} from 'react';

interface ViewSpecificEmployeeProps {
    onClick: ( userId: number ) => void
}

const [userId, setUserId] = useState<number>(-1);
const handleInput = (event:React.ChangeEvent<HTMLInputElement>) => {
    if(event.target.name === "userId"){
        setUserId(event.target.valueAsNumber);
    }

}
export const ViewSpecificEmployee : React.FC = () => {

    return(
        <div>
        </div>
    )
    
}