package cz.educanet.beans;

public class World {
    private String name;
    private String continent;
    private long area;
    private long population;
    private long gdp;
    private String capital;
    private String tld;
    private String flagLink;

    public World(String name, String continent, long area, long population, long gdp, String capital, String tld, String flagLink) {
        this.name = name;
        this.continent = continent;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
        this.capital = capital;
        this.tld = tld;
        this.flagLink = flagLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getGdp() {
        return gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getTld() {
        return tld;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    public String getFlagLink() {
        return flagLink;
    }

    public void setFlagLink(String flagLink) {
        this.flagLink = flagLink;
    }
}
