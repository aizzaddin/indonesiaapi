package dev.wildan.indonesiaapi.wilayah.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "kabupaten")
public class KabupatenEntity {
    @Id
    @Column(name = "kabupaten_id", nullable = false, length = 36)
    private String kabupatenId;

    @Column(name = "kabupaten_name", length = 50)
    private String kabupatenName;

    @Column(name = "prov_code", length = 8)
    private String provCode;

    @Column(name = "kab_code", length = 8)
    private String kabCode;

}