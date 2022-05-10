import React from 'react';
import { convertTypeAcquisitionFromJson, isPropertySignature } from 'typescript';
import { IPeople } from './interfaces/IPeople';

export default class PersonComponentProps extends React.Component<IPeople, IPeople> {

    constructor(props:IPeople){
        super(props);
        console.log(props);
        this.state = {
            firstName: "",
            lastName: "",
            bio: "",
            favoriteMovies: []
            
        }
    };

    componentDidMount(){
        console.log("In the componentDidMount");
        console.log("If it was still cool to use classes, we would use this method to make api calls");
        //Image we do an api call, and get the users information
        //After we the users information, we call set state, and that state is stored inside of our person component
        const {firstName, lastName, bio, favoriteMovies} = this.props;
        this.setState(this.props);
    }

    render(): React.ReactNode {
        return(
            <div>
                <h1>Person: {this.state.firstName} {this.state.lastName}</h1>
                
                <div className='bio'>
                    <h2>BIO</h2>
                    <p>{this.state.bio}</p>
                
                </div>
                <div className='movies'>
                    <h2>Moives</h2>
                    <p>{this.state.favoriteMovies[0]}</p>
                    <p>{this.state.favoriteMovies[1]}</p>
                </div>
            </div>
        )
    }
}
