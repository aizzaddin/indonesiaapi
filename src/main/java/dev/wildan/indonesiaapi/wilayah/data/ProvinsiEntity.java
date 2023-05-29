package dev.wildan.indonesiaapi.wilayah.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "provinsi")
public class ProvinsiEntity {
    @Id
    @Column(name = "provinsi_id", nullable = false, length = 36)
    private String provinsiId;

    @Column(name = "provinsi_name", length = 50)
    private String provinsiName;

    @Column(name = "prov_code", length = 8)
    private String provCode;

}