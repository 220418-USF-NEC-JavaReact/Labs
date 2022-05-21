import React from 'react';
import './App.css';
import {LoginPage} from './Views/LoginPage/LoginPage';
import {RegisterPage} from './Views/RegisterPage/RegisterPage'
import {HashRouter, Routes, Route, Navigate } from 'react-router-dom';
import FooterPart from './Components/Footer/footer'
function App() {
  return (
    <div className="App">
  
      <HashRouter>
        <Routes>
          <Route path="*" element={<Navigate to="/login" replace />} />
          <Route path="/login" element={<LoginPage />}/>
          <Route path='/register' element={<RegisterPage />} />
          <Route path="/home" element={<a />} />
          
      
        </Routes>
      </HashRouter>
      
      <FooterPart />
    
    </div>
  );
}

export default App;
