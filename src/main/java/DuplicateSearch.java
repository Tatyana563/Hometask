import java.util.*;

public class DuplicateSearch {
    public void searchDuplicates(String str){
        List<String> list = Arrays.asList(str.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        for(String word: uniqueWords){
            System.out.println(word +" "+ Collections.frequency(list, word));
        }
    }
    public void amountOfElements(String str) {
        int result;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                //Если пробел - увеличиваем количество слов на 1
                count++;

            }
        }
       result=str.length()-count;
        System.out.println("Number of letters" + " " + result);
    }
    public void numberOfWords(String text){


        String trimmed = text.trim();
        int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s").length;
        System.out.println(words);
    }

    public static void main(String[] args) {
        DuplicateSearch d = new DuplicateSearch();
        String str ="  apple apple apple  ";
       d.searchDuplicates(str);
      // d.amountOfElements(str);
      //  d.numberOfWords(str);
    }
}
