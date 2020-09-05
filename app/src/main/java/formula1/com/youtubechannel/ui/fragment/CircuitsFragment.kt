package formula1.com.youtubechannel.ui.fragment

import android.os.Bundle
import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.data.fixed.CircuitsData
import formula1.com.youtubechannel.model.Circuit
import formula1.com.youtubechannel.ui.adapter.ListItemAdapter

/**
 * Contém a listagem de circuitos da Formula 1.
 *
 * @constructor cria um objeto completo do tipo
 * [CircuitsFragment].
 */
class CircuitsFragment : FrameworkListFragment() {

    companion object {
        /**
         * Constante com o identificador único do
         * fragmento [CircuitsFragment] para que
         * ele seja encontrado na pilha de fragmentos
         * e assim não seja necessária a construção
         * de mais de um objeto deste fragmento em
         * memória enquanto o aplicativo estiver em
         * execução.
         */
        const val KEY = "CircuitsFragment_key"
    }

    override fun onActivityCreated(
        savedInstanceState: Bundle? ){
        super.onActivityCreated( savedInstanceState )

        setUiModel(
            titleText = getString( R.string.circuits_content_title ),
            subTitleText = getString( R.string.circuits_desc )
        )

        val adapter = ListItemAdapter(
            context = activity!!,
            items = CircuitsData.getCircuits( resources ),
            callExternalAppCallback = {
                item -> callExternalApp(
                    webUri = item.getWebUri(),
                    failMessage = String.format(
                        getString( R.string.circuits_toast_alert ),
                        (item as Circuit).place,
                        item.name
                    )
                )
            },
            R.layout.list_item_big_image
        )
        initList( adapter = adapter )
    }
}