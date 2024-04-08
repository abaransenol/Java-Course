public class City {

    private int id;
    private String Name;
    private int Population;
    private int Altitude;
    
    public City(String Name, int Population, int Altitude) {
        this.Name = Name;
        this.Population = Population;
        this.Altitude = Altitude;
    }
    
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Population
     */
    public int getPopulation() {
        return Population;
    }

    /**
     * @param Population the Population to set
     */
    public void setPopulation(int Population) {
        this.Population = Population;
    }

    /**
     * @return the Altitude
     */
    public int getAltitude() {
        return Altitude;
    }

    /**
     * @param Altitude the Altitude to set
     */
    public void setAltitude(int Altitude) {
        this.Altitude = Altitude;
    }
    
}
