package dev.wildan.indonesiaapi.wilayah.repository;

import dev.wildan.indonesiaapi.wilayah.data.ProvinsiEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinsiRepository extends JpaRepository<ProvinsiEntity, String> {
}
