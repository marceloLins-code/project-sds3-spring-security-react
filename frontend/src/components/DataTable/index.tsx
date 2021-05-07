const DataTable = () => {
    return (
        <div className="table-responsive">
    <table className="table table-striped table-sm">
        <thead>
            <tr>
                <th>Data</th>
                <th>Vendedor</th>
                <th>Clientes visitados</th>
                <th>Negócios fechados</th>
                <th>Valor</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>22/04/2021</td>
                <td>Renato Alves</td>
                <td>23</td>
                <td>33</td>
                <td>33411.00</td>
            </tr>
            <tr>
                <td>22/04/2021</td>
                <td>Marcelo Lins</td>
                <td>34</td>
                <td>25</td>
                <td>457822.00</td>
            </tr>
            <tr>
                <td>22/04/2021</td>
                <td>Marcos Tulio</td>
                <td>22</td>
                <td>43</td>
                <td>61122.00</td>
            </tr>
            <tr>
                <td>22/04/2021</td>
                <td>Eliane Allen</td>
                <td>61</td>
                <td>44</td>
                <td>45255.00</td>
            </tr>
            <tr>
                <td>22/04/2021</td>
                <td>Bryan Lex</td>
                <td>12</td>
                <td>44</td>
                <td>15017.00</td>
            </tr>
        </tbody>
    </table>
</div>
    );
}

export default DataTable;