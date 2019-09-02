package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyRepository {

    private List<Company> companies;

    @Autowired
    private DataSource dataSource;

    Company rsCompany(ResultSet rs) throws SQLException {
        return new Company(rs.getLong("companyID"),
                        rs.getString("companyName"),
                        rs.getString("address"),
                rs.getString("city"),
                rs.getString("logo"));
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

   /* public int getCompanyCount() {
        int count = 0;
        try(Connection conn = DriverManager.getConnection(connstr);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS count FROM MOVIE");) {
            System.out.println(rs);
            while(rs.next()) {
                count = rs.getInt("count");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return count;

    */


    public List<Company> getCompany(String search) {

        try (Connection conn = DriverManager.getConnection(connstr);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY")) {
            while (rs.next()) {
                companies.add(rsCompany(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return companies;
    }

    public Company getCompanyById(Long id) {
        Company company = null;
        try (Connection conn = DriverManager.getConnection(connstr);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Company WHERE CompanyID = ?");

        ) {
            stmt.setString(1,Long.toString(id));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                company = rsCompany(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return company;
    }


    public List<Company> getCompanyByName(@RequestParam(defaultValue = "") String search) {
        List<Company> companies = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(connstr);
            //QUERY with a tag as a search function
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company WHERE CompanyName LIKE ? OR TAG LIKE ? ");
            //setstring parameter is basically and index for the "=" in the query
            ps.setString(1, search);
            ps.setString(2, search);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                companies.add(rsCompany(rs));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return companies;
    }

    public List<Company> getPage(int page, int pageSize, List<Company> companies) {
        int from = Math.max(0,page*pageSize);
        int to = Math.min(companies.size(),(page+1)*pageSize);

        return companies.subList(from, to);
    }

    public int numberOfPages() {
        return (int)Math.ceil(new Double(companies.size()) / 4);
    }


}
