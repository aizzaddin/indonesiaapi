package dev.wildan.indonesiaapi.wilayah.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "desa")
public class DesaEntity {
    @Id
    @Column(name = "desa_id", nullable = false, length = 36)
    private String desaId;

    @Column(name = "desa_name", length = 50)
    private String desaName;

    @Column(name = "kec_code", length = 8)
    private String kecCode;

    @Column(name = "desa_code", length = 8)
    private String desaCode;

}