import { Link } from 'react-router-dom';
import React from 'react';

class Home extends React.Component{
    // constructor(){
    //     super();
    // }
    render(){
        return(
            <div>
            <p>Hi! Create note here</p>
            <Link to="/create" style={{ textDecoration: 'none', color: 'red' }}>Create Note   </Link>
            <Link to="/edit" style={{ textDecoration: 'none', color: 'red' }}>Edit Code  </Link>
            <Link to="/delete" style={{ textDecoration: 'none', color: 'red' }}>Delete Note</Link>
            </div>
        )
    }
}
export default Home;