package ru.eda.bot.feedchecker

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShopTest {

    @Test
    fun shop_name_null() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_name_null.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.name must not be blank")
    }

    @Test
    fun shop_name_textEmpty() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_name_textEmpty.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.name must not be blank")
    }

    @Test
    fun shop_company_null() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_company_null.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.company must not be blank")
    }

    @Test
    fun shop_company_textEmpty() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_company_textEmpty.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.company must not be blank")
    }

    @Test
    fun shop_url_null() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_url_null.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.url must not be blank")
    }

    @Test
    fun shop_url_textEmpty() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_url_textEmpty.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.url must not be blank")
    }

    @Test
    fun shop_currencies_textEmpty() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_currencies_textEmpty.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.currencies must not be empty")
    }

    @Test
    fun shop_categories_textEmpty() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_categories_textEmpty.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.categories must not be empty")
    }

    @Test
    fun shop_offers_textEmpty() {

        val readText = this.javaClass.classLoader.getResource("shop/shop_offers_textEmpty.xml")?.readText()
                ?: throw IllegalArgumentException("Path not found")
        val validate = FeedValidator().validate(readText)

        assertEquals(validate, "shop.offers must not be empty")
    }
}