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
                    name = res.getString( R.string.grand_prix_austria_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_austria_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_austria_circuit_laps ),
                    //webUri = "geo:47.220326,14.765198?z=14",
                    webUri = "google.streetview:panoid=8iy5DWuMERRI4GLOHzPrAQ",
                    //webUri = "https://plus.codes/8FVP6QC8+33",
                    logo = R.drawable.ic_grand_prix_austria
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_hungary_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_hungary_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_hungary_circuit_laps ),
                    webUri = "geo:47.582093,19.250562?z=14",
                    //webUri = "google.streetview:panoid=AF1QipO96WPu6SZi0eXGvp3xjAPXnTsMqjLJn0RvVEyy",
                    //webUri = "https://plus.codes/8FVXH7J2+M6",
                    logo = R.drawable.ic_grand_prix_hungary
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_belgium_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_belgium_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_belgium_circuit_laps ),
                    webUri = "geo:50.437067,5.972030?z=14",
                    //webUri = "google.streetview:panoid=AF1QipPu7bzpoa1OqrTGjVNq0SICWLA4H4oR5aLUPQs1",
                    //webUri = "https://plus.codes/9F27CXPC+QR",
                    logo = R.drawable.ic_grand_prix_belgium
                ),
                Circuit(
                    name = res.getString( R.string.grand_prix_italy_circuit_name ),
                    kmLength = res.getString( R.string.grand_prix_italy_circuit_km_length ),
                    laps = res.getString( R.string.grand_prix_italy_circuit_laps ),
                    //webUri = "geo:45.621925,9.284770?z=14",
                    webUri = "google.streetview:panoid=7XPiTT1Bb-cPqRABXTdToQ",
                    //webUri = "https://plus.codes/8FQFJ7CM+PW",
                    logo = R.drawable.ic_grand_prix_italy
                )
            )
    }
}