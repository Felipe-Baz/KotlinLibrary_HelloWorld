package br.com.baz

import org.junit.jupiter.api.Test
import kotlin.test.assertContains

class HelloWorldTest {

    @Test
    fun testHelloWorld() {
        val helloWorld = HelloWorld(name = "Felipe")
        assertContains(helloWorld.sayHello(), "Hello Felipe")
    }
}