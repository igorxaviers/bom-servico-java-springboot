

var URL;

function cadastrar()
{   
    URL = 'AnimesController?acao=busca&busca=';
    if(!excluiu)
    {
        event.preventDefault(); 
        var busca = document.getElementById("filtro").value; 
        URL = 'AnimesController?acao=busca&busca='+busca;
    }
       
    fetch(URL, {method:'post', body:form})
        .then((response) => {
            return response.text()
        })
        .then((result) => {
        }
    );
}