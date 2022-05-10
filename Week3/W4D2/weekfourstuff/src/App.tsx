import React from 'react';
import './App.css';
import PersonComponent from './PersonComponent';
import { IPerson } from './interfaces/IPerson';

class App extends React.Component<{}, IPerson[]> {

    constructor(props:IPerson){
        super(props);
        console.log(props);

        this.state = [];
    }

    componentDidMount(){
        let personList:IPerson[] = [];
        personList.push({
                firstName:"Justin",
                lastName: "Tsuchiyama",
                bio: "I type on keyboards",
                favoriteMovies: ["Spider-Man (All of them)", "The Other Guys"]
            },
            {
                firstName:"Nabil",
                lastName: "Ahmed",
                bio: "I use VS Code",
                favoriteMovies: ["Bat-Man (all of them)"]
            },
            {
               firstName:"Parth",
               lastName: "Kikani",
               bio: "I use XBox Controller to code",
               favoriteMovies: ["All Bollywood movies"]
           },
           {
              firstName:"Angel",
              lastName: "Sanchez",
              bio: "I stream video games",
              favoriteMovies: ["Shrek (all of them)"]
           },
           {
              firstName:"Kenneth",
              lastName: "Fish",
              bio: "IntelliJ uses up all my RAM",
              favoriteMovies: ["Lord of the Rings (all of them)"]
           }

        );

        this.setState(personList);
    }

   render(): React.ReactNode {

     return (
       <div className="App">
           <h1>Stuff About Us!</h1>
            <PersonComponent {...this.state[0]} />
            <PersonComponent {...this.state[1]} />
            <PersonComponent {...this.state[2]} />
            <PersonComponent {...this.state[3]} />
            <PersonComponent {...this.state[4]} />
       </div>
     );

   }

}

export default App;
