package dev.wildan.indonesiaapi.wilayah.service.impl;

import dev.wildan.indonesiaapi.wilayah.data.DesaEntity;
import dev.wildan.indonesiaapi.wilayah.dto.DesaDto;
import dev.wildan.indonesiaapi.wilayah.repository.DesaRepository;
import dev.wildan.indonesiaapi.wilayah.service.DesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DesaServiceImpl implements DesaService {
    private final DesaRepository desaRepository;

    @Override
    public List<DesaDto> getAllDesa(String search) {
        List<DesaEntity> desa = desaRepository.findAll();
        if (search != null) {
            return desa.stream().filter(d -> d.getDesaName().toLowerCase()
                    .contains(search.toLowerCase()))
                    .map(d -> DesaDto
                            .builder()
                            .desaId(d.getDesaId())
                            .desaCode(d.getDesaCode())
                            .desaName(d.getDesaName())
                            .kecCode(d.getKecCode())
                            .build())
                    .collect(Collectors.toList());
        }
        return desa.stream().map(d -> DesaDto
                        .builder()
                        .desaId(d.getDesaId())
                        .desaCode(d.getDesaCode())
                        .desaName(d.getDesaName())
                        .kecCode(d.getKecCode())
                        .build())
                .collect(Collectors.toList());
    }
}
