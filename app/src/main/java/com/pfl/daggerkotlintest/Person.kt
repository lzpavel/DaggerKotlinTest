package com.pfl.frameworks

class Name {
    override fun toString() = "John"
}

class Age {
    override fun toString() = "43"
}

data class Person(
    val name: Name,
    val age: Age
)