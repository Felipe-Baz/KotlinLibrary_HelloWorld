import br.com.baz.HelloWorld
import org.junit.jupiter.api.Test
import kotlin.test.assertContains

class HelloWorldTest {

    @Test
    fun testHelloWorld() {
        var helloWorld = HelloWorld("Felipe")
        assertContains(helloWorld.sayHello(), "Hello Felipe")
    }
}