package com.codecademy.goldmedal.repository;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> getByName(String name);

    List<Country> getAllByOrderByNameAsc();

    List<Country> getAllByOrderByNameDesc();

    List<Country> getAllByOrderByGdpAsc();

    List<Country> getAllByOrderByGdpDesc();

    List<Country> getAllByOrderByPopulationAsc();

    List<Country> getAllByOrderByPopulationDesc();
}
