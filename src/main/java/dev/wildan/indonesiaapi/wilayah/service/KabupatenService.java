package dev.wildan.indonesiaapi.wilayah.service;

import dev.wildan.indonesiaapi.wilayah.dto.KabupatenDto;

import java.util.List;

public interface KabupatenService {
    List<KabupatenDto> getAllKabupaten(String search);
}
