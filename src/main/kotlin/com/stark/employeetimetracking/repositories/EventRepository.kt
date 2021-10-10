package com.stark.employeetimetracking.repositories

import com.stark.employeetimetracking.documents.Employee
import com.stark.employeetimetracking.documents.Event
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface EventRepository : MongoRepository<Event, String> {

    fun findByEmployeeId(id: String, pageable: Pageable): Page<Employee>




}