package dev.wildan.indonesiaapi.wilayah.service;

import dev.wildan.indonesiaapi.wilayah.dto.ProvinsiDto;

import java.util.List;

public interface ProvinsiService {
    List<ProvinsiDto> getAllProvinsi(String search);
}
