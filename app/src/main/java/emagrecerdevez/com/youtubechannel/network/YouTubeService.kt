package emagrecerdevez.com.youtubechannel.network

import emagrecerdevez.com.youtubechannel.config.YouTubeConfig
import emagrecerdevez.com.youtubechannel.model.parse.playlist.PlayListsParse
import emagrecerdevez.com.youtubechannel.model.parse.video.VideoParse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Interface responsável por definir a API de comunicação
 * remota do aplicativo para ser utilizada junto à
 * biblioteca Retrofit.
 */
interface YouTubeService {

    /**
     * Invoca dados de "último vídeo" disponível de acordo
     * com os parâmetros query informados.
     *
     * @param key chave de API de desenvolvedor Google.
     * @param channelId identificador único do canal.
     * @param part trecho de dados que deve estar presente
     * em recurso vídeo retornado.
     * @param maxResults número máximo de videos.
     * @param order dado de ordenação dos resultados.
     * @return todos os dados da resposta do servidor
     * remoto - em objeto Call<VideoParse>.
     */
    @GET( value = YouTubeConfig.ApiV3.VIDEO_PATH )
    fun lastVideo(
        @Query("key")
        key: String = YouTubeConfig.Key.GOOGLE_DEV,
        @Query("channelId")
        channelId: String = YouTubeConfig.Channel.CHANNEL_ID,
        @Query("part")
        part: String = YouTubeConfig.ApiV3.PART_PARAM,
        @Query("maxResults")
        maxResults: String = YouTubeConfig.ApiV3.MAX_RESULTS_VIDEO_PARAM,
        @Query("order")
        order: String = YouTubeConfig.ApiV3.ORDER_PARAM
    ): Call<VideoParse>

    /**
     * Invoca dados de PlayLists disponíveis de acordo
     * com os parâmetros query informados.
     *
     * @param key chave de API de desenvolvedor Google.
     * @param channelId identificador único do canal.
     * @param part trecho de dados que deve estar presente
     * em recurso vídeo retornado.
     * @param maxResults número máximo de PlayLists.
     * @param order dado de ordenação dos resultados.
     * @return todos os dados da resposta do servidor
     * remoto - em objeto Call<PlayListsParse>.
     */
    @GET( value = YouTubeConfig.ApiV3.PLAYLISTS_PATH )
    fun playLists(
        @Query("key")
        key: String = YouTubeConfig.Key.GOOGLE_DEV,
        @Query("channelId")
        channelId: String = YouTubeConfig.Channel.CHANNEL_ID,
        @Query("part")
        part: String = YouTubeConfig.ApiV3.PART_PARAM,
        @Query("maxResults")
        maxResults: String = YouTubeConfig.ApiV3.MAX_RESULTS_PLAYLISTS_PARAM,
        @Query("order")
        order: String = YouTubeConfig.ApiV3.ORDER_PARAM
    ): Call<PlayListsParse>
}