package emagrecerdevez.com.youtubechannel.ui.fragment

import android.os.Bundle
import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.data.fixed.SocialNetworksData
import emagrecerdevez.com.youtubechannel.model.SocialNetwork
import emagrecerdevez.com.youtubechannel.ui.adapter.ListItemAdapter

/**
 * Contém a lista de redes do canal YouTube do
 * app.
 *
 * @constructor cria um objeto completo do tipo
 * SocialNetworksFragment.
 */
class SocialNetworksFragment : FrameworkListFragment() {

    companion object {
        /**
         * Constante com o identificador único do
         * fragmento SocialNetworksFragment para que
         * ele seja encontrado na pilha de fragmentos
         * e assim não seja necessária a construção
         * de mais de um objeto deste fragmento em
         * memória enquanto o aplicativo estiver em
         * execução.
         */
        const val KEY = "SocialNetworksFragment_key"
    }

    override fun onActivityCreated(
        savedInstanceState: Bundle? ){
        super.onActivityCreated( savedInstanceState )

        setUiModel(
            titleText = getString( R.string.social_networks_content_title )
        )

        val adapter = ListItemAdapter(
            context = activity!!,
            items = SocialNetworksData.getNetworks(),
            callExternalAppCallback = {
                item -> callExternalApp(
                    webUri = item.getWebUri(),
                    appUri = item.getAppUri(),
                    failMessage = String.format(
                        getString( R.string.social_network_toast_alert ),
                        (item as SocialNetwork).network
                    )
                )
            }
        )
        initList( adapter = adapter )
    }
}