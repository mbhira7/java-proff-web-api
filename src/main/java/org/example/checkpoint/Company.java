package org.example.checkpoint;

public class Company {
    public String companyId;
    public String name;
    public String organisationNumber;
    public String description;
    public VisitorAddress visitorAddress;
    public String email;
    public String homePage;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisationNumber() {
        return organisationNumber;
    }

    public void setOrganisationNumber(String organisationNumber) {
        this.organisationNumber = organisationNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VisitorAddress getVisitorAddress() {
        return visitorAddress;
    }

    public void setVisitorAddress(VisitorAddress visitorAddress) {
        this.visitorAddress = visitorAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }
}
