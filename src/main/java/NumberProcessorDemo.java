public class NumberProcessorDemo {

    private final NumberProcessor doubleValue = (value) -> {
        return 2 * value;
    };

    private final NumberProcessor square = (value) -> {
        return value * value;
    };

    private final NumberProcessor incrementByOne = (value) -> {
        return ++value;
    };

    public int doubleValue(int value) {
        return doubleValue.process(value);
    }

    public int square(int value) {
        return square.process(value);
    }

    public int incrementByOne(int value) {
        return incrementByOne.process(value);
    }
}
