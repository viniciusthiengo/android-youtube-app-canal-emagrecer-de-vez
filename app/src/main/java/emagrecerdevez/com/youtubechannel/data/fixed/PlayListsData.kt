package emagrecerdevez.com.youtubechannel.data.fixed

import emagrecerdevez.com.youtubechannel.model.PlayList

/**
 * Contém as principais PlayLists vinculadas ao
 * canal YouTube do aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados das principais PlayLists do canal.
 *
 * Pois devido às limitações da YouTube Data API
 * é importante ter também em app os dados das
 * principais PlayLists e assim ter certeza que
 * o usuário terá acesso a elas.
 */
class PlayListsData {

    companion object{
        /**
         * Retorna as principais PlayLists
         * vinculadas ao canal.
         *
         * @return lista mutável de objetos
         * PlayList.
         */
        fun getInitialPlayLists()
            //= mutableListOf<PlayList>()
            = mutableListOf(
                PlayList(
                    title = "Vitaminas & Minerais",
                    uid = "PL0ZwP-OIgrSzufKF5490GguTQRd_oVCu1"
                ),
                PlayList(
                    title = "Resultados REAIS",
                    uid = "PL0ZwP-OIgrSx4Ei-fYpvMEIU9iBJsHLNH"
                ),
                PlayList(
                    title = "Receitas",
                    uid = "PL0ZwP-OIgrSxAKMI5DHje7IvuuDDgD-hr"
                ),
                PlayList(
                    title = "Ao Vivo",
                    uid = "PL0ZwP-OIgrSzjbgFl3Q7CliZKiCbWY5U3"
                ),
                PlayList(
                    title = "Alimentação FORTE",
                    uid = "PL0ZwP-OIgrSymEKBIC1essT3X4yJFumPQ"
                ),
                PlayList(
                    title = "Tudo Sobre JEJUM INTERMITENTE",
                    uid = "PL0ZwP-OIgrSxUe8XeBZnU0YV_FU2hzJ3s"
                ),
                PlayList(
                    title = "Outros",
                    uid = "PL0ZwP-OIgrSxEZqQKUZiM6iXaWycpWp-9"
                ),
                PlayList(
                    title = "Outros",
                    uid = "PL0ZwP-OIgrSyHIVlqTpLpdiEG3I8mI9KH"
                ),
                PlayList(
                    title = "Na Mídia",
                    uid = "PL0ZwP-OIgrSzKymCUMMm3Y5KyhDnIrIgo"
                ),
                PlayList(
                    title = "Mitos Quebrados",
                    uid = "PL0ZwP-OIgrSybfj94wTmrWSjTePA6-6Gj"
                ),
                PlayList(
                    title = "Podcasts Da \"Tribo Forte\"",
                    uid = "PL0ZwP-OIgrSzMDzEliYMJdChoizYCT_N-"
                ),
                PlayList(
                    title = "Sério Causas Do Gano De Peso",
                    uid = "PL0ZwP-OIgrSx3d5bbx2LLWnKjJ2UDNKU3"
                )
            )
    }
}