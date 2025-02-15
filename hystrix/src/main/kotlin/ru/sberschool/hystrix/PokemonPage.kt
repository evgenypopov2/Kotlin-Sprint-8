package ru.sberschool.hystrix

data class PokemonPage(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon> = emptyList()
) {
    constructor() : this(-1, null, null)
}