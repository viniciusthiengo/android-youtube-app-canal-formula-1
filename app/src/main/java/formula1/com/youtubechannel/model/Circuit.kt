package formula1.com.youtubechannel.model

import android.content.res.Resources
import android.net.Uri

/**
 * Um circuito da temporada da Fórmula 1.
 *
 * O objetivo desta classe (objetos desta classe)
 * é manter os principais dados do circuito para que
 * o seguidor tenha mais entretenimento no app.
 *
 * @property place app que abrirá o circuito em tela.
 * @property name nome do circuito.
 * @property kmLength tamanho, km, do circuito.
 * @property laps número de voltas no circuito.
 * @property webUri maps URI API para abrir o mapa
 * ou o StreetView.
 * @property logo imagem do circuito.
 * @constructor cria um objeto completo do tipo
 * [Circuit].
 */
class Circuit(
    val place: String = "Google Maps",
    val name: String,
    val kmLength: String,
    val laps: String,
    private val webUri: String,
    private val logo: Int ) : ListItem {

    override fun getMainText()
        = name

    override fun getFirstAuxText()
        = kmLength

    override fun getSecondAuxText( resource: Resources )
        = laps

    override fun getWebUri()
        = Uri.parse( webUri )

    override fun getIcon()
        = logo
}