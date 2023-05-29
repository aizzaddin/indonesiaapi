package dev.wildan.indonesiaapi.wilayah.service;

import dev.wildan.indonesiaapi.wilayah.dto.DesaDto;

import java.util.List;

public interface DesaService {
    List<DesaDto> getAllDesa(String search);
}
