package web.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.GrpcTenderService;
import web.service.TaxService;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private GrpcTenderService grpcTenderService;

    @GetMapping("/winner")
    public ResponseEntity<String> getWinnerCompany() {
        return ResponseEntity.ok(grpcTenderService.getWinnerCompany(null).getCompanyName());
    }

}
