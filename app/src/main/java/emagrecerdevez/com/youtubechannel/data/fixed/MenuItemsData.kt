package emagrecerdevez.com.youtubechannel.data.fixed

import android.content.res.Resources
import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.model.MenuItem
import emagrecerdevez.com.youtubechannel.model.MenuItemStatus

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
         * MenuItem.
         */
        fun getItems( res: Resources )
            = listOf(
                MenuItem(
                    id = R.id.last_video,
                    label = res.getString( R.string.item_menu_last_video ),
                    icon = R.drawable.ic_video_player,
                    isSelected = MenuItemStatus.SELECTED
                ),
                MenuItem(
                    id = R.id.social_networks,
                    label = res.getString( R.string.item_menu_social_networks ),
                    icon = R.drawable.ic_social_networks
                ),
                MenuItem(
                    id = R.id.play_lists,
                    label = res.getString( R.string.item_menu_play_lists ),
                    icon = R.drawable.ic_playlist_color
                ),
                MenuItem(
                    id = R.id.exclusive_groups,
                    label = res.getString( R.string.item_menu_exclusive_groups ),
                    icon = R.drawable.ic_tribe_color
                ),
                MenuItem(
                    id = R.id.books,
                    label = res.getString( R.string.item_menu_books ),
                    icon = R.drawable.ic_book_cover_color
                ),
                MenuItem(
                    id = R.id.courses,
                    label = res.getString( R.string.item_menu_courses ),
                    icon = R.drawable.ic_courses_color
                ),
                MenuItem(
                    id = R.id.about_channel,
                    label = res.getString( R.string.item_menu_about_channel ),
                    icon = R.drawable.ic_about
                ),
                MenuItem(
                    id = R.id.business,
                    label = res.getString( R.string.item_menu_business ),
                    icon = R.drawable.ic_business
                )
            )
    }
}