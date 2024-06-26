// Função SET - Atribui um valor ao campo correspondente.
// Função GET - Retorna o valor do campo correspondente.
// Função Field  - Evita chamadas infinitas.

class Planeta(var nome:String){
    private var id= 1
    var tamanho = 1000
    var fala = "Terra"
        get(){
            println("Acessando GET")
            return field
        }
        set(value){
            println("Acessando SET")
            field = value
        }
}
class Planeta2{
    var nome : String = "Ven"
        get(){
            println("Meu valor é $field")
            return field
        }
        set(value){
            if (value  == ""){
                println("Todo planeta tem um nome")
            }else{
                field = value
            }
        }
}
fun main() {
    var  p:Planeta = Planeta("Terra")
    println("Imprimindo o tamanho ${p.tamanho}")
    var a: Planeta = Planeta("Marte")
    a.fala
    a.fala  = "Movo Planeta Marte"
    println("------------------------------------------------")

    var p2:Planeta2 = Planeta2()
    p2.nome = ""         // Recebe valor
    println(p2.nome)    // Imprime o valor
    p2.nome = "Júpiter" // Recebe valor
    println(p2.nome)   // Imprime o valor

}