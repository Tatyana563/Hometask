package oop;

import java.util.*;
//Сделать метод, на вход которого будет передаваться строка
// (к примеру большой кусок текста) а результат работы метода
// будет вывод информации на консоль, информация должна быть
// следующего характера: сколько слов в тексте,
// вывести первые 5 самым распространенных слов,
// вывести 2 самых редких слова,
// вывести количество символов исключая пробелы.

public class highestFrequency {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "lemon","lemon","lemon","lemon","apple", "apple", "pear", "orange", "orange", "orange","cherry","cherry","cherry","cherry","cherry");
        highestFrequency h = new highestFrequency();
        h.createFrequencyList(list1,5);
    }
    //Create hashmap to store word + its frequency
    public void createFrequencyList(List<String> list, Integer wordNumber) {
        List<Integer> result = new ArrayList<>();
        String key = "";
        int value = 0;

        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (hashmap.containsKey(list.get(i))) {
                hashmap.put(list.get(i), hashmap.get(list.get(i)) + 1);
            } else {
                hashmap.put(list.get(i), 1);
            }
        }
        // find the most frequent
        for (Map.Entry<String, Integer> map : hashmap.entrySet()) {

            if (map.getValue() > value) {
                value = map.getValue();
                key = map.getKey();
            }

        }
       // System.out.println(key);
        //Create a list of values (number of words) and sort to see which are the most frequent)
        for (Map.Entry<String, Integer> map : hashmap.entrySet()){
          int resultValue= map.getValue();
          result.add(resultValue);
          Collections.sort(result, Collections.reverseOrder());
          //  System.out.println(result);
        }
// Pick up only first 5(Wordnumber) words from the list - 5 most frequent
        for (Map.Entry<String, Integer> map : hashmap.entrySet()) {
            for (int i = 0; i < wordNumber; i++) {
                if (map.getValue().equals(result.get(i))){
                    System.out.println(map.getKey());
                    System.out.println(map.getValue());
                }
            }
        }
    }
}








