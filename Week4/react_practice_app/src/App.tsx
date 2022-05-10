import React from 'react';
import { IPeople } from './interfaces/IPeople';
import PersonComponent from './personComponent';
import PersonComponentProps from './PersonComponentProps';


function App() {

  let personsList : IPeople[] = [];

  personsList.push(
    {
    firstName: 'Victor',
    lastName: 'Siu',
    bio: 'Programmer',
    favoriteMovies: ['Star War', 'The Dark Knight']
    }
  );

  personsList.push(
    {
      firstName: 'Lilianne',
      lastName: 'Tavarez',
      bio: 'Programmer',
      favoriteMovies: ['Shrek']
    }

  );
  personsList.push(
    {
      firstName: 'Dawit',
      lastName: 'Alemu',
      bio: 'Programmer',
      favoriteMovies: ['Accepted it']
    }

  );
  personsList.push(
    {
      firstName: 'Isiah',
      lastName: 'Johnson',
      bio: 'Programmer',
      favoriteMovies: ['Snow piercer']
    }

  );
  return (
    <>
      <PersonComponentProps {...personsList[0]} />
      <PersonComponentProps {...personsList[1]} />
      <PersonComponentProps {...personsList[2]} />
      <PersonComponentProps {...personsList[3]} />
    </>
  );
}

export default App;
