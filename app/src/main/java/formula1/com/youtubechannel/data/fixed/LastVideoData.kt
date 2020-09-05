package formula1.com.youtubechannel.data.fixed

import formula1.com.youtubechannel.model.LastVideo

/**
 * Contém o vídeo inicial que deve ser carregado
 * junto ao aplicativo enquanto um vídeo mais
 * atual não é enviado (ou acessado) a ele.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados de algum vídeo do canal YouTube do
 * app. Assim o usuário sempre terá algum
 * "último" vídeo disponível para acesso, mesmo
 * quando ainda não foi retornado (ou acessado)
 * os dados do vídeo mais atual já disponível
 * no canal.
 */
class LastVideoData {

    companion object{
        /**
         * Retorna o "último" vídeo disponível
         * por padrão no aplicativo
         *
         * @return objeto do tipo [LastVideo].
         */
        fun getInitialVideo()
            = LastVideo(
                uid = "yWfUg5ja90k",
                title = "Top 10 Moments of Pit Lane Drama",
                description = "The quest to shave off precious " +
                        "milliseconds in the pits is always a " +
                        "dangerous game. Get it right, and you " +
                        "might prosper. Get it wrong, and, well, " +
                        "here are ten examples..."
            )
            .apply {
                thumbUrl = ""
            }
    }
}