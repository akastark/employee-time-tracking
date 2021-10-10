package com.stark.employeetimetracking.repositories

import com.stark.employeetimetracking.documents.Enterprise
import org.springframework.data.mongodb.repository.MongoRepository

interface EnterpriseRepository : MongoRepository<Enterprise, String> {

    fun findByCnpj(cnpj: String): Enterprise?
}