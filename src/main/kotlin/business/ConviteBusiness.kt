package business

import entity.Convidado

class ConviteBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun codigoValido(convite: Convidado): Boolean {
        return when (convite.tipo) {
            "comum" -> convite.codigo.startsWith("xt")
            "premium", "luxo" -> convite.codigo.startsWith("xl")
            else -> false
        }
    }

    fun maiorDeIdade(idade: Int) = idade <= 18
}