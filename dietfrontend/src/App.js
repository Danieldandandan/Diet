import "./App.css";
import React, { Component } from "react";
import LogIn from "./componets/Login";
import SignUp from "./componets/SignUp";
import MainPage from "./componets/MainPage";

class App extends Component {
    state = {
        pageStatus: "login",
    };
    handleLogin = (property) => {
        console.log("handle login", property);
        const pageStatus = "main";
        this.setState({ pageStatus });
    };
    handleRegister = () => {
        console.log("sign up here");
        const pageStatus = "signup";
        this.setState({ pageStatus });
    };
    getPage() {
        const { pageStatus } = this.state;
        if (pageStatus === "login")
            return <LogIn onSubmit={this.handleLogin} onRegister={this.handleRegister} />;
        if (pageStatus === "signup") return <SignUp />;
        if (pageStatus === "main") return <MainPage />;
    }
    render() {
        return this.getPage();
    }
}

export default App;
