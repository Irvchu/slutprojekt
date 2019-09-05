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


    Option option;


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
    public String searchCompany() throws Exception {

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
    public String searchCompanyTwo(@RequestParam String search, Model model, HttpSession session) throws Exception {
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
<<<<<<< HEAD
    public String compareCompanies(@PathVariable Long id, HttpSession session, Model model) throws Exception {
=======
    public String compareCompanies(@PathVariable Long id, HttpSession session, Model model) {

//        List<Company> companiesAll;
>>>>>>> IrvinTriesToMergeWithErika
        Company companyAll = companyRepository.getEverythingById(id);
        List<Company> companies =  (List<Company>) session.getAttribute("Companies");

        boolean companyExist=false;
        if(companies == null) {
            companies = new ArrayList<>();
        }
         for(Company company:companies){
             if(company.getCompanyId().equals(companyAll.getCompanyId())){
                 companyExist=true;
             }
         }

        if (companyAll != null && companyExist==false) {
            companies.add(companyAll);
        }

        if(companies.size() > 3) {
            System.out.println("in the if");
            companies.remove(0);

        }




        session.setAttribute("Companies", companies);
        session.setAttribute("CompaniesAll", companies);
        System.out.println(session.getAttribute("Companies"));

        return "searchResult";
    }


    @GetMapping("/filtered")
    public String getFilteredCompanies(@RequestParam String[] filteredCompanies,HttpSession session, Model model) {
        String filteredList = (String)session.getAttribute("filteredCompaniesListSession");
        System.out.println("Getmapping");
        return "searchResult";
    }
    @PostMapping("/filtered")
    public String hej(@RequestParam String[] filteredCompanies,HttpSession session, Model model) {
        System.out.println("post");

        List<Company> filteredCompaniesList;

        filteredCompaniesList = companyRepository.filterQueries(filteredCompanies);

        model.addAttribute("filteredCompaniesList", filteredCompaniesList);
        session.setAttribute("filteredCompaniesListSession", filteredCompaniesList);
        session.setAttribute("Companies",null);
        session.setAttribute("CompaniesAll",null);
        return "searchResult";
    }

    @ModelAttribute("multiCheckboxProgrammingLanguages")
    public List<Option> getMultiCheckboxProgrammingLanguages() {
        List<Option> optionList = new ArrayList<>();
        optionList.add(new Option("Java", "Backend=Java"));
        optionList.add(new Option("C#", "Backend=C#"));
        optionList.add(new Option("Python", "Backend=Python"));
        optionList.add(new Option("React", "Frontend=React"));
        optionList.add(new Option("Javascript", "Frontend=Javascript"));
        return optionList;
    }
    @ModelAttribute("multiCheckboxFacility")
    public List<Option> getMultiCheckboxFacility() {
        List<Option> optionList = new ArrayList<>();
        optionList.add(new Option("Carparking", "Carparking=Yes"));
        optionList.add(new Option("Meditation room", "Meditationroom=Yes"));
        optionList.add(new Option("Biker room", "Bikerroom=Yes"));
        optionList.add(new Option("Fruit basket", "Fruitbasket=Yes"));
        optionList.add(new Option("Breakfast", "Breakfast=Yes"));
        return optionList;
    }
    @ModelAttribute("multiCheckboxGeneral")
    public List<Option> getMultiCheckboxGeneral() {
        List<Option> optionList = new ArrayList<>();
        optionList.add(new Option("Women In Tech > 30% ", "ItProportionWomen>30%"));
        optionList.add(new Option("Women Within Board > 30% ", "WomenWithinBoard<30%"));
        optionList.add(new Option("Staff turnover < 10%", "Staffturnover<10%"));
        optionList.add(new Option("Employees > 5000", "Workers>5000"));
        optionList.add(new Option("Collective Agreement", "CollectiveAgreement"));
        return optionList;
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
