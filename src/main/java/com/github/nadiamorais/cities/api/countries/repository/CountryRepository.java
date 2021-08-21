package com.github.nadiamorais.cities.api.countries.repository;

import com.github.nadiamorais.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
