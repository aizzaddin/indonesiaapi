package dev.wildan.indonesiaapi.wilayah.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "kecamatan")
public class KecamatanEntity {
    @Id
    @Column(name = "kecamatan_id", nullable = false, length = 36)
    private String kecamatanId;

    @Column(name = "kecamatan_name", length = 50)
    private String kecamatanName;

    @Column(name = "kab_code", length = 8)
    private String kabCode;

    @Column(name = "kec_code", length = 8)
    private String kecCode;

}