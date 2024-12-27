package web.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.TaxService;

@RestController
@RequestMapping("/tax")
@Slf4j
public class TaxController {

    @Autowired
    private TaxService taxService;

    @GetMapping("/{company}")
    public ResponseEntity<Boolean> getInnValidation(@PathVariable String company) {
        String inn = taxService.getInnCompanyByName(company);
        if (inn != null && inn.length() >= 7) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.ok(false);
        }
    }

}
