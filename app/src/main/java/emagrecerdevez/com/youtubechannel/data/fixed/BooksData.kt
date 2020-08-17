package emagrecerdevez.com.youtubechannel.data.fixed

import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.model.Book

/**
 * Contém os dados dos livros proprietários ou
 * apenas indicados pelo canal YouTube vinculado
 * ao aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados dos livros.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novos livros)
 * e com espaços de tempo longos entre as
 * alterações, então a melhor escolha foi o trabalho
 * deles em uma classe estática (companion object)
 * que trabalha como se fosse uma persistência de
 * dados estáticos.
 */
abstract class BooksData {

    companion object {
        /**
         * Retorna todos os livros (digitais ou não)
         * vinculados ao canal.
         *
         * @return lista não mutável de objetos
         * Book.
         */
        fun getBooks()
            = listOf(
                Book(
                    title = "Este Não É Mais Um Livro De Dieta",
                    categories = listOf("Dieta", "Emagrecer", "Bem-estar"),
                    webPage = "http://estenaoemaisumlivrodedieta.com.br/",
                    cover = R.drawable.ic_book_este_nao_e_mais_um_livro_de_dieta
                ),
                Book(
                    title = "Emagrecer De Vez",
                    categories = listOf("Dieta", "Emagrecer"),
                    webPage = "https://livro.emagrecerdevez.com/emagrecer-de-vez-o-livro-9/",
                    cover = R.drawable.ic_book_emagrecer_de_vez
                ),
                Book(
                    title = "50 Receitas Para Emagrecer De Vez",
                    categories = listOf("Dieta", "Emagrecer", "Receitas"),
                    webPage = "http://desafio3meses.com/50-receitas-para-emagrecer-de-vez/",
                    cover = R.drawable.ic_book_50_receitas_para_emagrecer_de_vez
                ),
                Book(
                    title = "Hipertrofia Muscular - As respostas que você sempre quis saber",
                    categories = listOf("Hipertrofia", "Musculação"),
                    webPage = "https://emagrecerdevez.com/hipertrofia/",
                    cover = R.drawable.ic_book_hipertrofia_muscular_as_respostas_que_voce_sempre_quis_saber
                )
            )
    }
}