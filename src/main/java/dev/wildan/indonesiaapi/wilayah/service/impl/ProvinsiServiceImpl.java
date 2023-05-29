package dev.wildan.indonesiaapi.wilayah.service.impl;

import dev.wildan.indonesiaapi.wilayah.data.ProvinsiEntity;
import dev.wildan.indonesiaapi.wilayah.dto.ProvinsiDto;
import dev.wildan.indonesiaapi.wilayah.repository.ProvinsiRepository;
import dev.wildan.indonesiaapi.wilayah.service.ProvinsiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProvinsiServiceImpl implements ProvinsiService {
    private final ProvinsiRepository provinsiRepository;
    @Override
    public List<ProvinsiDto> getAllProvinsi(String search) {
        List<ProvinsiEntity> provinsi = provinsiRepository.findAll();
        if (search != null) {
            return provinsi.stream().filter(d -> d.getProvinsiName()
                            .toLowerCase().contains(search.toLowerCase()))
                    .map(d -> ProvinsiDto
                            .builder()
                            .provinsiId(d.getProvinsiId())
                            .provCode(d.getProvCode())
                            .provinsiName(d.getProvinsiName())
                            .build()).collect(Collectors.toList());
        }

        return provinsi.stream().map(d -> ProvinsiDto
                .builder()
                .provinsiId(d.getProvinsiId())
                .provCode(d.getProvCode())
                .provinsiName(d.getProvinsiName())
                .build()).collect(Collectors.toList());

    }
}
