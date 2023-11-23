package com.example.rvsec3.Models

class Pokemon {

    var Nombre:String? = null
    var Numero:String? = null
    var Categoria:String? = null
    var Habilidad:String? = null
    var Imagen:Int? = null

    constructor(Nombre: String?, Numero: String?, Categoria: String?, Habilidad: String?, Imagen: Int?) {
        this.Nombre = Nombre
        this.Numero = Numero
        this.Categoria = Categoria
        this.Habilidad = Habilidad
        this.Imagen = Imagen
    }
}