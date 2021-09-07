import java.util.UUID;

public class Airport {
    private UUID id = UUID.randomUUID();
    private String countryName;
    private String countryICAO;
    private String icao;
    private String name;
    private String assoccity;
    private String longitude;
    private String latitude;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryICAO() {
        return countryICAO;
    }

    public void setCountryICAO(String countryICAO) {
        this.countryICAO = countryICAO;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssoccity() {
        return assoccity;
    }

    public void setAssoccity(String assoccity) {
        this.assoccity = assoccity;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}