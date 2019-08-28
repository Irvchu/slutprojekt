package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class CompanyController {


    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    DataSource dataSource;


    /*@GetMapping("/")
    @ResponseBody
    public Company test () {

        //return companyRepository.getCompanyById(1);
    }*/
    @GetMapping("/")
    //@ResponseBody
    public String index () {

        return "index";
    }



    //String connstr = "jdbc:sqlserver://localhost;databasename=Peoplefirst;user=dbadmin;password=dbadmin123";

    @GetMapping("/searchResult")
    public String searchCompany() {

        String input = "%Avanza%";
        List<Company> companies = companyRepository.getCompanyByName(input);
        for (Company company: companies) {
            System.out.println(company.getCompanyName());
        }
        return "searchResult/{page}";
    }

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
