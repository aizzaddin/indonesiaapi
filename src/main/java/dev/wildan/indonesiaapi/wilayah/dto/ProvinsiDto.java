package dev.wildan.indonesiaapi.wilayah.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ProvinsiDto {
    private String provinsiId;
    private String provCode;
    private String provinsiName;
}
