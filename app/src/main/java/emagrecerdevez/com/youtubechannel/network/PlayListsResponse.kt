package emagrecerdevez.com.youtubechannel.network

import android.content.Context
import android.util.Log
import emagrecerdevez.com.youtubechannel.data.dynamic.UtilDatabase
import emagrecerdevez.com.youtubechannel.model.PlayList
import emagrecerdevez.com.youtubechannel.model.parse.playlist.PlayListsParse
import emagrecerdevez.com.youtubechannel.ui.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Trabalha a resposta do servidor do YouTube à requisição
 * de dados de PlayLists liberadas no canal.
 *
 * @property context contexto do aplicativo.
 * @property callbackSuccess callback que deve ser
 * executado em caso de resposta bem sucedida.
 * @property callbackFailure callback que deve ser
 * executado em caso de resposta falha.
 * @constructor cria um objeto completo do tipo
 * PlayListsResponse.
 */
class PlayListsResponse(
        private val context: Context,
        private val callbackSuccess: (List<PlayList>)->Unit = {},
        private val callbackFailure: (NetworkRetrieveDataProblem)->Unit = {}
    ) : Callback<PlayListsParse> {

    override fun onResponse(
        call: Call<PlayListsParse>,
        response: Response<PlayListsParse> ){
        parse( response = response )
    }

    override fun onFailure(
        call: Call<PlayListsParse>,
        t: Throwable ){
        Log.i(MainActivity.LOG_TAG, "t: ${t.message}")
        callbackFailure( NetworkRetrieveDataProblem.NO_INTERNET_CONNECTION )
    }

    /**
     * Cria uma nova lista de PlayLists em app (incluindo no
     * banco de dados local) caso a resposta do YouTube à
     * requisição de dados de PlayLists disponíveis seja bem
     * sucedida.
     *
     * @param response resposta do backend YouTube já com o
     * parse Gson aplicado.
     */
    fun parse( response: Response<PlayListsParse> ){

        if( response.isSuccessful ){
            val playListParse = response.body()!!

            if( playListParse.items.isNotEmpty() ){
                val playLists = mutableListOf<PlayList>()

                playListParse.items.map{
                    playLists.add(
                        PlayList(
                            uid = it.id,
                            title = it.title
                        )
                    )
                }

                UtilDatabase
                    .getInstance( context = context )
                    .savePlayLists( playLists = playLists )

                callbackSuccess( playLists )
            }
            else{
                callbackFailure( NetworkRetrieveDataProblem.NO_PLAYLISTS )
            }
        }
        else{
            callbackFailure( NetworkRetrieveDataProblem.NO_INTERNET_CONNECTION )
        }
    }
}