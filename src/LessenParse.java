import java.util.Arrays;

public class LessenParse {
    public void textParseFirst(String[] car){

        System.out.println(Arrays.toString(car));

        for (String string : car){
            if (string.startsWith("Ж")){
                System.out.println(string);
            }
        }
    }
    public void textParsePast(String[] car){
        for (String string : car){
            if (string.endsWith("а")){
                System.out.println(string);
            }
        }
    }
    String cari = new String();
    public void textParseString(String[] car){
        for (String s : car){
            cari = cari + String.format("%s ", s);
        }
        System.out.println(cari);
    }
}
