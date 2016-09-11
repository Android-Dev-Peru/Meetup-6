/**
 *
 */
package pe.androiddev.kata

import org.junit.Test

/**
 * @author Carlos Piñan
 */

class LanguageKata {

    @Test
    fun languageTest() {
        assert(getLanguage("EN") == "English")
        assert(getLanguage("ES") == "Spanish")
        assert(getLanguage("CH") == "Chinese")
        assert(getLanguage("FR") == "French")
    }

    fun getLanguage(language: String) = when (language) {
        "EN" -> "English"
        "FR" -> "French"
        "ES" -> "Spanish"
        "CH" -> "Chinese"
        else -> "Don't know"
    }

}
