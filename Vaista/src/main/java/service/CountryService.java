package service;

import com.vaistra.dto.CountryDto;
import org.springframework.stereotype.Service;


import java.util.List;


public interface CountryService {
   CountryDto addCountry(CountryDto countryDto);

   CountryDto getCountryById(int id);

   List<CountryDto> getAllCountries(int pageNumber, int pageSize, String sortBy, String sortDirection);

   CountryDto updateCountry(CountryDto country, int id);

   String deleteCountryById(int id);

   String softDeleteCountryById(int id);

   String restoreCountryById(int id);
}


