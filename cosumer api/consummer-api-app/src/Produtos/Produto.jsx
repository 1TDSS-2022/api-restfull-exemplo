import React, {useState, useEffect} from "react";
import { Link } from 'react-router-dom'
import { AiTwotoneDelete } from 'react-icons/ai';
import { AiTwotoneEdit } from 'react-icons/ai';

const Produto = () => {
    const[produto, setProduto] = useState([]);

    useEffect(() => {

       const getProduto = async () => {
            const response = await fetch("http://localhost:8080/LojaApp/rest/produto")
            const data = await response.json()
            
            setProduto(data)
        }

        getProduto();

    },[])

    return(
        <>

        <table border={1}>
            <tr>
                <th>ID</th>
                <th>Produto</th>
                <th>Preço</th>
                <th>Quantidade</th>
                <th>Editar | Excluir</th>
            </tr>
            {produto.map((obj, i) => (
                <tr key={i}>
                    <td>{obj.codigo}</td>
                    <td>{obj.titulo}</td>
                    <td>{obj.preco}</td>
                    <td>{obj.quantidade}</td>
                    <td style={{textAlign: "center"}}><Link to={`/editar/${obj.codigo}`}><AiTwotoneEdit/></Link> | <Link to={`/excluir/${obj.codigo}`}><AiTwotoneDelete/></Link></td>
                </tr>

            ))}

        </table>

        </>
    )
}

export default Produto;