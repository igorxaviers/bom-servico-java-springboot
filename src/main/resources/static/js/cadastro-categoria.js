var URL;
function cadastrarCategoria()
{   
  event.preventDefault();       
  URL = 'categoria-create';
  fetch(URL, {method:'post', body:form})
      .then((response) => {
          return response.text()
      })
      .then((result) => {
      }
  );
}