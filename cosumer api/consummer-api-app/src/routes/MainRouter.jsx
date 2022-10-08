import React from "react";
import Home from "../Home";
import { Route, Routes } from "react-router-dom";
import Produtos from './../Produtos/Produto'



const MainRouter = () => {
    return (

        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/produtos" element={<Produtos/>} />
        </Routes>

    )
}

export default MainRouter;