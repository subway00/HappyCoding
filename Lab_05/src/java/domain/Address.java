package domain;

public class Address {
    private String address1;
    private String address2;
    private String city;
    private String region;
    private String postcode;
    
    public Address(String address1, String address2, String city, String region, String postcode) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.region = region;
        this.postcode = postcode;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAdress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
            
}
