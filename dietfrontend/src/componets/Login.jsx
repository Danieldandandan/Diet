import React, { Component } from "react";

class LogIn extends Component {
    // export const LogIn = () => {
    state = {
        userEmail: "",
        password: "",
    };

    handleChangeEmail = (event) => {
        const userEmail = event.target.value;
        this.setState({ userEmail });
    };
    handleChangePassword = (event) => {
        const password = event.target.value;
        this.setState({ password });
    };
    handleSubmit = async (event) => {
        event.preventDefault();
        console.log(event);
        const email = this.state.userEmail;
        const password = this.state.password;
        // console.log(email, password);
        const response = await fetch("http://localhost:8080/api/v1/appuser/login", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },

            body: JSON.stringify({ email: email, password: password }),
        }).catch((error) => {
            console.error("Fetch failed", error);
        });
        const data = await response.json();
        console.log(typeof data);
        console.log(data);
        if (data) {
            this.props.onSubmit();
        } else {
            console.log("wrong");
        }
        console.log("calling handle submit");
        // this.props.onSubmit();
    };
    render() {
        return (
            <>
                <form onSubmit={this.handleSubmit}>
                    <label>email:</label>
                    <input value={this.state.userEmail} onChange={this.handleChangeEmail}></input>
                    <label>password:</label>
                    <input
                        type="password"
                        value={this.state.password}
                        onChange={this.handleChangePassword}
                    ></input>
                    <button type="submit">submit</button>
                </form>
                <button onClick={this.props.onRegister}>Dont have an account?</button>
            </>
        );
    }
}

export default LogIn;
