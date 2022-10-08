import React from "react";
import Produto from "./Produtos/Produto";
import { Link } from 'react-router-dom'

const Home = () => {
    return(
        <>
        <header>
            <nav>
                <Link to="/">Home</Link>
                <Link to="/produtos">Produtos</Link>
            </nav>
        </header>

        </>
    )
}

export default Home;