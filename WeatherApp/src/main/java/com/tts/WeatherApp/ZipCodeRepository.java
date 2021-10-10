package com.tts.WeatherApp;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ZipCodeRepository extends Repository<ZipCode, Long> {

    List<ZipCode> findByZipCode(String zipcode);
}
