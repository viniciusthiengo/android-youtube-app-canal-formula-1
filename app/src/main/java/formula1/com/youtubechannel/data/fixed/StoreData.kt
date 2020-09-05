package formula1.com.youtubechannel.data.fixed

import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.model.Store

/**
 * Contém os dados de lojas da Formula 1.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * todos os dados de lojas.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novos contatos)
 * e com espaços de tempo longos entre as alterações,
 * então a melhor escolha foi o trabalho deles em
 * uma classe estática (companion object) que
 * trabalha como se fosse uma persistência de dados
 * estáticos.
 */
abstract class StoreData {

    companion object{
        /**
         * Retorna a loja Formula 1.
         *
         * @return lista não mutável de objetos
         * [Store].
         */
        fun getStore()
            = listOf(
                Store(
                    name = "F1 Store",
                    webUri = "https://f1store4.formula1.com/",
                    logo = R.drawable.ic_overall
                )
            )
    }
}