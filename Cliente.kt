interface Cliente {
    var listaClientes
        get() = mutableListOf<Cliente>()
        set(value) = TODO()

    fun aplicarDescuento(){
        //Aqui veremos si el cliente está registrado o no, para aplicarle o no el descuento
    }
    fun pagar(){
        // Usando los datos del producto en cuestión, haremos la gestión del pago teniendo en cuenta los descuentos
        // llamando al método aplicarDescuento.
    }
}