public class LessenFactorial {
    int factorial(int number) {
        if (number == 0) {
            return 0;
        }else if(number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }

}
