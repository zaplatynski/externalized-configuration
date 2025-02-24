package com.example.externalizedconfiguration.repository;

import com.example.externalizedconfiguration.model.ConfigItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<ConfigItem, Long> {
    Page<ConfigItem> findAll(Pageable pageable);
}