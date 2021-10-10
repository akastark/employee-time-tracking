package com.stark.employeetimetracking.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
data class Enterprise (
    val businessName: String,
    val cnpj: String,
    @Id val id: String? = null
)