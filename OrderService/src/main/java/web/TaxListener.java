package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import web.dto.TenderDto;
import web.service.TaxService;

@Component
public class TaxListener {

    @Autowired
    private TaxService taxService;

    @KafkaListener(topics = "tax", groupId = "tax-group")
    public void listenTax(TenderDto dto) {
        taxService.saveTax(dto);
    }
}
