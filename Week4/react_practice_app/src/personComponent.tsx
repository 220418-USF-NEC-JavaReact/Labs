import React from 'react';
import { IPeople } from './interfaces/IPeople';

export default class PersonComponent extends React.Component {

    person:IPeople = {
        firstName: 'Victor',
        lastName: 'Siu',
        bio: 'Programmer',
        favoriteMovies: ['Star War', 'The Dark Knight']
    }
    render(): React.ReactNode {
        return(
            <div>
                <div id="name_area">
                <h1>Person: {this.person.firstName} {this.person.lastName}</h1>
                </div>
                <div className='bio'>
                    <h2>BIO</h2>
                    <p>{this.person.bio}</p>
                
                </div>
                <div className='movies'>
                    <h2>Moives</h2>
                    <p>{this.person.favoriteMovies[0]}</p>
                    <p>{this.person.favoriteMovies[1]}</p>
                </div>
            </div>
        )
    }
}