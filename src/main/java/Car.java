import java.util.*;

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
        public void compareListOfCars(List<Car> list, Set<Car> set) {
            List<Car> resultList = new ArrayList<Car>();
            for (int i = 0; i < list.size(); i ++) {
                if(set.contains(list.get(i))){
                    resultList.add(list.get(i));
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
            Car c1 = new Car("Toyota","blue",2005);
            Car c2 = new Car("Ford","green",2010);
            Car c3 = new Car("Nissan","red",2008);
            Car c4 = new Car("Suzuki","blue",2008);
            Car c5 = new Car("Renault","blue",2001);
            List<Car> carList = new ArrayList<Car>();
            Set<Car> carSet = new TreeSet<Car>();
            carSet.add(c4);
            carSet.add(c1);

            Collections.addAll(carList,c1,c2,c3);

          //  System.out.println(carList);
      // System.out.println(carSet);
        c1.compareListOfCars(carList,carSet);

        }

    @Override
    public int compareTo(Car o) {
        return manufacture.compareTo(o.manufacture);
    }
}



