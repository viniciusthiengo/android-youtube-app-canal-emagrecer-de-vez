package emagrecerdevez.com.youtubechannel.ui.fragment

import android.os.Bundle
import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.data.fixed.GroupsData
import emagrecerdevez.com.youtubechannel.model.Group
import emagrecerdevez.com.youtubechannel.ui.adapter.ListItemAdapter

/**
 * Contém a lista de grupos do canal YouTube do
 * app.
 *
 * @constructor cria um objeto completo do tipo
 * GroupsFragment.
 */
class GroupsFragment : FrameworkListFragment() {

    companion object {
        /**
         * Constante com o identificador único do
         * fragmento GroupsFragment para que
         * ele seja encontrado na pilha de fragmentos
         * e assim não seja necessária a construção
         * de mais de um objeto deste fragmento em
         * memória enquanto o aplicativo estiver em
         * execução.
         */
        const val KEY = "GroupsFragment_key"
    }

    override fun onActivityCreated(
        savedInstanceState: Bundle? ){
        super.onActivityCreated( savedInstanceState )

        setUiModel(
            titleText = getString( R.string.groups_content_title ),
            subTitleText = getString( R.string.groups_desc )
        )

        val adapter = ListItemAdapter(
            context = activity!!,
            items = GroupsData.getGroups(),
            callExternalAppCallback = {
                item -> callExternalApp(
                    webUri = item.getWebUri(),
                    failMessage = String.format(
                        getString( R.string.groups_toast_alert ),
                        (item as Group).place,
                        item.name
                    )
                )
            }
        )
        initList( adapter = adapter )
    }
}