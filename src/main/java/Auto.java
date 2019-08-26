import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Auto {
    List<Auto> list = new ArrayList<>();
    String manufacture;
    String color;
    int year;
    int id;

    public Auto(String manufacture, String color, int year, int id) {
        this.manufacture = manufacture;
        this.color = color;
        this.year = year;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Auto{" +
              
                ", manufacture='" + manufacture + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }

    public void addCars(Auto a, List<Auto> list){
        list.add(a);
    }
    public void deleteCars(Auto a, List<Auto> list){
      list.remove(a);
    }
    public void printCars(List<Auto> list){
        System.out.println(list);
    }
    public void deleteAllCars(List<Auto> list){
       list.clear();
    }
    // Машина была перекрашена
    public void updateCars(Auto a, List<Auto> list){
     for(int i=0;i<list.size();i++){
         if(list.get(i).id==a.id){
             list.get(i).color=a.color;
         }

     }

    }
    // Найти машины новее определенного года выпуска
    public void filterCarByYear(List<Auto> cars, int maxYear){
       List<Auto> filteredCars= cars.stream().filter(p->p.year>maxYear)
            //    .collect(Collectors.joining(", ", "{", "}"));
        .collect(Collectors.toList());
        System.out.println(filteredCars);
    }
    //Найти машины год выпуска которых попал в интервал
    public void printCarsProducedInAPeriod(List<Auto> cars, int year1, int year2){
        List<Auto> resulr = new ArrayList<>();
                cars.stream()
                .filter(w->w.year>year1&&w.year<year2)
                        .forEach(System.out::println);
    }
// Удалить машины год выпуска которых попал в интервал
    public void deleteCarsProducedinAPeriod(List<Auto> list,int year1, int year2){
        list.removeIf(e->e.year>year1&&e.year<year2);
        System.out.println(list);
    }

    public static void main(String[] args) {
        Auto c1 = new Auto("Toyota","blue",2010,1);
        Auto c2 = new Auto("Ford","green",2006,2);
        Auto c3 = new Auto(" Honda","red",2005,3);
        Auto c4 = new Auto(" Suzuki","white",2001,4);
        Auto c5 = new Auto("Toyota","red",2010,1);
       List<Auto> autoList = new ArrayList<>();
        Collections.addAll(autoList, c1,c2,c3,c4);
//       c1.addCars(c1, autoList);
//       c1.deleteCars(c1, autoList);
//       c1.printCars(autoList);
//       c1.deleteAllCars(autoList);
//
//        c1.filterCarByYear(autoList,2005);
//        c1.deleteCarsProducedinAPeriod(autoList,2004,2007);
c1.updateCars(c5, autoList);
        c1.printCars(autoList);
    }
}
