package com.example.demo;
public class Company {
    Long companyId;
    int longitude, latitude, carParingMonthCostSEK, numberOfEmployee, vacationDays, noticePeriodMonth, EducationBudgetSEK, WellnessContribution;
    String companyName, address, postalCode, city, tag, ProfitMarginal, NetSalesChange, PropotionOfWomanWithinITDep, PropotionOfWomanWithinBoard, PropotionOfWomanWithinLeadManagement, StaffTurnover, backendProgramLanguage, frontendProgramLanguage, operativeSystem;

    boolean  BikeRoomAvailable, CarParkingAvailable, MeditationRoom, PermanentWorkplaces, MoreThanOneOffice, Benify, UnionConnected, GroupInsuranceIncluded, BusinessCareIncluded, CollectiveAgreement, OccupationalIncluded, FruitBasketIncluded, BreakfastIncluded, LunchIncluded, DinnerIncluded, ProjectSteeringAgilt;

    public Company() {
    }
   /* public Company(Long companyId, String companyName, String address) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.address = address;

    }*/

    public Company(Long companyId, String companyName, String address, String frontendProgramLanguage,
                   String backendProgramLanguage, String operativeSystem) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.address = address;
        this.frontendProgramLanguage = frontendProgramLanguage;
        this.backendProgramLanguage = backendProgramLanguage;
        this.operativeSystem = operativeSystem;

    }
    public Long getCompanyId() {
        return this.companyId;
    }
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public int getLongitude() {
        return longitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    public int getLatitude() {
        return latitude;
    }
    public void setLatitude(int latitude) {
        latitude = latitude;
    }
    public int getCarParingMonthCostSEK() {
        return carParingMonthCostSEK;
    }
    public void setCarParingMonthCostSEK(int carParingMonthCostSEK) {
        this.carParingMonthCostSEK = carParingMonthCostSEK;
    }
    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }
    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
    public int getVacationDays() {
        return vacationDays;
    }
    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
    public int getNoticePeriodMonth() {
        return noticePeriodMonth;
    }
    public void setNoticePeriodMonth(int noticePeriodMonth) {
        this.noticePeriodMonth = noticePeriodMonth;
    }
    public int getEducationBudgetSEK() {
        return EducationBudgetSEK;
    }
    public void setEducationBudgetSEK(int educationBudgetSEK) {
        EducationBudgetSEK = educationBudgetSEK;
    }
    public int getWellnessContribution() {
        return WellnessContribution;
    }
    public void setWellnessContribution(int wellnessContribution) {
        WellnessContribution = wellnessContribution;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getProfitMarginal() {
        return ProfitMarginal;
    }
    public void setProfitMarginal(String profitMarginal) {
        ProfitMarginal = profitMarginal;
    }
    public String getNetSalesChange() {
        return NetSalesChange;
    }
    public void setNetSalesChange(String netSalesChange) {
        NetSalesChange = netSalesChange;
    }
    public String getPropotionOfWomanWithinITDep() {
        return PropotionOfWomanWithinITDep;
    }
    public void setPropotionOfWomanWithinITDep(String propotionOfWomanWithinITDep) {
        PropotionOfWomanWithinITDep = propotionOfWomanWithinITDep;
    }
    public String getPropotionOfWomanWithinBoard() {
        return PropotionOfWomanWithinBoard;
    }
    public void setPropotionOfWomanWithinBoard(String propotionOfWomanWithinBoard) {
        PropotionOfWomanWithinBoard = propotionOfWomanWithinBoard;
    }
    public String getPropotionOfWomanWithinLeadManagement() {
        return PropotionOfWomanWithinLeadManagement;
    }
    public void setPropotionOfWomanWithinLeadManagement(String propotionOfWomanWithinLeadManagement) {
        PropotionOfWomanWithinLeadManagement = propotionOfWomanWithinLeadManagement;
    }
    public String getStaffTurnover() {
        return StaffTurnover;
    }
    public void setStaffTurnover(String staffTurnover) {
        StaffTurnover = staffTurnover;
    }
    public String getBackendProgramLanguage() {
        return backendProgramLanguage;
    }
    public void setBackendProgramLanguage(String backendProgramLanguage) {
        this.backendProgramLanguage = backendProgramLanguage;
    }
    public String getFrontendProgramLanguage() {
        return frontendProgramLanguage;
    }
    public void setFrontendProgramLanguage(String frontendProgramLanguage) {
        this.frontendProgramLanguage = frontendProgramLanguage;
    }
    public String getOperativeSystem() {
        return operativeSystem;
    }
    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }
    public boolean isBikeRoomAvailable() {
        return BikeRoomAvailable;
    }
    public void setBikeRoomAvailable(boolean bikeRoomAvailable) {
        BikeRoomAvailable = bikeRoomAvailable;
    }
    public boolean isCarParkingAvailable() {
        return CarParkingAvailable;
    }
    public void setCarParkingAvailable(boolean carParkingAvailable) {
        CarParkingAvailable = carParkingAvailable;
    }
    public boolean isMeditationRoom() {
        return MeditationRoom;
    }
    public void setMeditationRoom(boolean meditationRoom) {
        MeditationRoom = meditationRoom;
    }
    public boolean isPermanentWorkplaces() {
        return PermanentWorkplaces;
    }
    public void setPermanentWorkplaces(boolean permanentWorkplaces) {
        PermanentWorkplaces = permanentWorkplaces;
    }
    public boolean isMoreThanOneOffice() {
        return MoreThanOneOffice;
    }
    public void setMoreThanOneOffice(boolean moreThanOneOffice) {
        MoreThanOneOffice = moreThanOneOffice;
    }
    public boolean isBenify() {
        return Benify;
    }
    public void setBenify(boolean benify) {
        Benify = benify;
    }
    public boolean isUnionConnected() {
        return UnionConnected;
    }
    public void setUnionConnected(boolean unionConnected) {
        UnionConnected = unionConnected;
    }
    public boolean isGroupInsuranceIncluded() {
        return GroupInsuranceIncluded;
    }
    public void setGroupInsuranceIncluded(boolean groupInsuranceIncluded) {
        GroupInsuranceIncluded = groupInsuranceIncluded;
    }
    public boolean isBusinessCareIncluded() {
        return BusinessCareIncluded;
    }
    public void setBusinessCareIncluded(boolean businessCareIncluded) {
        BusinessCareIncluded = businessCareIncluded;
    }
    public boolean isCollectiveAgreement() {
        return CollectiveAgreement;
    }
    public void setCollectiveAgreement(boolean collectiveAgreement) {
        CollectiveAgreement = collectiveAgreement;
    }
    public boolean isOccupationalIncluded() {
        return OccupationalIncluded;
    }
    public void setOccupationalIncluded(boolean occupationalIncluded) {
        OccupationalIncluded = occupationalIncluded;
    }
    public boolean isFruitBasketIncluded() {
        return FruitBasketIncluded;
    }
    public void setFruitBasketIncluded(boolean fruitBasketIncluded) {
        FruitBasketIncluded = fruitBasketIncluded;
    }
    public boolean isBreakfastIncluded() {
        return BreakfastIncluded;
    }
    public void setBreakfastIncluded(boolean breakfastIncluded) {
        BreakfastIncluded = breakfastIncluded;
    }
    public boolean isLunchIncluded() {
        return LunchIncluded;
    }
    public void setLunchIncluded(boolean lunchIncluded) {
        LunchIncluded = lunchIncluded;
    }
    public boolean isDinnerIncluded() {
        return DinnerIncluded;
    }
    public void setDinnerIncluded(boolean dinnerIncluded) {
        DinnerIncluded = dinnerIncluded;
    }
    public boolean isProjectSteeringAgilt() {
        return ProjectSteeringAgilt;
    }
    public void setProjectSteeringAgilt(boolean projectSteeringAgilt) {
        ProjectSteeringAgilt = projectSteeringAgilt;
    }
}





