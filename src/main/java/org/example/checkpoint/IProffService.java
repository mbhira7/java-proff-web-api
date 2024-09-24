package org.example.checkpoint;

import java.util.List;

public interface IProffService {
    public List<Company> fetchCompaniesByQuery(String query);
    public Company fetchCompanyById(String id);
}
