package formula1.com.youtubechannel.model

import android.net.Uri

/**
 * Empresa parceira da Formula 1.
 *
 * O objetivo desta classe (objetos desta classe)
 * é apenas manter os dados importantes para a
 * apresentação da empresa parceira à Formula 1.
 *
 * @property name nome da empresa / marca.
 * @property webPage URL da página Web oficial
 * da empresa.
 * @property logo identificador único do logo
 * da empresa.
 * @constructor cria um objeto completo do tipo
 * [Partner].
 */
class Partner(
    val name: String,
    private val webPage: String,
    private val logo: Int ) : ListItem {

    override fun getMainText()
        = name

    override fun getWebUri()
        = Uri.parse( webPage )

    override fun getIcon()
        = logo
}