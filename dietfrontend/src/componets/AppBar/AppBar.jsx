import React, { Component } from "react";
import UserInfo from "./UserInfo";
import SignInUp from "./SignInUp";
const settings = ["Profile", "Account", "Dashboard", "Logout"];

class AppBar extends Component {
    // state = {  }
    getButton() {
        return this.props.isLogedin ? <UserInfo /> : <SignInUp />;
    }
    render() {
        return (
            <nav className="navbar navbar-light bg-success">
                <h>DIET</h>
                {this.getButton()}
            </nav>
        );
    }
}

export default AppBar;
