package emagrecerdevez.com.youtubechannel.data.fixed

import emagrecerdevez.com.youtubechannel.model.LastVideo

/**
 * Contém o vídeo inicial que deve ser carregado
 * junto ao aplicativo enquanto um vídeo mais
 * atual não é enviado (ou acessado) a ele.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados de algum vídeo do canal YouTube do
 * app. Assim o usuário sempre terá algum
 * "último" vídeo disponível para acesso, mesmo
 * quando ainda não foi retornado (ou acessado)
 * os dados do vídeo mais atual já disponível
 * no canal.
 */
class LastVideoData {

    companion object{
        /**
         * Retorna o "último" vídeo disponível
         * por padrão no aplicativo
         *
         * @return objeto do tipo LastVideo.
         */
        fun getInitialVideo()
            = LastVideo(
                uid = "4SkFqsXDSjU",
                title = "Minha História Até Agora | Rodrigo " +
                    "Polesso e o Emagrecer De Vez",
                description = "Eu comi atum em lata e ervilha " +
                    "durante quase 1 ano... Neste vídeo " +
                    "conto mais sobre minha história pessoal, " +
                    "como tudo começou, um pouco mais sobre " +
                    "quem é Rodrigo Polesso."
            ).apply {
                thumbUrl = ""
            }
    }
}