public class Main {
    public static void main(String[] args) {
        BubbleSort array = new BubbleSort(8);

        array.into(156);
        array.into(187);
        array.into(276);
        array.into(560);
        array.into(580);
        array.into(46);
        array.into(120);

        array.printer();
        array.bubbleSorted();
        array.printer();
    }
    }

