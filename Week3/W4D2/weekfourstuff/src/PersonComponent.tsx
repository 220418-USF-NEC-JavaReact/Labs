import React from 'react';
import './App.css';
import { IPerson } from './interfaces/IPerson';

export default class PersonComponent extends React.Component<IPerson, IPerson> {

    constructor(props:IPerson){
        super(props);
        console.log(props);

        this.state = {
            firstName: "",
            lastName: "",
            bio: "",
            favoriteMovies: []
        };
    }

    componentDidMount(){
        const {firstName, lastName, bio, favoriteMovies} = this.props;
        this.setState(this.props);
    }

     render(): React.ReactNode {
         return (
            <div className="Information">
                <p><b>First Name:</b> {this.props.firstName}</p>
                <p><b>Last Name:</b> {this.props.lastName}</p>
                <p><b>Bio:</b> {this.props.bio}</p>
                <p><b>Favorite Movies:</b> {this.props.favoriteMovies}</p>
                <br/>
            </div>
        )
    };

}
