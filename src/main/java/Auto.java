import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Auto {
    String manufacture;
    String color;
    int year;

    public Auto(String manufacture, String color, int year) {
        this.manufacture = manufacture;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "manufacture='" + manufacture + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
    // Найти машины новее определенного года выпуска
    public void filterCarByYear(List<Auto> cars, int maxYear){
       List<Auto> filteredCars= cars.stream().filter(p->p.year>maxYear)
            //    .collect(Collectors.joining(", ", "{", "}"));
        .collect(Collectors.toList());
        System.out.println(filteredCars);
    }
    public void printCarsProducedInAPeriod(List<Auto> cars, int year1, int year2){
        List<Auto> resulr = new ArrayList<>();
                cars.stream()
                .filter(w->w.year>year1&&w.year<year2)
                        .forEach(System.out::println);
    }

    public void deleteCarsProducedinAPeriod(List<Auto> list,int year1, int year2){
        list.removeIf(e->e.year>year1&&e.year<year2);
        System.out.println(list);
    }

    public static void main(String[] args) {
        Auto c1 = new Auto("Toyota","blue",2010);
        Auto c2 = new Auto("Ford","green",2006);
        Auto c3 = new Auto(" Honda","red",2005);
        Auto c4 = new Auto(" Suzuki","white",2001);
       List<Auto> autoList = new ArrayList<>();
        Collections.addAll(autoList, c1,c2,c3,c4);
        //c1.filterCarByYear(autoList,2005);
        c1.deleteCarsProducedinAPeriod(autoList,2004,2007);

    }
}
