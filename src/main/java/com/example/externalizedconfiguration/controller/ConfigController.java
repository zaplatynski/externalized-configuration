import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.externalizedconfiguration.model.ConfigItem;
import com.example.externalizedconfiguration.service.ConfigService;

@RestController
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @GetMapping("/config")
    public Page<ConfigItem> getConfigItems(Pageable pageable, 
                                            @RequestParam(required = false) String stage) {
        return configService.getConfigItems(pageable, stage);
    }
}