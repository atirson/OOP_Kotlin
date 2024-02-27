package control

import business.ConviteBusiness
import entity.Convidado

class Portaria {
    private val conviteBusiness = ConviteBusiness()

    init {
        println("Portaria inicializada.")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual a sua idade? ")
        val convidado = Convidado(idade = idade)
        if (conviteBusiness.maiorDeIdade(idade)) {
            return "Proibido para menores de 18 anos!"
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if (!conviteBusiness.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido!"
        }

        convidado.codigo = Console.readString("Qual é o código do convite? ")
        if (!conviteBusiness.codigoValido(convidado)) {
            return "Negado. Convite inválido!"
        }

        return "Welcome!"
    }
}