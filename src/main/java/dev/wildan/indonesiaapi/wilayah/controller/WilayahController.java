package dev.wildan.indonesiaapi.wilayah.controller;

import dev.wildan.indonesiaapi.config.response.ResponseHelper;
import dev.wildan.indonesiaapi.wilayah.data.enums.Codes;
import dev.wildan.indonesiaapi.wilayah.service.DesaService;
import dev.wildan.indonesiaapi.wilayah.service.KabupatenService;
import dev.wildan.indonesiaapi.wilayah.service.KecamatanService;
import dev.wildan.indonesiaapi.wilayah.service.ProvinsiService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildayah")
@Api(tags = "Wilayah")
@RequiredArgsConstructor
public class WilayahController {
    private final ProvinsiService provinsiService;
    private final KabupatenService kabupatenService;
    private final KecamatanService kecamatanService;
    private final DesaService desaService;

    @GetMapping("provinsi")
    public ResponseEntity<Object> getAllProvinsi(
            @RequestParam(value = "search", required = false) String search
    ) {
        return ResponseHelper.successWithData(Codes.SUCCESS,
                provinsiService.getAllProvinsi(search));
    }

    @GetMapping("kabupaten")
    public ResponseEntity<Object> getAllKabupaten(
            @RequestParam(value = "search", required = false) String search
    ) {
        return ResponseHelper.successWithData(Codes.SUCCESS,
                kabupatenService.getAllKabupaten(search));
    }

    @GetMapping("kecamatan")
    public ResponseEntity<Object> getAllKecamatan(
            @RequestParam(value = "search", required = false) String search
    ) {
        return ResponseHelper.successWithData(Codes.SUCCESS,
                kecamatanService.getAllKecamatan(search));
    }

    @GetMapping("desa")
    public ResponseEntity<Object> getAllDesa(
            @RequestParam(value = "search", required = false) String search
    ) {
        return ResponseHelper.successWithData(Codes.SUCCESS,
                desaService.getAllDesa(search));
    }
}
