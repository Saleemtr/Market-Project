package matala1java;

public class Address {
    private String countryName;
    private String cityName;
    private String streetName;
    private String buildingNumber;

    public Address(String countryName , String cityName , String streetName , String buildingNumber) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;


    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return "matala1java.Address" + "[ " + "Country : " + countryName + " | " + "City : " + cityName +" | " + "Street Name : "  + streetName + " | "
                + "Building Number : " + buildingNumber ;
    }
}



