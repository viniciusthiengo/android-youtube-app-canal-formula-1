package formula1.com.youtubechannel.data.fixed

import android.content.res.Resources
import formula1.com.youtubechannel.R
import formula1.com.youtubechannel.model.MenuItem
import formula1.com.youtubechannel.model.MenuItemStatus

/**
 * Contém os dados dos itens do menu principal
 * do aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados de itens.
 *
 * Como esses dados praticamente não sofrem
 * alterações depois do lançamento do aplicativo,
 * então a melhor escolha foi o trabalho deles
 * em uma classe estática (companion object)
 * que trabalha como se fosse uma persistência
 * de dados estáticos.
 */
class MenuItemsData {

    companion object{
        /**
         * Retorna os itens do menu principal
         * do app.
         *
         * @return lista não mutável de objetos
         * [MenuItem].
         */
        fun getItems( res: Resources )
            = listOf(
                MenuItem(
                    id = R.id.last_video,
                    label = res.getString( R.string.item_menu_last_video ),
                    icon = R.drawable.ic_helmet,
                    isSelected = MenuItemStatus.SELECTED
                ),
                MenuItem(
                    id = R.id.play_lists,
                    label = res.getString( R.string.item_menu_play_lists ),
                    icon = R.drawable.ic_play_lists
                ),
                MenuItem(
                    id = R.id.social_networks,
                    label = res.getString( R.string.item_menu_social_networks ),
                    icon = R.drawable.ic_social_networks
                ),
                MenuItem(
                    id = R.id.circuits,
                    label = res.getString( R.string.item_menu_circuits ),
                    icon = R.drawable.ic_circuits
                ),
                MenuItem(
                    id = R.id.partners,
                    label = res.getString( R.string.item_menu_partners ),
                    icon = R.drawable.ic_partners
                ),
                MenuItem(
                    id = R.id.store,
                    label = res.getString( R.string.item_menu_store ),
                    icon = R.drawable.ic_store
                )
            )
    }
}