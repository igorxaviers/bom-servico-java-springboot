const categorias = document.querySelectorAll('.categoria');
categorias.forEach((element) => {
    element.addEventListener('click', () => {
        element.classList.toggle('cat-ativo');
    });
});

