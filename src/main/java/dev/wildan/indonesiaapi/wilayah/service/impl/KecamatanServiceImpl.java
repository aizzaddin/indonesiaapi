package dev.wildan.indonesiaapi.wilayah.service.impl;

import dev.wildan.indonesiaapi.wilayah.data.KecamatanEntity;
import dev.wildan.indonesiaapi.wilayah.dto.KecamatanDto;
import dev.wildan.indonesiaapi.wilayah.repository.KecamatanRepository;
import dev.wildan.indonesiaapi.wilayah.service.KecamatanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KecamatanServiceImpl implements KecamatanService {
    private final KecamatanRepository kecamatanRepository;

    @Override
    public List<KecamatanDto> getAllKecamatan(String search) {
        List<KecamatanEntity> kecamatan = kecamatanRepository.findAll();
        if(search != null) {
            return kecamatan.stream().filter(k -> k.getKecamatanName().toLowerCase()
                    .contains(search.toLowerCase()))
                    .map(k -> KecamatanDto
                            .builder()
                            .kecamatanId(k.getKecamatanId())
                            .kecCode(k.getKecCode())
                            .kecamatanName(k.getKecamatanName())
                            .kabCode(k.getKabCode())
                            .build())
                    .collect(Collectors.toList());
        }
        return kecamatan.stream().map(k -> KecamatanDto
                        .builder()
                        .kecamatanId(k.getKecamatanId())
                        .kecCode(k.getKecCode())
                        .kecamatanName(k.getKecamatanName())
                        .kabCode(k.getKabCode())
                        .build())
                .collect(Collectors.toList());
    }
}
