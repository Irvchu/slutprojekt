package com.example.demo;
public class Company {
    float longitude, latitude;
    Long companyId;
    int  carParingMonthCostSEK, numberOfEmployee, vacationDays, noticePeriodMonth, educationBudgetSEK, wellnessContributionSEK;
    String logo,companyName, address, postalCode, city, tag, profitMarginal, netSalesChange, propotionOfWomanWithinITDep, propotionOfWomanWithinBoard, propotionOfWomanWithinLeadManagement, staffTurnover, backendProgramLanguage, frontendProgramLanguage, operationSystem;
    boolean bikeRoomAvailable, carParkingAvailable, meditationRoom, permanentWorkplaces, moreThanOneOffice, benify, unionConnected, groupInsuranceIncluded, businessCareIncluded, collectiveAgreement, occupationalIncluded, fruitBasketIncluded, breakfastIncluded, lunchIncluded, dinnerIncluded, projectSteeringAgilt;

    public Company() {
    }

    public Company(Long companyId, String companyName, String address, String frontendProgramLanguage,
                   String backendProgramLanguage, String operationSystem) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.address = address;
        this.frontendProgramLanguage = frontendProgramLanguage;
        this.backendProgramLanguage = backendProgramLanguage;
        this.operationSystem = operationSystem;
    }


    public Company(Long companyId, float longitude, float latitude, /*int carParingMonthCostSEK,*/ int numberOfEmployee, int vacationDays, int noticePeriodMonth, int educationBudgetSEK, int wellnessContributionSEK, String logo, String companyName, String address, String postalCode, String city, String tag, String profitMarginal, String netSalesChange, String propotionOfWomanWithinITDep, String propotionOfWomanWithinBoard, String propotionOfWomanWithinLeadManagement, String staffTurnover, String backendProgramLanguage, String frontendProgramLanguage, String operationSystem, boolean bikeRoomAvailable, boolean carParkingAvailable, boolean meditationRoom, boolean permanentWorkplaces, boolean moreThanOneOffice, boolean benify, boolean unionConnected, boolean groupInsuranceIncluded, boolean businessCareIncluded, boolean collectiveAgreement, boolean occupationalIncluded, boolean fruitBasketIncluded, boolean breakfastIncluded, boolean lunchIncluded, boolean dinnerIncluded, boolean projectSteeringAgilt) {
        this.companyId = companyId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.carParingMonthCostSEK = carParingMonthCostSEK;
        this.numberOfEmployee = numberOfEmployee;
        this.vacationDays = vacationDays;
        this.noticePeriodMonth = noticePeriodMonth;
        this.educationBudgetSEK = educationBudgetSEK;
        this.wellnessContributionSEK = wellnessContributionSEK;
        this.logo = logo;
        this.companyName = companyName;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.tag = tag;
        this.profitMarginal = profitMarginal;
        this.netSalesChange = netSalesChange;
        this.propotionOfWomanWithinITDep = propotionOfWomanWithinITDep;
        this.propotionOfWomanWithinBoard = propotionOfWomanWithinBoard;
        this.propotionOfWomanWithinLeadManagement = propotionOfWomanWithinLeadManagement;
        this.staffTurnover = staffTurnover;
        this.backendProgramLanguage = backendProgramLanguage;
        this.frontendProgramLanguage = frontendProgramLanguage;
        this.operationSystem = operationSystem;
        this.bikeRoomAvailable = bikeRoomAvailable;
        this.carParkingAvailable = carParkingAvailable;
        this.meditationRoom = meditationRoom;
        this.permanentWorkplaces = permanentWorkplaces;
        this.moreThanOneOffice = moreThanOneOffice;
        this.benify = benify;
        this.unionConnected = unionConnected;
        this.groupInsuranceIncluded = groupInsuranceIncluded;
        this.businessCareIncluded = businessCareIncluded;
        this.collectiveAgreement = collectiveAgreement;
        this.occupationalIncluded = occupationalIncluded;
        this.fruitBasketIncluded = fruitBasketIncluded;
        this.breakfastIncluded = breakfastIncluded;
        this.lunchIncluded = lunchIncluded;
        this.dinnerIncluded = dinnerIncluded;
        this.projectSteeringAgilt = projectSteeringAgilt;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public Long getCompanyId() {
        return this.companyId;
    }
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public float getLongitude() {
        return longitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    public float getLatitude() {
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
        return educationBudgetSEK;
    }
    public void setEducationBudgetSEK(int educationBudgetSEK) {
        this.educationBudgetSEK = educationBudgetSEK;
    }
    public int getWellnessContributionSEK() {
        return wellnessContributionSEK;
    }
    public void setWellnessContributionSEK(int wellnessContributionSEK) {
        this.wellnessContributionSEK = wellnessContributionSEK;
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
        return profitMarginal;
    }
    public void setProfitMarginal(String profitMarginal) {
        this.profitMarginal = profitMarginal;
    }
    public String getNetSalesChange() {
        return netSalesChange;
    }
    public void setNetSalesChange(String netSalesChange) {
        this.netSalesChange = netSalesChange;
    }
    public String getPropotionOfWomanWithinITDep() {
        return propotionOfWomanWithinITDep;
    }
    public void setPropotionOfWomanWithinITDep(String propotionOfWomanWithinITDep) {
        this.propotionOfWomanWithinITDep = propotionOfWomanWithinITDep;
    }
    public String getPropotionOfWomanWithinBoard() {
        return propotionOfWomanWithinBoard;
    }
    public void setPropotionOfWomanWithinBoard(String propotionOfWomanWithinBoard) {
        this.propotionOfWomanWithinBoard = propotionOfWomanWithinBoard;
    }
    public String getPropotionOfWomanWithinLeadManagement() {
        return propotionOfWomanWithinLeadManagement;
    }
    public void setPropotionOfWomanWithinLeadManagement(String propotionOfWomanWithinLeadManagement) {
        this.propotionOfWomanWithinLeadManagement = propotionOfWomanWithinLeadManagement;
    }
    public String getStaffTurnover() {
        return staffTurnover;
    }
    public void setStaffTurnover(String staffTurnover) {
        this.staffTurnover = staffTurnover;
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
    public String getOperationSystem() {
        return operationSystem;
    }
    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    public boolean isBikeRoomAvailable() {
        return bikeRoomAvailable;
    }
    public void setBikeRoomAvailable(boolean bikeRoomAvailable) {
        this.bikeRoomAvailable = bikeRoomAvailable;
    }
    public boolean isCarParkingAvailable() {
        return carParkingAvailable;
    }
    public void setCarParkingAvailable(boolean carParkingAvailable) {
        this.carParkingAvailable = carParkingAvailable;
    }
    public boolean isMeditationRoom() {
        return meditationRoom;
    }
    public void setMeditationRoom(boolean meditationRoom) {
        this.meditationRoom = meditationRoom;
    }
    public boolean isPermanentWorkplaces() {
        return permanentWorkplaces;
    }
    public void setPermanentWorkplaces(boolean permanentWorkplaces) {
        this.permanentWorkplaces = permanentWorkplaces;
    }
    public boolean isMoreThanOneOffice() {
        return moreThanOneOffice;
    }
    public void setMoreThanOneOffice(boolean moreThanOneOffice) {
        this.moreThanOneOffice = moreThanOneOffice;
    }
    public boolean isBenify() {
        return benify;
    }
    public void setBenify(boolean benify) {
        this.benify = benify;
    }
    public boolean isUnionConnected() {
        return unionConnected;
    }
    public void setUnionConnected(boolean unionConnected) {
        this.unionConnected = unionConnected;
    }
    public boolean isGroupInsuranceIncluded() {
        return groupInsuranceIncluded;
    }
    public void setGroupInsuranceIncluded(boolean groupInsuranceIncluded) {
        this.groupInsuranceIncluded = groupInsuranceIncluded;
    }
    public boolean isBusinessCareIncluded() {
        return businessCareIncluded;
    }
    public void setBusinessCareIncluded(boolean businessCareIncluded) {
        this.businessCareIncluded = businessCareIncluded;
    }
    public boolean isCollectiveAgreement() {
        return collectiveAgreement;
    }
    public void setCollectiveAgreement(boolean collectiveAgreement) {
        this.collectiveAgreement = collectiveAgreement;
    }
    public boolean isOccupationalIncluded() {
        return occupationalIncluded;
    }
    public void setOccupationalIncluded(boolean occupationalIncluded) {
        this.occupationalIncluded = occupationalIncluded;
    }
    public boolean isFruitBasketIncluded() {
        return fruitBasketIncluded;
    }
    public void setFruitBasketIncluded(boolean fruitBasketIncluded) {
        this.fruitBasketIncluded = fruitBasketIncluded;
    }
    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }
    public void setBreakfastIncluded(boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }
    public boolean isLunchIncluded() {
        return lunchIncluded;
    }
    public void setLunchIncluded(boolean lunchIncluded) {
        this.lunchIncluded = lunchIncluded;
    }
    public boolean isDinnerIncluded() {
        return dinnerIncluded;
    }
    public void setDinnerIncluded(boolean dinnerIncluded) {
        this.dinnerIncluded = dinnerIncluded;
    }
    public boolean isProjectSteeringAgilt() {
        return projectSteeringAgilt;
    }
    public void setProjectSteeringAgilt(boolean projectSteeringAgilt) {
        this.projectSteeringAgilt = projectSteeringAgilt;
    }
}





