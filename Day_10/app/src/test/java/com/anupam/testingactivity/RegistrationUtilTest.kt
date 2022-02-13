package com.anupam.testingactivity

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateUserRegistrationInput(
            "",
            "122334",
            "32423"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password return true`() {
        val result = RegistrationUtil.validateUserRegistrationInput(
            "anupam",
            "122334",
            "122334"
        )
        assertThat(result).isTrue()
        assertThat("hello").isEqualTo("hello")
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateUserRegistrationInput(
            "anupam",
            "122334",
            "122334"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateUserRegistrationInput(
            "anupam",
            "122334",
            "32423"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateUserRegistrationInput(
            "anupam",
            "",
            "32423"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateUserRegistrationInput(
            "anupam",
            "1",
            "32423"
        )
        assertThat(result).isFalse()
    }
}