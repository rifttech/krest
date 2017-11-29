package com.github.rifttech.krest.repository

import com.github.rifttech.krest.model.Country
import org.springframework.data.repository.CrudRepository

interface CountryRepository : CrudRepository<Country,Int>