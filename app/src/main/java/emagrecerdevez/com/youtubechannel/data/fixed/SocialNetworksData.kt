package emagrecerdevez.com.youtubechannel.data.fixed

import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.model.SocialNetwork

/**
 * Contém os dados das outras redes (sociais ou sites),
 * vinculados ao canal YouTube do aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados dessas outras redes.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novas redes)
 * e com espaços de tempo longos entre as alterações,
 * então a melhor escolha foi o trabalho deles em
 * uma classe estática (companion object) que
 * trabalha como se fosse uma persistência de dados
 * estáticos.
 */
abstract class SocialNetworksData {

    companion object{
        /**
         * Retorna todas as redes vinculadas ao
         * canal.
         *
         * @return lista não mutável de objetos
         * SocialNetwork.
         */
        fun getNetworks()
            = listOf(
                SocialNetwork(
                    network = "Instagram",
                    accountName = "/EmagrecerDeVezOficial",
                    appUri = "",
                    webUri = "https://www.instagram.com/emagrecerdevezoficial/",
                    logo = R.drawable.ic_instagram_color
                ),
                SocialNetwork(
                    network = "Facebook",
                    accountName = "/EmagrecerDeVez",
                    appUri = "",
                    webUri = "https://www.facebook.com/emagrecerdevez",
                    logo = R.drawable.ic_facebook_color
                ),
                SocialNetwork(
                    network = "YouTube",
                    accountName = "/EmagrecerDeVez",
                    appUri = "",
                    webUri = "https://www.youtube.com/user/EmagrecerDeVez",
                    logo = R.drawable.ic_youtube_color
                ),
                SocialNetwork(
                    network = "Blog",
                    accountName = "EmagrecerDeVez.com",
                    appUri = "",
                    webUri = "https://emagrecerdevez.com/",
                    logo = R.drawable.ic_blog_color
                ),
                SocialNetwork(
                    network = "PodBean",
                    accountName = "/TriboFortePodCast",
                    appUri = "",
                    webUri = "https://tribofortepodcast.podbean.com/",
                    logo = R.drawable.ic_podcast_color
                )
            )
    }
}