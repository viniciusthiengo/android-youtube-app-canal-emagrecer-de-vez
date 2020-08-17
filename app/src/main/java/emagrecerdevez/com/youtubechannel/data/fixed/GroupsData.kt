package emagrecerdevez.com.youtubechannel.data.fixed

import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.model.Group

/**
 * Contém os dados dos grupos, de outras redes,
 * vinculados ao canal YouTube do aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * os dados dos grupos.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novos grupos)
 * e com espaços de tempo longos entre as alterações,
 * então a melhor escolha foi o trabalho deles em
 * uma classe estática (companion object) que
 * trabalha como se fosse uma persistência de dados
 * estáticos.
 */
abstract class GroupsData {

    companion object{
        /**
         * Retorna todos os grupos vinculados ao
         * canal.
         *
         * @return lista não mutável de objetos
         * Group.
         */
        fun getGroups()
            = listOf(
                Group(
                    place = "Portal",
                    name = "Tribo Forte",
                    webUri = "https://triboforte.com.br/",
                    logo = R.drawable.ic_tribe_color
                )
            )
    }
}