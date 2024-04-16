var articulo = document.getElementById("articulo");
var cantidad = document.getElementById("cantidad");

function ponerValor(){
    if (articulo.value.length > 2) {
        cantidad.value = 1;
    } else {
        cantidad.value = ""; // Si el input de artículo está vacío, también deberías vaciar el input de cantidad
    }
}

articulo.addEventListener("input", function() {
    if(articulo.value.length<2){
        ponerValor();
    }
});

articulo.addEventListener("focus", function() {
    articulo.dataset.isFocused = true; // Marcamos que el input está enfocado
});

articulo.addEventListener("blur", function() {
    // Verificamos si el input estuvo enfocado antes de hacer clic fuera de él
    if (articulo.dataset.isFocused === "true") {
        ponerValor();
    }
});

function validacion(form){
    var articuloValidacion = form.articulo;
    var cantidadValidacion = form.cantidad;
    
    if(articuloValidacion.length < 2 || cantidadValidacion.value < 0 || articuloValidacion.value == "" || cantidadValidacion.value == ""){
        alert("Para añadir debes introducir un articulo y una cantidad del mismo");
        return false;
    }
    return true;
}