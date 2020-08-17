package emagrecerdevez.com.youtubechannel.data.fixed

import emagrecerdevez.com.youtubechannel.R
import emagrecerdevez.com.youtubechannel.model.BusinessContact

/**
 * Contém os dados de contatos comerciais
 * vinculados ao canal YouTube do aplicativo.
 *
 * O objetivo desta classe é trabalhar como uma
 * persistência local estática, fixa, que contém
 * todos os dados de contatos comerciais.
 *
 * Como esses dados tendem a sofrer poucas
 * alterações (incluindo a inserção de novos contatos)
 * e com espaços de tempo longos entre as alterações,
 * então a melhor escolha foi o trabalho deles em
 * uma classe estática (companion object) que
 * trabalha como se fosse uma persistência de dados
 * estáticos.
 */
abstract class BusinessContactData {

    companion object{
        /**
         * Retorna todos os contatos comerciais do
         * canal.
         *
         * @return lista não mutável de objetos
         * BusinessContact.
         */
        fun getBusinessContacts()
            = listOf(
                BusinessContact(
                    place = "E-mail",
                    contact = "contato@emagrecerdevez.com",
                    webUri = "mailto:contato@emagrecerdevez.com?Subject=Contato comercial - Thiengo",
                    logo = R.drawable.ic_mail_color
                ),
                BusinessContact(
                    place = "Blog",
                    contact = "EmagrecerDeVez.com",
                    webUri = "https://emagrecerdevez.com/contato/",
                    logo = R.drawable.ic_blog
                ),
                BusinessContact(
                    place = "Facebook Messenger",
                    contact = "Emagrecer de Vez",
                    webUri = "https://www.messenger.com/t/emagrecerdevez",
                    logo = R.drawable.ic_facebook_messenger_color
                )
            )
    }
}