package web.repository;

import org.springframework.stereotype.Repository;
import web.dto.TenderDto;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TenderRepository {

    private HashMap<String, TenderDto> dataBase = new HashMap<>();

    public void saveCompanyData(TenderDto tenderDto) {
        dataBase.put(tenderDto.getCompanyName(), tenderDto);
    }

    public String getBestPrice() {
        String companyNameWithLowestPrice = null;
        int lowestPrice = Integer.MAX_VALUE;

        for (Map.Entry<String, TenderDto> entry : dataBase.entrySet()) {
            TenderDto tender = entry.getValue();

            if (Integer.parseInt(tender.getPrice()) < lowestPrice) {
                lowestPrice = Integer.parseInt(tender.getPrice());
                companyNameWithLowestPrice = tender.getCompanyName();
            }
        }

        return companyNameWithLowestPrice;
    }
}
