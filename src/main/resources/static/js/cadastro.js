const formCadastro = document.getElementById('form-cadastro-usuario');
formCadastro.addEventListener('submit', (e) => {
    e.preventDefault();
    console.log(formCadastro);
    const URL = '/cadastrar';
    let formData = new FormData(formCadastro);
    const token = getRndInteger(0,1000000);

    formData.append('permissao', 0);
    formData.append('token', token);

    const json = JSON.stringify(Object.fromEntries(formData));

    console.log(json);

    fetch(URL,
        {method: 'POST',
        body: json,
        headers: {'Accept': 'application/json','Content-Type': 'application/json'},
    })
    .then((response)=>{
        return response.text();
    })
    .then((retorno)=>{
        if(retorno.startsWith('Erro'))
            console.log("erro "+retorno);
        else
        {
            console.log(retorno);
            formCadastro.reset();
            
            window.location.href = '/home';
        }
    })
});
    
function getRndInteger(min, max) {
    return Math.floor(Math.random() * (max - min + 1) ) + min;
}
