package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyRepository {
    private List<Company> companyList;
    @Autowired
    private DataSource dataSource;
    public List<Company> getBeer(String search) throws SQLException {
        companyList = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Company WHERE CompanyName LIKE ?")) {
            ps.setString(1, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            int j = 1;
            System.out.println(companyList.get(j).getName());
            while (rs.next()) {
                companyList.add(rsCompany(rs));
            }
            for (int i = 0; i < companyList.size(); i++) {
                System.out.println(companyList.get(i).getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return companyList;
    }
    Company rsCompany(ResultSet rs) throws SQLException {
        return new Company(rs.getInt("CompanyID"),
                rs.getString("CompanyName"),
                rs.getString("Address"),
                rs.getInt("PostalCode"),
                rs.getString("City"),
                rs.getInt("Longitude"),
                rs.getInt("Latitude"));
    }
    public List<Company> getPage(int page, int pageSize, List<Company> companyList) {
        int from = Math.max(0,page*pageSize);
        int to = Math.min(companyList.size(),(page+1)*pageSize);
        return companyList.subList(from, to);
    }
    public int numberOfPages() {
        return (int)Math.ceil(new Double(companyList.size()) / 4);
    }
}