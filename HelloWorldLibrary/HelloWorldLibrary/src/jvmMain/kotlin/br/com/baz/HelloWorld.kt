package br.com.baz

class HelloWorld (
        private val name: String
    ){
    fun sayHello(): String {
        print("sayHello called")
        return "Hello $name"
    }
}