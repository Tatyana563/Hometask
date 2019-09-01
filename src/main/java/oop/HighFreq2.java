package oop;

import java.util.*;
//Сделать метод, на вход которого будет передаваться строка
// (к примеру большой кусок текста) а результат работы метода
// будет вывод информации на консоль, информация должна быть
// следующего характера: сколько слов в тексте,
// вывести первые 5 самым распространенных слов,
// вывести 2 самых редких слова,
// вывести количество символов исключая пробелы.
public class HighFreq2 {
    public static void main(String[] args) {
        String in = "Lorem ipsum dolor sit amet amet amet amet amet amet amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore labore labore labore labore labore labore labore labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi nisi nisi nisi nisi nisi nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur Excepteur Excepteur Excepteur Excepteur Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit mollit mollit mollit mollit mollit anim id est laborum";
        HighFreq2 h = new HighFreq2();
        h.createFrequencyList(Arrays.asList(in.trim().replaceAll(",|\\.", "").split(" ")), 5);
    }

    //Create hashmap to store word + its frequency
    public void createFrequencyList(List<String> list, Integer wordNumber) {
        Set<Integer> result = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        String key = "";
        int value = 0;

        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            //k =  dollore
            //v = hashmap.get("dollore")
            // hashmap.put("dolore",
            //++count === v = count + 1;
            //count++ === v = count; count = count + 1;
            hashmap.compute(list.get(i), (k, v) -> v == null ? 1 : ++v);
        }

        System.out.println(hashmap);

        //Create a list of values (number of words) and sort to see which are the most frequent)
        for (Map.Entry<String, Integer> map : hashmap.entrySet()) {
            int resultValue = map.getValue();
            result.add(resultValue);

            //  System.out.println(result);
        }

// Pick up only first 5(Wordnumber) words from the list - 5 most frequent

        //mollit = 6
        int count = 0;
        for (Iterator<Integer> iterator = result.iterator(); iterator.hasNext();) {
            // iteration 0 = 6
            // iteration 1 = 6
            if (count > wordNumber-1) break;
            Integer v = iterator.next();
            for (Map.Entry<String, Integer> map : hashmap.entrySet()) {

                if (map.getValue().equals(v)) {
                    System.out.println(map.getKey());
                    System.out.println(map.getValue());
                    count++;
                }
            }

        }
    }


}
