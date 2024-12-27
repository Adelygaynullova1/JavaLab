package web.repository;

import org.springframework.stereotype.Repository;
import web.dto.TenderDto;

import java.util.HashMap;
@Repository
public class TaxRepository {

   private HashMap<String, String> dataBase = new HashMap<>();

   public void saveCompanyData(TenderDto taxDto) {
       dataBase.put(taxDto.getCompanyName(), taxDto.getCompanyInn());
   }

   public String getInnCompanyByName(String companyName) {
       return dataBase.get(companyName);
   }
}
