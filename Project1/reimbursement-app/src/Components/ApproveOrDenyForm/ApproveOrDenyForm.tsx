
import React from 'react';

class ApproveOrDenyForm extends React.Component{

    render(){
        return (
            <div className="approveOrDenyForm">
                <form>
                    <label></label>
                    <input type="text" name="request_id"></input>
                    <label></label>
                    
                    <input type="submit">Submut</input>
                </form>
            </div>
        )
    }

}

export default ApproveOrDenyForm;