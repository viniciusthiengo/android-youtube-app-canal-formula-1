package formula1.com.youtubechannel.ui.fragment

import android.os.Bundle
import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.data.fixed.PartnersData
import formula1.com.youtubechannel.model.Partner
import formula1.com.youtubechannel.ui.adapter.ListItemAdapter

/**
 * Contém a lista de parceiros da Formula 1.
 *
 * @constructor cria um objeto completo do tipo
 * [PartnersFragment].
 */
class PartnersFragment : FrameworkListFragment() {

    companion object {
        /**
         * Constante com o identificador único do
         * fragmento [PartnersFragment] para que
         * ele seja encontrado na pilha de fragmentos
         * e assim não seja necessária a construção
         * de mais de um objeto deste fragmento em
         * memória enquanto o aplicativo estiver em
         * execução.
         */
        const val KEY = "PartnersFragment_key"
    }

    override fun onActivityCreated(
        savedInstanceState: Bundle? ){
        super.onActivityCreated( savedInstanceState )

        setUiModel(
            titleText = getString( R.string.partners_content_title )
        )

        val adapter = ListItemAdapter(
            context = activity!!,
            items = PartnersData.getBooks( resources ),
            callExternalAppCallback = {
                item -> callExternalApp(
                    webUri = item.getWebUri(),
                    failMessage = String.format(
                        getString( R.string.partners_toast_alert ),
                        (item as Partner).name
                    )
                )
            }
        )
        initList( adapter = adapter )
    }
}