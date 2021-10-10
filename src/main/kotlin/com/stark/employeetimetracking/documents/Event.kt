package com.stark.employeetimetracking.documents

import com.stark.employeetimetracking.enums.TypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Event (
    val date: Date,
    val type: TypeEnum,
    val employeeId: String,
    val description: String? = "",
    val location: String? = "",
    @Id val id: String? = null
)