package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dto.TenderDto;
import web.repository.TaxRepository;
@Service
public class TaxService {

    @Autowired
    private TaxRepository taxRepository;

    public void saveTax(TenderDto taxDto) {
        taxRepository.saveCompanyData(taxDto);
    }

    public String getInnCompanyByName(String companyName) {
        return taxRepository.getInnCompanyByName(companyName);
    }
}
