package formula1.com.youtubechannel.data.fixed

import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.model.SocialNetwork

/**
 * Contém os dados das outras redes (sociais ou sites),
 * vinculados ao canal YouTube do aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados dessas outras redes.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novas redes)
 * e com espaços de tempo longos entre as alterações,
 * então a melhor escolha foi o trabalho deles em
 * uma classe estática (companion object) que
 * trabalha como se fosse uma persistência de dados
 * estáticos.
 */
abstract class SocialNetworksData {

    companion object{
        /**
         * Retorna todas as redes vinculadas ao
         * canal.
         *
         * @return lista não mutável de objetos
         * [SocialNetwork].
         */
        fun getNetworks()
            = listOf(
                SocialNetwork(
                    network = "Site oficial",
                    accountName = "Formula1.com",
                    webUri = "https://www.formula1.com/",
                    logo = R.drawable.ic_f1_blog_color
                ),
                SocialNetwork(
                    network = "Facebook",
                    accountName = "/Formula1",
                    webUri = "https://www.facebook.com/Formula1",
                    logo = R.drawable.ic_facebook_color
                ),
                SocialNetwork(
                    network = "Twitter",
                    accountName = "/F1",
                    webUri = "https://twitter.com/f1",
                    logo = R.drawable.ic_twitter_color
                ),SocialNetwork(
                    network = "Instagram",
                    accountName = "/F1",
                    webUri = "https://www.instagram.com/f1/",
                    logo = R.drawable.ic_instagram_color
                ),
                SocialNetwork(
                    network = "YouTube",
                    accountName = "/F1",
                    webUri = "https://www.youtube.com/F1",
                    logo = R.drawable.ic_youtube_color
                )
            )
    }
}