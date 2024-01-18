public class App {
    public static void main(String[] args) throws Exception {
        int number = 10;
        String sign;
        String multiple;

        if (number >= 0) {
            sign = "positivo";
        } else {
            sign = "negativo";
        }
        if (number % 2 == 0) {
            multiple = "par";
        } else {
            multiple = "ímpar";
        }

        System.out.println(number + " é " + multiple + " e " + sign + ".");
    }
}
