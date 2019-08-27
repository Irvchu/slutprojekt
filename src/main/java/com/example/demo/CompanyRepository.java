package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyRepository {

    private List <Company> companies;

    @Autowired
     private DataSource dataSource;

    Company rsCompany(ResultSet rs) throws SQLException {
        return new Company(rs.getInt("CompanyID"),
                rs.getString("CompanyName"));

    }


    String connstr = "jdbc:sqlserver://localhost;databasename=Peoplefirst;user=dbadmin;password=dbadmin123";
/*
    private  List <Company> getCompanies (String search) throws SQLException

    {
        companies = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company WHERE CompanyID LIKE ?")) {
            ps.setString(1, "%" + search + "%");

            System.out.println("Hello bello0");
            ResultSet rs = ps.executeQuery();

            System.out.println("Hello bello1");
            while (rs.next()) {
                companies.add(rsCompany(rs));
            }
            for (int i = 0; i < companies.size(); i++) {
                System.out.println(companies.get(i).getCompanyName());
            }

            System.out.println("Hello bello2");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return companies;

 */


    public List<Company> getAllMovies() {

        try (Connection conn = DriverManager.getConnection(connstr);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY");) {
            System.out.println("Hello bello2");
            while (rs.next()) {
                companies.add(rsCompany(rs));
            }
            System.out.println("Hello bello3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return companies;
    }
}
