package web.taxclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("tax-service")
@Component
public interface TaxClient {

    @GetMapping("/tax/{company}")
    Boolean getInnValidation(@PathVariable String company);
}