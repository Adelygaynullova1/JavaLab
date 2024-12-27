package web.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import web.dto.TenderDto;
import web.service.TenderService;
import web.taxclient.TaxClient;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tender")
@Slf4j
public class TenderController {

    @Autowired
    private KafkaTemplate<String, TenderDto> kafkaTemplate;

    @Autowired
    private TaxClient taxClient;

    @Autowired
    private TenderService tenderService;

    @PostMapping("/send")
    public ResponseEntity<String> getTender(@RequestBody TenderDto tenderDto) {
        log.info("Get response for tender");
        kafkaTemplate.send("tax", tenderDto);
        if (taxClient.getInnValidation(tenderDto.getCompanyName())) {
            tenderService.saveCompanyData(tenderDto);
            return ResponseEntity.ok("OK");
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid company inn");
        }

    }

}
