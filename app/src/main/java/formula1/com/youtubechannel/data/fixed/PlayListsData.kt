package formula1.com.youtubechannel.data.fixed

import formula1.com.youtubechannel.model.PlayList

/**
 * Contém as principais PlayLists vinculadas ao
 * canal YouTube do aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados das principais PlayLists do canal.
 *
 * Pois devido às limitações da YouTube Data API
 * é importante ter também em app os dados das
 * principais PlayLists e assim ter certeza que
 * o usuário terá acesso a elas.
 */
class PlayListsData {

    companion object{
        /**
         * Retorna as principais PlayLists
         * vinculadas ao canal.
         *
         * @return lista mutável de objetos
         * [PlayList].
         */
        fun getInitialPlayLists()
            = mutableListOf(
                PlayList(
                    title = "F1 Esports 2020",
                    uid = "PLfoNZDHitwjXAEbWFSL4hJsUnkF14y_rw"
                ),
                PlayList(
                    title = "2020 F1 Pole Positions | Onboard Hot Laps",
                    uid = "PLfoNZDHitwjUG6Nq8W0XLC_ke3s90wb3M"
                ),
                PlayList(
                    title = "Fernando Alonso Returns to F1!",
                    uid = "PLfoNZDHitwjVHvU4_yRzxojvLKbsKWDxZ"
                ),
                PlayList(
                    title = "Best Team Radio 2020",
                    uid = "PLfoNZDHitwjWck2ndC4PdIN3-c9ccbIgB"
                ),
                PlayList(
                    title = "Formula 1 Rolex Belgian Grand Prix 2020",
                    uid = "PLfoNZDHitwjV0jtnJr3410xKMT8It8_HZ"
                ),
                PlayList(
                    title = "Formula 1 Aramco Gran Premio De España 2020",
                    uid = "PLfoNZDHitwjWFvaGTH2tZLHlUfqN8t90k"
                ),
                PlayList(
                    title = "Emirates Formula 1 70th Anniversary Grand Prix 2020",
                    uid = "PLfoNZDHitwjX6EY2Sfdn6tHy9zFbnCnrd"
                ),
                PlayList(
                    title = "What F1 Feels Like",
                    uid = "PLfoNZDHitwjXvx_7bXfxatL8vE7dfJMRN"
                ),
                PlayList(
                    title = "The Legends",
                    uid = "PLfoNZDHitwjWnlZdS3mk5ttOZlqkLr9Nz"
                ),
                PlayList(
                    title = "F1 70th Anniversary",
                    uid = "PLfoNZDHitwjUynZnW8XMmbhvnK1Qi2nR7"
                ),
                PlayList(
                    title = "2021 Driver Moves",
                    uid = "PLfoNZDHitwjUnV6lmfFRHUOztgyXrVbd1"
                ),
                PlayList(
                    title = "F1 Challenge Series 2020",
                    uid = "PLfoNZDHitwjVgUCeBbSOaLihLI3Jvh-B7"
                ),
                PlayList(
                    title = "F1 Classics",
                    uid = "PLfoNZDHitwjUlydEe_RAZ2IgaKCIDxoUd"
                ),
                PlayList(
                    title = "F1 Virtual GPs 2020",
                    uid = "PLfoNZDHitwjU1moRPhV163T1QHTpkui89"
                ),
                PlayList(
                    title = "F1 Rewind!",
                    uid = "PLfoNZDHitwjXSniIQHvZPchn056vJq_Dn"
                ),
                PlayList(
                    title = "2020 FIA Formula 3 Championship",
                    uid = "PLfoNZDHitwjXjQ9cvNSinbW6ezSKjxM8y"
                ),
                PlayList(
                    title = "2020 FIA Formula 2 Championship",
                    uid = "PLfoNZDHitwjVGnDvKlYNZUIK4f7UK1iLC"
                ),
                PlayList(
                    title = "Formula 1 Rolex Grosser Preis Von Österreich 2020",
                    uid = "PLfoNZDHitwjXMBeShm_2iOq34Q7dlXmBA"
                ),
                PlayList(
                    title = "Formula 1 Pirelli Grosser Preis Der Steiermark 2020",
                    uid = "PLfoNZDHitwjWvN5xRm8-xTyrScl2ybuAZ"
                ),
                PlayList(
                    title = "Formula 1 Rolex Australian Grand Prix 2020",
                    uid = "PLfoNZDHitwjW_JfXMrZUDlp8lwrjPkcWa"
                ),
                PlayList(
                    title = "F1 2020 Race Highlights",
                    uid = "PLfoNZDHitwjXRANMnqmL0BzNGianZ2eX_"
                ),
                PlayList(
                    title = "2020 F1 Season Preview",
                    uid = "PLfoNZDHitwjWx_vptWVzoyuL8GVGglV0h"
                ),
                PlayList(
                    title = "Team Guides",
                    uid = "PLfoNZDHitwjVoXLlvVcfG1MbZn80BOGj6"
                ),
                PlayList(
                    title = "F1 Testing 2020",
                    uid = "PLfoNZDHitwjXh_17yB_bI-hHXt3t1lgQb"
                ),
                PlayList(
                    title = "F1 2020 Car Launches!",
                    uid = "PLfoNZDHitwjXbQQB7Rh43PX8kVoueMkcR"
                ),
                PlayList(
                    title = "Best of 2019!",
                    uid = "PLfoNZDHitwjXID63aL08SfW3TqunE649p"
                ),
                PlayList(
                    title = "F1 x Complex",
                    uid = "PLfoNZDHitwjXWM6U-UTowz2gO2m7Oi4oS"
                ),
                PlayList(
                    title = "Grill The Grid 2019",
                    uid = "PLfoNZDHitwjUAibL7oIg4TCX1QkWdTcak"
                ),
                PlayList(
                    title = "F1 Esports 2019",
                    uid = "PLfoNZDHitwjXw9KWL4nIoTGhogXtztEhe"
                ),
                PlayList(
                    title = "The Best Of Team Radio 2019!",
                    uid = "PLfoNZDHitwjU7xYE4FdrweH8aGaT2z7IT"
                ),
                PlayList(
                    title = "Niki Lauda, 1949-2019",
                    uid = "PLfoNZDHitwjVeh3xLJtXqup7iTAwdV4e3"
                ),
                PlayList(
                    title = "FIA Formula 3 Championship",
                    uid = "PLfoNZDHitwjUzp1jZH8p8PMXpVVC-Aj-K"
                ),
                PlayList(
                    title = "2019 F1 Pole Positions | Onboard Hot Laps",
                    uid = "PLfoNZDHitwjUA9aqbPGKw1l4SIz2bACi_"
                ),
                PlayList(
                    title = "Formula 1 Etihad Airways Abu Dhabi Grand Prix 2019",
                    uid = "PLfoNZDHitwjUjlVjVvtXTtIhct2_1AhZy"
                ),
                PlayList(
                    title = "Formula 1 Grande Premio Heineken do Brasil 2019",
                    uid = "PLfoNZDHitwjVf0YMtgh1es9I4oDORsmS5"
                ),
                PlayList(
                    title = "Formula 1 United States Grand Prix 2019",
                    uid = "PLfoNZDHitwjWhH_FA5GArjph8k992Sxrt"
                ),
                PlayList(
                    title = "Formula 1 Gran Premio de Mexico 2019",
                    uid = "PLfoNZDHitwjXI1gchbZgf-hlrKXHdXvlw"
                ),
                PlayList(
                    title = "Formula 1 Japanese Grand Prix 2019",
                    uid = "PLfoNZDHitwjXlgY0rzRl-UomhV8vz6glb"
                )
            )
    }
}