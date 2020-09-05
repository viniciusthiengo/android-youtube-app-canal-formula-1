package formula1.com.youtubechannel.model

import android.net.Uri

/**
 * Objeto loja da Formula 1.
 *
 * @property name nome da loja.
 * @property webUri URL da loja.
 * @property logo ícone que identifica a loja.
 * @constructor cria um objeto completo do tipo
 * [Store].
 */
class Store(
    val name: String,
    private val webUri: String,
    private val logo: Int ) : ListItem {

    override fun getMainText()
        = name

    override fun getWebUri()
        = Uri.parse( webUri )

    override fun getIcon()
        = logo
}