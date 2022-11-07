
public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager(new int[]{5, 6, 8, 10, 11});
        System.out.println(salesManager.max());

        int cutAverage = salesManager.cutAverage();
        System.out.println("Обрезанное среднее объема продаж:" + cutAverage);
    }
}