 class Detergent extends Cleanser {
   }
class Cleanser{
    private String s = "Cleanser";
    public void append (String a){

        s+=a;
    }
    public void scrub(){
        append("scrub");
    }
}
class ExtremelyClean extends Detergent{
    String name;
    public void sterilise(){
        System.out.println("sterilise it!");
    }

    @Override
    public void scrub() {
        super.scrub();
        System.out.println("It was scrubed and very clean");
    }

    @Override
    public String toString() {
        return "ExtremelyClean{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ExtremelyClean extremelyClean = new ExtremelyClean();
      extremelyClean.scrub();
      extremelyClean.sterilise();
        System.out.println(extremelyClean);
      //  Detergent.main(args);
    }
}