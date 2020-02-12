package org.example.dto

import javax.validation.Valid
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty

data class Grid(
    @field:NotEmpty
    val name: String,
    @field:Valid
    val size: GridSize
)

data class GridSize(
    @field:Min(value = 1) val width: Int,
    @field:Min(value = 1) val height: Int
)
