package formula1.com.youtubechannel.data.fixed

import android.content.res.Resources
import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.model.Partner

/**
 * Contém os dados das empresas parceiras da
 * Formula 1 na temporada.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados das empresas parceiras.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novos livros)
 * e com espaços de tempo longos entre as
 * alterações, então a melhor escolha foi o trabalho
 * deles em uma classe estática (companion object)
 * que trabalha como se fosse uma persistência de
 * dados estáticos.
 */
abstract class PartnersData {

    companion object {
        /**
         * Retorna todos os parceiros da Formula 1.
         *
         * @return lista não mutável de objetos
         * [Partner].
         */
        fun getBooks( res: Resources )
            = listOf(
                Partner(
                    name = res.getString( R.string.partner_rolex ),
                    webPage = "https://www.rolex.com/",
                    logo = R.drawable.ic_logo_rolex
                ),
                Partner(
                    name = res.getString( R.string.partner_dhl ),
                    webPage = "https://www.dhl.com/",
                    logo = R.drawable.ic_logo_dhl
                ),
                Partner(
                    name = res.getString( R.string.partner_aramco ),
                    webPage = "https://www.aramco.com/",
                    logo = R.drawable.ic_logo_aramco
                ),
                Partner(
                    name = res.getString( R.string.partner_pirelli ),
                    webPage = "https://www.pirelli.com/",
                    logo = R.drawable.ic_logo_pirelli
                ),
                Partner(
                    name = res.getString( R.string.partner_emirates ),
                    webPage = "https://www.emirates.com/",
                    logo = R.drawable.ic_logo_emirates
                ),
                Partner(
                    name = res.getString( R.string.partner_heineken ),
                    webPage = "https://www.theheinekencompany.com/",
                    logo = R.drawable.ic_logo_heineken
                ),
                Partner(
                    name = res.getString( R.string.partner_aws ),
                    webPage = "https://aws.amazon.com/",
                    logo = R.drawable.ic_logo_aws
                ),
                Partner(
                    name = res.getString( R.string.partner_expo_2020 ),
                    webPage = "https://www.expo2020dubai.com/",
                    logo = R.drawable.ic_logo_expo_2020_dubai_uae
                ),
                Partner(
                    name = res.getString( R.string.partner_amg ),
                    webPage = "https://www.mercedes-amg.com/",
                    logo = R.drawable.ic_logo_amg
                ),
                Partner(
                    name = res.getString(
                        R.string.partner_caterpillar
                    ),
                    webPage = "https://www.caterpillar.com/",
                    logo = R.drawable.ic_logo_caterpillar
                ),
                Partner(
                    name = res.getString( R.string.partner_188_bet ),
                    webPage = "https://www.188bet.com/",
                    logo = R.drawable.ic_logo_188_bet
                ),
                Partner(
                    name = res.getString( R.string.partner_citibank ),
                    webPage = "https://corporateportal.brazil.citibank" +
                            ".com/index.htm",
                    logo = R.drawable.ic_logo_citibank
                ),
                Partner(
                    name = res.getString( R.string.partner_petronas ),
                    webPage = "https://www.petronas.com/",
                    logo = R.drawable.ic_logo_petronas
                )
            )
    }
}