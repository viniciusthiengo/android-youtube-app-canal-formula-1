package formula1.com.youtubechannel.ui.fragment

import android.os.Bundle
import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.data.fixed.StoreData
import formula1.com.youtubechannel.ui.adapter.ListItemAdapter

/**
 * Contém a listagem de lojas online da Formula 1.
 *
 * @constructor cria um objeto completo do tipo
 * [StoreFragment].
 */
class StoreFragment : FrameworkListFragment() {

    companion object {
        /**
         * Constante com o identificador único do
         * fragmento [StoreFragment] para que
         * ele seja encontrado na pilha de fragmentos
         * e assim não seja necessária a construção
         * de mais de um objeto deste fragmento em
         * memória enquanto o aplicativo estiver em
         * execução.
         */
        const val KEY = "StoreFragment_key"
    }

    override fun onActivityCreated(
        savedInstanceState: Bundle? ){
        super.onActivityCreated( savedInstanceState )

        setUiModel(
            titleText = getString( R.string.store_content_title ),
            subTitleText = getString( R.string.store_desc )
        )

        val adapter = ListItemAdapter(
            context = activity!!,
            items = StoreData.getStore(),
            callExternalAppCallback = {
                item -> callExternalApp(
                    webUri = item.getWebUri(),
                    appUri = item.getAppUri(),
                    failMessage = String.format(
                        getString( R.string.store_toast_alert )
                    )
                )
            }
        )

        initList( adapter = adapter )
    }
}