package com.example.demo.dto

import java.io.Serializable

/**
 * DTO for {@link com.example.demo.model.Person}
 */
data class PersonDto(val id: Long? = null, val name: String? = null) : Serializable