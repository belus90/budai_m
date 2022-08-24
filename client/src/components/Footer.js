import React from "react";
import "../style/Footer.css";
import facebook from "../img/fb.png";
import instagram from "../img/inst.png";
import twitter from "../img/twitter.png";

// Could contain more information about the company
// Make the navbar appear in this section

function Footer() {
    return (
                <div className="social-media">
                    {/* These are the links for the "company socail media" */}
                    <a href="https://www.facebook.com/"><img src={facebook}></img></a>
                    <a href="https://www.instagram.com/"><img src={instagram}></img></a>
                    <a href="https://twitter.com/"><img src={twitter}></img></a>
                </div>
    );
}

export default Footer;