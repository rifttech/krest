package com.github.rifttech.krest.controller

import com.github.rifttech.krest.model.Country
import com.github.rifttech.krest.service.CountryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("countries")
class CountryController(private val countryService: CountryService){
    @GetMapping
    fun index() = countryService.all()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody country: Country) = countryService.add(country)


    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun read(@PathVariable id: Int) = countryService.get(id)

    @PutMapping("{id}")
    fun update(@PathVariable id: Int, @RequestBody product: Country) = countryService.edit(id, product)

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Int) = countryService.remove(id)
}