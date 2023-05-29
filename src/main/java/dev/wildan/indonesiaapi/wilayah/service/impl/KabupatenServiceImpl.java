package dev.wildan.indonesiaapi.wilayah.service.impl;

import dev.wildan.indonesiaapi.wilayah.data.KabupatenEntity;
import dev.wildan.indonesiaapi.wilayah.dto.KabupatenDto;
import dev.wildan.indonesiaapi.wilayah.repository.KabupatenRepository;
import dev.wildan.indonesiaapi.wilayah.service.KabupatenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KabupatenServiceImpl implements KabupatenService {
    private final KabupatenRepository kabupatenRepository;

    @Override
    public List<KabupatenDto> getAllKabupaten(String search) {
        List<KabupatenEntity> kabupaten = kabupatenRepository.findAll();
        if (search != null) {
            return kabupaten.stream().filter(k -> k.getKabupatenName().toLowerCase()
                    .contains(search.toLowerCase()))
                    .map(k -> KabupatenDto
                            .builder()
                            .kabupatenId(k.getKabupatenId())
                            .kabCode(k.getKabCode())
                            .kabupatenName(k.getKabupatenName())
                            .provCode(k.getProvCode())
                            .build())
                    .collect(Collectors.toList());
        }
        return kabupaten.stream().map(k -> KabupatenDto
                        .builder()
                        .kabupatenId(k.getKabupatenId())
                        .kabCode(k.getKabCode())
                        .kabupatenName(k.getKabupatenName())
                        .provCode(k.getProvCode())
                        .build())
                .collect(Collectors.toList());
    }
}
