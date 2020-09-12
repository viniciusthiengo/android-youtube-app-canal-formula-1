package formula1.com.youtubechannel.data.fixed

import android.content.res.Resources
import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.model.Circuit

/**
 * Contém os dados dos circuitos da temporada
 * da Formula 1.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados dos circuitos.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novos grupos)
 * e com espaços de tempo longos entre as alterações,
 * então a melhor escolha foi o trabalho deles em
 * uma classe estática (companion object) que
 * trabalha como se fosse uma persistência de dados
 * estáticos.
 */
abstract class CircuitsData {

    companion object{
        /**
         * Retorna os circuitos Formula 1.
         *
         * @return lista não mutável de objetos
         * [Circuit].
         */
        fun getCircuits( res: Resources )
            = listOf(
                Circuit(
                    name = res.getString( R.string.grand_prix_spain_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_spain_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_spain_circuit_laps ),
                    appUri = "geo:41.568386,2.257148?z=14",
                    logo = R.drawable.ic_grand_prix_spain
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_british_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_british_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_british_circuit_laps ),
                    appUri = "google.streetview:panoid=uuyC1meP9ZmbqQd2Ja_pdQ",
                    logo = R.drawable.ic_grand_prix_british
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_austria_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_austria_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_austria_circuit_laps ),
                    appUri = "google.streetview:panoid=8iy5DWuMERRI4GLOHzPrAQ",
                    logo = R.drawable.ic_grand_prix_austria
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_hungary_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_hungary_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_hungary_circuit_laps ),
                    appUri = "geo:47.582093,19.250562?z=14",
                    logo = R.drawable.ic_grand_prix_hungary
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_belgium_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_belgium_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_belgium_circuit_laps ),
                    appUri = "geo:50.437067,5.972030?z=14",
                    logo = R.drawable.ic_grand_prix_belgium
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_italy_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_italy_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_italy_circuit_laps ),
                    appUri = "google.streetview:panoid=7XPiTT1Bb-cPqRABXTdToQ",
                    logo = R.drawable.ic_grand_prix_italy
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_tuscan_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_tuscan_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_tuscan_circuit_laps ),
                    appUri = "geo:43.996221,11.371082?z=14",
                    logo = R.drawable.ic_grand_prix_tuscan
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_russian_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_russian_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_russian_circuit_laps ),
                    appUri = "google.streetview:panoid=wuATMoMcQUaAg2tZtd5l0w",
                    logo = R.drawable.ic_grand_prix_russian
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_germany_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_germany_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_germany_circuit_laps ),
                    appUri = "geo:50.334290,6.942610?z=14",
                    logo = R.drawable.ic_grand_prix_germany
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_portugal_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_portugal_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_portugal_circuit_laps ),
                    appUri = "geo:37.231632,-8.628392?z=14",
                    logo = R.drawable.ic_grand_prix_portugal
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_emilia_romagna_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_emilia_romagna_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_emilia_romagna_circuit_laps ),
                    appUri = "google.streetview:panoid=BQMXpbyPOUavEzjU1f4wbQ",
                    logo = R.drawable.ic_grand_prix_emilia_romagna
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_turkey_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_turkey_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_turkey_circuit_laps ),
                    appUri = "geo:40.958092,29.411653?z=14",
                    logo = R.drawable.ic_grand_prix_turkey
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_bahrain_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_bahrain_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_bahrain_circuit_laps ),
                    appUri = "geo:26.032197,50.512853?z=14",
                    logo = R.drawable.ic_grand_prix_bahrain
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_bahrain_rolex_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_bahrain_rolex_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_bahrain_rolex_circuit_laps ),
                    appUri = "geo:26.032197,50.512853?z=14",
                    logo = R.drawable.ic_grand_prix_bahrain_rolex
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_abu_dhabi_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_abu_dhabi_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_abu_dhabi_circuit_laps ),
                    appUri = "geo:24.481397,54.615535?z=14",
                    logo = R.drawable.ic_grand_prix_abu_dhabi
                )
            )
    }
}