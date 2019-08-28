package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private CompanyRepository cr;


    @PostMapping("/result/{page}")
    public String searchResult(@RequestParam String search, @PathVariable int page, Model model, HttpSession session ) throws SQLException {

        session.setAttribute("search", search);

        List<Company> companies = cr.getCompany(search);
        companies = cr.getPage(page-1, 4, companies);

        int numberOfPages = cr.numberOfPages();

        model.addAttribute("companies", companies);
        model.addAttribute("numberOfPages", numberOfPages);
        model.addAttribute("currentPage", page);

        return "searchResult";
    }

    @GetMapping("/result/{page}")
    public String searchResult2(@PathVariable int page, Model model, HttpSession session) throws SQLException {

        String search = (String)session.getAttribute("search");

        List<Company> companies = cr.getCompany(search);
        companies = cr.getPage(page-1, 4, companies);

        int numberOfPages = cr.numberOfPages();

        model.addAttribute("companies", companies);
        model.addAttribute("numberOfPages", numberOfPages);
        model.addAttribute("currentPage", page);

        return"searchResult";
    }

}
