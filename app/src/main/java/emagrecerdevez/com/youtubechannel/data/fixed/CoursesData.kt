package emagrecerdevez.com.youtubechannel.data.fixed

import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.model.Course

/**
 * Contém os dados dos cursos proprietários ou
 * apenas indicados pelo canal YouTube vinculado
 * ao aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados dos cursos.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novos cursos)
 * e com espaços de tempo longos entre as
 * alterações, então a melhor escolha foi o trabalho
 * deles em uma classe estática (companion object)
 * que trabalha como se fosse uma persistência de
 * dados estáticos.
 */
abstract class CoursesData {

    companion object{
        /**
         * Retorna todos os cursos (digitais ou não)
         * vinculados ao canal.
         *
         * @return lista não mutável de objetos
         * Course.
         */
        fun getCourses()
            = listOf(
                Course(
                    title = "Código Emagrecer De Vez",
                    categories = listOf("Dieta", "Emagrecer", "Bem-estar"),
                    amountVideos = 31,
                    webPage = "https://codigoemagrecerdevez.com.br/",
                    cover = R.drawable.ic_course_codigo_emagrecer_de_vez
                ),
                Course(
                    title = "RÁPIDO30 - Programa de Emagrecimento Acelerado",
                    categories = listOf("Dieta", "Emagrecer"),
                    amountVideos = 16,
                    webPage = "https://rapido30.com.br/",
                    cover = R.drawable.ic_course_rapido30_programa_de_emagrecimento_acelerado
                ),
                Course(
                    title = "Tribo Forte",
                    categories = listOf("Dieta", "Emagrecer", "Bem-estar", "Estilo de vida"),
                    amountVideos = 174,
                    webPage = "https://triboforte.com.br/",
                    cover = R.drawable.ic_course_tribo_forte
                )
            )
    }
}