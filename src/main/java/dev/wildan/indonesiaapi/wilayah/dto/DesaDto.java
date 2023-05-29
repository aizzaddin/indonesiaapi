package dev.wildan.indonesiaapi.wilayah.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DesaDto {
    private String desaId;
    private String desaCode;
    private String desaName;
    private String kecCode;
}
