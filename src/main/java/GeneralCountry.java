public class GeneralCountry {
    protected void haveClimate(Climate c){
        System.out.println("The country has a" + " " + c +" "+ "climate");
    }
    protected void developEconomics(GeneralCountry generalCountry){
        System.out.println("Some branches are developed in" +" "+ generalCountry);
    }
    public enum Climate{
        Tropical,Temperate, Dry,Continental,Polar;
    }
  public GeneralCity findCity(){
        return new GeneralCity(200,200);
  }

    @Override
    public String toString() {
        return "GeneralCountry{}";
    }
}
class Country1 extends GeneralCountry {
City1 city1 = new City1(100,50);
    @Override
    protected void haveClimate(Climate c) {
        super.haveClimate(c);
        System.out.println("It is warm and sunny");
    }

    @Override
    protected void developEconomics(GeneralCountry generalCountry) {
        super.developEconomics(generalCountry);
        System.out.println("Agriculture is developed");
    }

    @Override
    public String toString() {
        return "Country1{}";
    }
 public City1 findCity(){
        return new City1(300,300);
 }

}

    class Europe{
    public static void main(String[] args) {
        Country1 country1 = new Country1();
        country1.developEconomics(country1);// upcasting?

        country1.haveClimate(GeneralCountry.Climate.Tropical);
        country1.city1.haveArea(country1.city1);//composition???
        //ковариантность возвр. типов ст.258
        GeneralCountry g1 = new GeneralCountry();
        GeneralCity c1 = g1.findCity();
        System.out.println(c1);
        g1= new Country1();
        c1=g1.findCity();
        System.out.println(c1);

        BuildingDelegation buildingDelegation = new BuildingDelegation();
        buildingDelegation.construction(10,10,10);


//
    }
}
class GeneralCity{
    int population;
    double area;
    public void havePopulation(GeneralCity generalCity){

    }
    public void haveArea(GeneralCity generalCity){

    }

    public GeneralCity(int population, double area) {
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString() {
        return "GeneralCity{" +
                "population=" + population +
                ", area=" + area +
                '}';
    }
}
class City1 extends GeneralCity{


    @Override
    public void havePopulation(GeneralCity generalCity) {
        super.havePopulation(generalCity);
        System.out.println("Population: "+generalCity.population);
    }

    @Override
    public void haveArea(GeneralCity generalCity) {
        super.haveArea(generalCity);
        System.out.println("Area: "+generalCity.area);
    }

    public City1(int population, double area) {
        super(population, area);
    }

    @Override
    public String toString() {
        return "City1{" +
                "population=" + population +
                ", area=" + area +
                '}';
    }
}
//delegation
class BuildingCreation{
    public void hightCreation(int hight){
        System.out.println("hight:"+hight);
    }
    public void widthCreation(int width){
        System.out.println("width:"+width);
    }
    public void lengthCreation(int length){
        System.out.println("length:"+length);
    }
}
class BuildingDelegation{
    BuildingCreation buildingCreation = new BuildingCreation();
    public void construction(int h, int w, int l){
       buildingCreation.hightCreation(h);
       buildingCreation.lengthCreation(l);
       buildingCreation.widthCreation(w);
       int volume =h*w*l;
        System.out.println("Volume"+volume);
    }
}