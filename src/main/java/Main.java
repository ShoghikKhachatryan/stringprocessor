public class Main {


    public static void main(String[] args) {
        String hallo = "Hallo Word!";
        StringProcessDemo stringProcessDemo = new StringProcessDemo();

        System.out.println(stringProcessDemo.reverse(hallo));
        System.out.println(stringProcessDemo.defaultProcessReverse(hallo));

        int number = 80;
        NumberProcessorDemo numberProcessorDemo = new NumberProcessorDemo();
        System.out.println(numberProcessorDemo.doubleValue(number));
        System.out.println(numberProcessorDemo.square(number));
        System.out.println(numberProcessorDemo.incrementByOne(number));
    }
}
