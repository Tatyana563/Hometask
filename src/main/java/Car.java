import java.util.*;
//Данны 2 коллекции данных :
//
//коллекция в виде List машин, количество объектов Car в List = 10
//коллекция в виде Set машин, количество объектов Car в Set = 12
//
//Разработать метод с 2 входными параметрами: коллекция List и
// коллекция Set. Цель метода - сформировать коллекцию машин,
// в котором будут все машины из первой коллекции и только те машины из второй,
// год выпуск которых больше года выпуска машин из первой коллекции.
public class Car implements Comparable<Car> {
        String manufacture;
        String color;
        int year;

        public Car(String manufacture, String color, int year) {
            this.manufacture = manufacture;
            this.color = color;
            this.year = year;
        }



        @Override
        public String toString() {
            return "Car{" +
                    "manufacture='" + manufacture + '\'' +
                    ", number=" + color +
                    ", year=" + year +
                    '}';
        }

    public String getManufacture() {
        return manufacture;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void compareListOfCars(List<Car> list, Set<Car> set) {
        List<Car> resultList = new ArrayList<Car>();
        resultList.addAll(0,list);
        List<Car> finalList = new ArrayList<Car>();
        List<Car> list2= new ArrayList<Car>(set);

        for (int i = 0; i < list.size(); i ++) {
for(int j=0;j<list2.size();j++) {
    if (list2.get(j).year > list.get(i).year) {
        resultList.add(list2.get(j));
    }
}
        }
        // ArrayList<Car> b = (ArrayList<Car>)resultList.clone();

        System.out.println(resultList);
    }
    public void compareСarYears(List<Car> list, Set<Car> set) {
        List<Car> resultList = new ArrayList<>();
        resultList.addAll(0,list);
        for(Car c: set){

            for(Car w: list){

                   if(c.year>(w.year)){
                       resultList.add(c);
                   }


            }
       }
       System.out.println(resultList);
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(manufacture, car.manufacture) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacture, color, year);
    }

    public static void main(String[] args) {
            Car c1 = new Car("Toyota","blue",2001);
           // Car c6 = new Car("Toyota","blue",2002);
            Car c2 = new Car("Ford","green",2002);
            Car c3 = new Car("Nissan","red",2003);
            Car c4 = new Car("Suzuki","blue",2004);
            Car c5 = new Car("Renault","blue",2000);
            List<Car> carList = new ArrayList<Car>();
            Set<Car> carSet = new TreeSet<Car>();
            carSet.add(c3);
          //  carSet.add(c4);
          //  carSet.add(c5);
       // carSet.add(c6);// would not be added


            Collections.addAll(carList,c1,c2);

          //  System.out.println(carList);
       //System.out.println(carSet);
       // c1.compareListOfCars(carList,carSet);
        c1.compareСarYears(carList,carSet);

        }

    @Override
    public int compareTo(Car o) {
        return manufacture.compareTo(o.manufacture);
    }
}



