package org.example.checkpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class MyController {
    @Autowired
    ProffService proffService;

    @GetMapping("/")
    public String index(Model model, Principal principal) {
        model.addAttribute("user", principal);
        return "index";
    }

    @GetMapping("/search")
    public String getCompanies(Model model, @RequestParam(value = "query") String query) {
        model.addAttribute("companies", proffService.fetchCompaniesByQuery(query));
        return "results";
    }

    @GetMapping("/details/{id}")
    public String getCompanyById(Model model, @PathVariable String id, Principal principal) {
        model.addAttribute("company", proffService.fetchCompanyById(id));
        model.addAttribute("user", principal);
        return "details";
    }

    @GetMapping("/details/{id}/secret")
    public String getSecret(Model model, @PathVariable String id) {
        model.addAttribute("company", proffService.fetchCompanyById(id));
        return "secret";
    }
}
