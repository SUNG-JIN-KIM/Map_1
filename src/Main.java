import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        int sum = 0;


        for (int price : fruitPrices.values()) {
            sum += price;
        }

        double average = (double) sum / fruitPrices.size();

        System.out.println("전체 과일 가격의 평균: " + average);
    }
}
