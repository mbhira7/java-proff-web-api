package org.example.checkpoint;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProffService implements IProffService {
    private RestTemplate restTemplate;

    public ProffService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Company> fetchCompaniesByQuery(String query) {
        String url =  "https://api.proff.no/api/companies/eniropro/NO?industry={query}";
        ApiResponse response = restTemplate.getForObject(url, ApiResponse.class, query);
        if (response != null) {
            return response.getCompanies();
        }
        return Collections.emptyList();
    }

    

    @Override
    public Company fetchCompanyById(String id) {
        String url =  "https://api.proff.no/api/companies/eniropro/NO/{id}";
        Company company = restTemplate.getForObject(url, Company.class, id);
        return company;
    }
}
