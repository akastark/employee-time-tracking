package com.stark.employeetimetracking.repositories

import com.stark.employeetimetracking.documents.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, String> {

    fun findByCpf(cpf: String): Employee?

    fun findByEmail(email: String): Employee?


}