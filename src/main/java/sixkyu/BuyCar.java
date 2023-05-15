package main.java.sixkyu;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        double saving = 0;
        double leftOver;

        while((priceOld+saving)< priceNew){
            month++;
            if(month % 2 == 0){
                percentLossByMonth += 0.5;
            }
            double decrement = percentLossByMonth / 100;
            priceOld -= priceOld * decrement;
            priceNew -= priceNew * decrement;
            saving += savingperMonth;}

        leftOver = (priceOld+saving)-priceNew;
        return new int []{
                month, (int)Math.round(leftOver)
        };
    }
}
