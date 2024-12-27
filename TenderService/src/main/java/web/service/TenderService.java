package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dto.TenderDto;
import web.repository.TenderRepository;

@Service
public class TenderService {

    @Autowired
    private TenderRepository tenderRepository;

    public void saveCompanyData(TenderDto tenderDto) {
        tenderRepository.saveCompanyData(tenderDto);
    }

    public String getBestCompany() {
        return tenderRepository.getBestPrice();
    }
}
