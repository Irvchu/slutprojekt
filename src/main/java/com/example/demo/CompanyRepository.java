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
                        rs.getString("address"), null, null, null
                );


    }

    Company rsCompanySystem(ResultSet rs) throws SQLException {
        return new Company(rs.getLong("companyID"),
                rs.getString("companyName"),
                rs.getString("address"),
                rs.getString("frontendProgramLanguage"),
                rs.getString("backendProgramLanguage"),
                rs.getString("operativeSystem"));
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


   /*public List<Company> setProgrammingLanguages() {
       try {
           Connection conn = DriverManager.getConnection(connstr);
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }*/

   public String setQuery(int size) {
       if(size == 1) {
           return "SELECT * FROM Company, System where Company.companyID = System.companyID" +
                   " where BackendProgramLanguage = ?";
       }
       return "hej";
   }

    public List<Company> filterQueriesFrontend(String filteredString) {
        Company company = null;

        System.out.println("frontend query");
        try {
            Connection conn = DriverManager.getConnection(connstr);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company, System " +
                    "where Company.companyID = System.companyID AND System.FrontendProgramLanguage = ?");
            ps.setString(1, filteredString);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                company = rsCompanySystem(rs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        if(company != null) {
            return company;
        }
        return null;



        for(int i = 0; i < filteredCompanies.length; i++) {
            String filteredString = filteredCompanies[i];
            filteredCompanies[i] = "%"+filteredString+"%";
            filteredCompaniesList.add(filterQueriesHelperFrontendProgLang(filteredCompanies[i]));
        }
        return filteredCompaniesList;
    }

    public Company filterQueriesHelperFrontendProgLang(String filteredString) {
        Company company = null;

        try {
            Connection conn = DriverManager.getConnection(connstr);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company, System " +
                    "where Company.companyID = System.companyID AND System.FrontendProgramLanguage = ?");
            ps.setString(1, filteredString);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                company = rsCompanySystem(rs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return company;

    }

    /**
     * Method for making queries for BackendProgrammingLanguages
     * @param filteredCompanies
     * @return
     */
    public Company filterQueriesBackend(String filteredString) {
        Company company = null;
        System.out.println("backend qyery");
        try {
            Connection conn = DriverManager.getConnection(connstr);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company, System " +
                    "where Company.companyID = System.companyID AND System.BackendProgramLanguage = ?");
            ps.setString(1, filteredString);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                company = rsCompanySystem(rs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        if(company != null) {
            return company;
        }
        return null;

      /* for(int i = 0; i < filteredCompanies.length; i++) {
           /*String filteredString = filteredCompanies[i];
           filteredCompanies[i] = "%"+filteredString+"%";*/
           /* filteredCompaniesList.add(filterQueriesHelperBackendProgLang(filteredCompanies[i]));
       }
       return filteredCompaniesList;*/
   }

    /**
     * A helper method for making queries for BackendProgrammingLanguages
     * @param filteredString
     * @return
     */
   public Company filterQueriesHelperBackendProgLang(String filteredString) {
       Company company = null;

       try {
           Connection conn = DriverManager.getConnection(connstr);
           PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company, System " +
           "where Company.companyID = System.companyID AND System.BackendProgramLanguage = ?");
           ps.setString(1, filteredString);
           ResultSet rs = ps.executeQuery();

           if(rs.next()) {
               company = rsCompanySystem(rs);
           }
       }catch (SQLException e) {
           e.printStackTrace();
       }
       return company;

   }

    /*public List<Company> getCompanySystem(String[] filteredCompanies) {
        int size = filteredCompanies.length;
        System.out.println(size + "size");
        String input = filteredCompanies[0];
        List<Company> companies = new ArrayList<>();*/

        //"SELECT * FROM Company"
      /*  try {Connection conn = DriverManager.getConnection(connstr);
            //PreparedStatement ps = conn.prepareStatement(setQuery(size));
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company, System " +
                    "where Company.companyID = System.companyID AND System.BackendProgramLanguage = 'Java'");

            //ps.setString(1, "Java");
            ResultSet rs = ps.executeQuery();*/

             /*ResultSet rs = stmt.executeQuery("SELECT * FROM Company, System" +
                     "where Company.companyID = System.companyID"))*/
             /*ResultSet rs = stmt.executeQuery("SELECT * FROM Company" +
                     "INNER JOIN System ON Company.companyID = System.companyID"))*/ /*{

                while (rs.next()) {

                    companies.add(rsCompanySystem(rs));
                }
            } }catch (Exception e) {
            e.printStackTrace();
        }
        return companies;
    }*/

    public List<Company> getCompany(String search) {

        //"SELECT * FROM Company"
        try (Connection conn = DriverManager.getConnection(connstr);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Company, System" +
                     "where Company.companyID = System.companyID"))
             /*ResultSet rs = stmt.executeQuery("SELECT * FROM Company" +
                     "INNER JOIN System ON Company.companyID = System.companyID"))*/ {

            while (rs.next()) {

                companies.add(rsCompanySystem(rs));
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
