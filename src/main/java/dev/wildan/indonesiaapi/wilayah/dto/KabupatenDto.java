package dev.wildan.indonesiaapi.wilayah.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class KabupatenDto {
    private String kabupatenId;
    private String kabCode;
    private String kabupatenName;
    private String provCode;
}
