public class Dzielenie {
    public static void main(String[] args) {
        int i = 45;
        boolean result = (i % 5) == 0 && (i % 7) == 0;

        System.out.println("Czy liczba"+ i + " dzieli się przez 5 i 7 jedznocześnie? " + result);
    }
}
