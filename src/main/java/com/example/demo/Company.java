package com.example.demo;
public class Company {
    Long CompanyId, Longitude, Latitude, CarParingMonthCostSEK, NumberOfEmployee, VacationDays, NoticePeriodMonth, EducationBudgetSEK, WellnessContribution;
    String companyName, Address, PostalCode, City, Tag, ProfitMarginal, NetSalesChange, PropotionOfWomanWithinITDep, PropotionOfWomanWithinBoard, PropotionOfWomanWithinLeadManagement, StaffTurnover, BackendProgramLanguage, FrontendProgramLanguage, OperativSystem;
    boolean BikeRoomAvailable, CarParkingAvailable, MeditationRoom, PermanentWorkplaces, MoreThanOneOffice, Benify, UnionConnected, GroupInsuranceIncluded, BusinessCareIncluded, CollectiveAgreement, OccupationalIncluded, FruitBasketIncluded, BreakfastIncluded, LunchIncluded, DinnerIncluded, ProjectSteeringAgilt;
    public Company() {
    }

    public Company(Long companyId, String companyName, String address) {
        CompanyId = companyId;
        this.companyName = companyName;
        this.Address = address;
    }

    public Long getCompanyId() {
        return CompanyId;
    }
    public void setCompanyId(Long companyId) {
        this.CompanyId = companyId;
    }
    public Long getLongitude() {
        return Longitude;
    }
    public void setLongitude(Long longitude) {
        Longitude = longitude;
    }
    public Long getLatitude() {
        return Latitude;
    }
    public void setLatitude(Long latitude) {
        Latitude = latitude;
    }
    public Long getCarParingMonthCostSEK() {
        return CarParingMonthCostSEK;
    }
    public void setCarParingMonthCostSEK(long carParingMonthCostSEK) {
        CarParingMonthCostSEK = carParingMonthCostSEK;
    }
    public long getNumberOfEmployee() {
        return NumberOfEmployee;
    }
    public void setNumberOfEmployee(Long numberOfEmployee) {
        NumberOfEmployee = numberOfEmployee;
    }
    public long getVacationDays() {
        return VacationDays;
    }
    public void setVacationDays(Long vacationDays) {
        VacationDays = vacationDays;
    }
    public Long getNoticePeriodMonth() {
        return NoticePeriodMonth;
    }
    public void setNoticePeriodMonth(Long noticePeriodMonth) {
        NoticePeriodMonth = noticePeriodMonth;
    }
    public Long getEducationBudgetSEK() {
        return EducationBudgetSEK;
    }
    public void setEducationBudgetSEK(Long educationBudgetSEK) {
        EducationBudgetSEK = educationBudgetSEK;
    }
    public Long getWellnessContribution() {
        return WellnessContribution;
    }
    public void setWellnessContribution(Long wellnessContribution) {
        WellnessContribution = wellnessContribution;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getAddress() {
        return this.Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getPostalCode() {
        return PostalCode;
    }
    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getTag() {
        return Tag;
    }
    public void setTag(String tag) {
        Tag = tag;
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
        return BackendProgramLanguage;
    }
    public void setBackendProgramLanguage(String backendProgramLanguage) {
        BackendProgramLanguage = backendProgramLanguage;
    }
    public String getFrontendProgramLanguage() {
        return FrontendProgramLanguage;
    }
    public void setFrontendProgramLanguage(String frontendProgramLanguage) {
        FrontendProgramLanguage = frontendProgramLanguage;
    }
    public String getOperativSystem() {
        return OperativSystem;
    }
    public void setOperativSystem(String operativSystem) {
        OperativSystem = operativSystem;
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





