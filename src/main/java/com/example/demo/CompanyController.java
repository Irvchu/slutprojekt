package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CompanyController {

    List<Company> companiesAll;


    @Autowired
    CompanyRepository companyRepository;



    /*@GetMapping("/")
    @ResponseBody
    public Company test () {

        //return companyRepository.getCompanyById(1);
    }*/
    @GetMapping("/")
    public String index () {

        return "index";
    }



    //String connstr = "jdbc:sqlserver://localhost;databasename=Peoplefirst;user=dbadmin;password=dbadmin123";

    /**
     * getmapping for search. only returns its own template.
     * @return
     */
    @GetMapping("/searchResult")
    public String searchCompany() {

        return "searchResult";
    }

    /**
    @GetMapping("/searchResult/{id}")
    public String searchCompanyID(@PathVariable long id) {

        return "searchResult";
    }
    */

    /**
     * Postmapping method which requests a parameter such as a company name or some
     * other tag the user would like to search for.
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchResult")
    public String searchCompanyTwo(@RequestParam String search, Model model, HttpSession session) {
        //important with the '%' when using LIKE in queries.
        search = "%" + search + "%";

        List<Company> companies = companyRepository.getCompanyByName(search);


        /**
         * add the companies as a modelattribute so we can get hold of them in the HTML-Template
         * "Companies" - the name of the model. "companies" - the actual data being transeffered
         */
        model.addAttribute("Companies", companies);


        return "searchResult";
    }



    @GetMapping("/searchResult/{id}")
    public String compareCompanies(@PathVariable Long id, HttpSession session, Model model) {
        Company companyAll = companyRepository.getEverythingById(id);
        List<Company> companies =  (List<Company>) session.getAttribute("Companies");

        if(companies == null) {
            companies = new ArrayList<>();
        }
        if (companyAll != null) {
            companies.add(companyAll);
        }

        if(companiesAll == null) {
            companiesAll = new ArrayList<>();
        }


        if(companiesAll.size() > 2) {
            System.out.println("in the if");
            companiesAll.remove(0);

        }
        companiesAll.add(companyAll);


        session.setAttribute("Companies", companies);
        session.setAttribute("CompaniesAll", companiesAll);
        System.out.println(session.getAttribute("Companies"));

        return "searchResult";
    }

    @GetMapping("/filtered")
    public String getFilteredCompanis(@RequestParam String[] filteredCompanies, Model model) {
        System.out.println("Getmappuing");
        return "searchResult";
    }
    @PostMapping("/filtered")
    public String hej(@RequestParam String[] filteredCompanies, Model model) {
        System.out.println("post");
        List<Company> filteredCompaniesList;

        filteredCompaniesList = companyRepository.filterQueries(filteredCompanies);

        model.addAttribute("filteredCompaniesList", filteredCompaniesList);
        return "searchResult";
    }

    @ModelAttribute("multiCheckboxAllValues")
    public String[] getMultiCheckboxAllValues() {
        return new String[] {
                "Backend=Java", "Frontend=Javascript", "Backend=C#", "Backend=Phyton",
                "Frontend=React", "T-centralen", "Stockholm"
        };
    }
/*
    @GetMapping("/filtered")
    public String getFilteredCompanis(@RequestParam String[] filteredCompanies) {
        List<Company> companies = companyRepository.getCompanySystem(filteredCompanies);
        System.out.println(companies.get(0).getBackendProgramLanguage() + " HEAJKJA");
        return "searchResult";
    }
    @PostMapping("/filtered")
    public String filterCompanies(@RequestParam String [] filteredCompanies) {
        for(int i = 0; i < filteredCompanies.length; i++) {
            System.out.println(filteredCompanies[i]);
        }
        List<Company> companies = companyRepository.getCompanySystem(filteredCompanies);
        System.out.println(companies.get(0).getBackendProgramLanguage() + " POST");
        return "searchResult";
    }

 */

  /*
    @GetMapping("/")
    public String checkUser() {
        //int companyId = 1;
        String companyName = "";
        System.out.println("HEJSAN HRÄ TITTAR JAG FRA;");
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company where CompanyName = ?")) {
            ps.setString(1, companyName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Company foundCompany = rsCompany(rs);
                System.out.println(foundCompany.getCompanyName()+ "i if sats");
                if(foundCompany.getCompanyId() == 1) {
                    System.out.println(foundCompany.getCompanyName());
                    return "home";
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "home";
    }

   */

}
