package com.example.externalizedconfiguration.service;

import com.example.externalizedconfiguration.model.ConfigItem;
import com.example.externalizedconfiguration.repository.ConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConfigService {

    private final ConfigRepository configRepository;

    @Autowired
    public ConfigService(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public Page<ConfigItem> getAllConfigItems(Pageable pageable) {
        return configRepository.findAll(pageable);
    }

    public Optional<ConfigItem> getConfigItemById(Long id) {
        return configRepository.findById(id);
    }

    public ConfigItem saveConfigItem(ConfigItem configItem) {
        return configRepository.save(configItem);
    }

    public void deleteConfigItem(Long id) {
        configRepository.deleteById(id);
    }
}