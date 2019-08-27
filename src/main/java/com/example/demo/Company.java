package com.example.demo;

public class Company {


    private Integer id;
    private String name;
    private String address;
    private int postalcode;
    private String city;
    private int lng;
    private int lat;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPostalcode() {
        return postalcode;
    }
    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getLng() {
        return lng;
    }
    public void setLng(int lng) {
        this.lng = lng;
    }
    public int getLat() {
        return lat;
    }
    public void setLat(int lat) {
        this.lat = lat;
    }
    public Company(Integer id, String name, String address, int postalcode, String city, int lng, int lat) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postalcode = postalcode;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
    }
}
