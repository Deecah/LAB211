
package week8.Geographic;

public class EastAsiaCountries extends Country{
    private String countryTerrain;

    public EastAsiaCountries(String countryTerrain, String countryCode, double totalArea, String countryName) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries() {
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return super.toString() + " || " +countryTerrain;
    }
    
}
