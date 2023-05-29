package dev.wildan.indonesiaapi.wilayah.service;

import dev.wildan.indonesiaapi.wilayah.dto.KecamatanDto;

import java.util.List;

public interface KecamatanService {
    List<KecamatanDto> getAllKecamatan(String search);
}
