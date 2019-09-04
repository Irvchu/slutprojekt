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

    Company rsEverything (ResultSet rs) throws SQLException {
        return new Company(rs.getLong("companyID"),
                     rs.getFloat("longitude"),
                rs.getFloat("latitude"),
                //rs.getInt("CarparkMonthCostSEK"),
                rs.getInt("numberOfEmployee"),
                rs.getInt("vacationDays"),
                rs.getInt("noticePeriodMonth"),
                rs.getInt("educationBudgetSEK"),
                rs.getInt("wellnessContributionSEK"),
                rs.getString("logo"),
                        rs.getString("companyName"),
                        rs.getString("address"),
                rs.getString("postalCode"),
                rs.getString("city"),
                rs.getString("tag"),
                rs.getString("profitMarginal"),
                rs.getString("netSalesChange"),
                rs.getString("propotionOfWomanWithinITDep"),
                rs.getString("propotionOfWomanWithinBoard"),
                rs.getString("propotionOfWomanWithinLeadManagement"),
                rs.getString("staffTurnover"),
                rs.getString("backendProgramLanguage"),
                rs.getString("frontendProgramLanguage"),
                rs.getString("operationSystem"),
                rs.getBoolean("bikeRoomAvailable"),
                rs.getBoolean("carParkingAvailable"),
                rs.getBoolean("meditationRoom"),
                rs.getBoolean("permanentWorkplaces"),
                rs.getBoolean("moreThanOneOffice"),
                rs.getBoolean("benify"),
                rs.getBoolean("unionConnected"),
                rs.getBoolean("groupInsuranceIncluded"),
                rs.getBoolean("businessCareIncluded"),
                rs.getBoolean("collectiveAgreement"),
                rs.getBoolean("occupationalIncluded"),
                rs.getBoolean("fruitBasketIncluded"),
                rs.getBoolean("breakfastIncluded"),
                rs.getBoolean("lunchIncluded"),
                rs.getBoolean("dinnerIncluded"),
                rs.getBoolean("projectSteeringAgilt"));


    }





    String connstr = "jdbc:sqlserver://localhost;databasename=erikaspeople;user=dbadmin;password=dbadmin123";
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



    public Company getEverythingById(Long id) {
        Company company = null;
        try (Connection conn = DriverManager.getConnection(connstr);
             PreparedStatement stmt = conn.prepareStatement("SELECT * " +
                     "FROM Company " +

                     "INNER JOIN CompanyGeneral ON Company.CompanyID = CompanyGeneral.CompanyID " +
                            "Inner Join EmployeeAgreement ON Company.CompanyID  = EmployeeAgreement.CompanyID " +
                             "Inner Join EmployeeBenefit ON Company.CompanyID = EmployeeBenefit.CompanyID " +
                             "INNER JOIN CompanyFacility ON Company.CompanyID = CompanyFacility.CompanyID " +
                     "Inner Join System ON Company.CompanyID = System.CompanyID " +
                     "Where Company.CompanyID = ?")) {

            stmt.setString(1,Long.toString(id));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                company = rsEverything(rs);
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

    /**
     * A helper method for making queries for BackendProgrammingLanguages
     * @param filteredString
     * @return
     */
    /*public Company filterQueriesHelperBackendProgLang(String filteredString) {
        Company company = null;
        try {
            Connection conn = DriverManager.getConnection(connstr);
            PreparedStatement ps = conn.prepareStatement("SELECT * " +
                    "FROM Company " +

                    "INNER JOIN CompanyGeneral ON Company.CompanyID = CompanyGeneral.CompanyID " +
                    "Inner Join EmployeeAgreement ON Company.CompanyID  = EmployeeAgreement.CompanyID " +
                    "Inner Join EmployeeBenefit ON Company.CompanyID = EmployeeBenefit.CompanyID " +
                    "INNER JOIN CompanyFacility ON Company.CompanyID = CompanyFacility.CompanyID " +
                    "Inner Join System ON Company.CompanyID = System.CompanyID " +
                    "Where Company.CompanyID = System.CompanyID AND System.backendProgramLanguage = ?");

            ps.setString(1, filteredString);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                company = rsEverything(rs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return company;
    }*/

    /**
     * Method for making queries for BackendProgrammingLanguages
     * @param filteredCompanies
     * @return
     */
   /* public List<Company> filterQueriesBackend(String[] filteredCompanies, List<Company> filteredCompaniesList) {
        for(int i = 0; i < filteredCompanies.length; i++) {
            String filteredString = filteredCompanies[i];
            filteredCompanies[i] = "%"+filteredString+"%";
            filteredCompaniesList.add(filterQueriesHelperBackendProgLang(filteredCompanies[i]));
        }
        System.out.println(filteredCompaniesList.get(0).getCompanyName()+ " filterQueries");
        return filteredCompaniesList;
    }*/

   /* public Company filterQueriesHelperFrontendProgLang(String filteredString) {
        Company company = null;
        try {
            Connection conn = DriverManager.getConnection(connstr);
            PreparedStatement ps = conn.prepareStatement("SELECT * " +
                    "FROM Company " +

                    "INNER JOIN CompanyGeneral ON Company.CompanyID = CompanyGeneral.CompanyID " +
                    "Inner Join EmployeeAgreement ON Company.CompanyID  = EmployeeAgreement.CompanyID " +
                    "Inner Join EmployeeBenefit ON Company.CompanyID = EmployeeBenefit.CompanyID " +
                    "INNER JOIN CompanyFacility ON Company.CompanyID = CompanyFacility.CompanyID " +
                    "Inner Join System ON Company.CompanyID = System.CompanyID " +
                    "Where Company.CompanyID = System.CompanyID AND System.frontendProgramLanguage = ?");

            ps.setString(1, filteredString);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                company = rsEverything(rs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return company;
    }*/

   /* public List<Company> filterQueriesFrontend(String[] filteredCompanies, List<Company> filteredCompaniesList) {
        for(int i = 0; i < filteredCompanies.length; i++) {
            String filteredString = filteredCompanies[i];
            filteredCompanies[i] = "%"+filteredString+"%";
            filteredCompaniesList.add(filterQueriesHelperBackendProgLang(filteredCompanies[i]));
        }
        System.out.println(filteredCompaniesList.get(0).getCompanyName()+ " filterQueries");
        return filteredCompaniesList;
    }*/

   public List<Company> filterQueries(String[] filteredCompanies) {
       ArrayList<Company> filteredCompanyList = new ArrayList<>();
       Company company = null;
       String queryBuilder = "SELECT * FROM Company " +
               "INNER JOIN CompanyGeneral ON Company.CompanyID = CompanyGeneral.CompanyID " +
               "INNER JOIN EmployeeAgreement ON Company.CompanyID = EmployeeAgreement.CompanyID " +
               "INNER JOIN EmployeeBenefit ON Company.CompanyID = EmployeeBenefit.CompanyID " +
               "INNER JOIN CompanyFacility ON Company.CompanyID = CompanyFacility.CompanyID " +
               "INNER JOIN System ON Company.CompanyID = System.CompanyID WHERE ";

       String stringBuilder = "";
       String endString = filteredCompanies[filteredCompanies.length-1];
       System.out.println(endString);
       try {
           Connection conn = DriverManager.getConnection(connstr);
           for(int i = 0; i < filteredCompanies.length; i++) {

               queryBuilder = queryBuilder + "tag LIKE ?";
              if(filteredCompanies[i].equals(endString)) {
                   continue;
               }else {
                   queryBuilder = queryBuilder + " or ";
               }
           }

           System.out.println(queryBuilder);
           PreparedStatement ps = conn.prepareStatement(queryBuilder);

           for(int i = 0; i < filteredCompanies.length; i++) {
               int index = i + 1;
               System.out.println(filteredCompanies[i]);
               String newString = "%" + filteredCompanies[i] + "%";
               ps.setString(index, newString);
           }
           System.out.println(queryBuilder);
           ResultSet rs = ps.executeQuery();
           while(rs.next()) {
               //company = rsEverything(rs);
               filteredCompanyList.add(rsEverything(rs));
           }

       }catch (SQLException e) {
           e.printStackTrace();
       }
        return filteredCompanyList;

   }

}
