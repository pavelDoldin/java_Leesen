public class Main {
    public static void main(String[] args) {
        LessenHelloWorld lessenHelloWorld = new LessenHelloWorld();// Вызываем класс lessenHelloWorld
        lessenHelloWorld.hello();       //Пользуемся метадом hello  для приветствия

        LessenStringSplit lessenStringSplit = new LessenStringSplit();// Вызываем класс lessenStringSplit
        String text = "Привет с новым годом !";
        lessenStringSplit.textSplit(text);          // Пользуемся метадом textSplit для разделения строки



        LessenFactorial lessenFactorial = new LessenFactorial();  // Вызываем класс lessenFactorial
        System.out.println(lessenFactorial.factorial(5));  // Пользуемся метадом factorial


        LessenParse lessenParseFirst = new LessenParse();
        String[] car = {"Москвич", "Лада", "Жигули", "Камаз", "Нива", "Зил", "Аурус"};
        lessenParseFirst.textParseFirst(car);// выведит все по первой букве
        lessenParseFirst.textParsePast(car);
        lessenParseFirst.textParseString(car);
    }
}