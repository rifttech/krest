package com.github.rifttech.krest.service

import com.github.rifttech.krest.model.Country
import com.github.rifttech.krest.repository.CountryRepository
import org.springframework.stereotype.Service

@Service
class CountryService(private val countryRepository: CountryRepository){
    fun all(): Iterable<Country> = countryRepository.findAll()

    fun get(countryId:Int): Country = countryRepository.findOne(countryId)

    fun add(country: Country): Country = countryRepository.save(country)

    fun edit(countryId:Int, country: Country): Country = countryRepository.save(country.copy(countryId = countryId))

    fun remove(countryId: Int) = countryRepository.delete(countryId)

}