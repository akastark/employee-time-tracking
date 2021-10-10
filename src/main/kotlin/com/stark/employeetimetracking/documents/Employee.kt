package com.stark.employeetimetracking.documents

import org.springframework.data.annotation.Id
import com.stark.employeetimetracking.enums.ProfileEnum
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee (
    val fullName: String,
    val email: String,
    val password: String,
    val cpf: String,
    val profile: ProfileEnum,
    val hourValue: Double? = 0.0,
    val hoursWorked: Float? = 0.0f,
    val hoursLaunch: Float? = 0.0f,
    @Id val id: String? = null
)