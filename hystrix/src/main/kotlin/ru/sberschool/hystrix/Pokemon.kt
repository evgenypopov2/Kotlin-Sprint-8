package ru.sberschool.hystrix

data class Pokemon(
    val name: String?,
    val url: String?
) {
    constructor() : this(null, null)
}
