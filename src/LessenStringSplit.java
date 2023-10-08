import java.util.Arrays;

public class LessenStringSplit {
    public void textSplit(String text){

        String[] str = text.split(" ");   // в ковычках указываем как будем разделять строку
        System.out.println(Arrays.toString(str)); // выведет массив строк

        String stroka = String.format("добавить %s",text); // %s добавит строчку в это место
        System.out.println(stroka);
    }
}
