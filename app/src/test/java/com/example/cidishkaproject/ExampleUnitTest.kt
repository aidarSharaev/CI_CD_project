package com.example.cidishkaproject

import org.junit.Test

import org.junit.Assert.assertEquals

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun check_app() {
        val nope = Nope()

        val hello = nope.greeting()

        assertEquals("Hello Android", hello)
    }
}
