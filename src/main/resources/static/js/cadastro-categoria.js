var URL;
function cadastrarCategoria()
{   
  alert('oi')
  URL = 'categoria/create';
  event.preventDefault();       
  fetch(URL, {method:'post', body:form})
      .then((response) => {
          return response.text()
      })
      .then((result) => {
      }
  );
}