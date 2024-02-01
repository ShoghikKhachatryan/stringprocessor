public class StringProcessDemo {
    private final StringProcessor reverse = (string) -> {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.toUpperCase());
        return stringBuilder.reverse().toString();
    };

    public String reverse(String string) {
        return reverse.process(string);
    }

    public String defaultProcessReverse(String string) {
        return reverse.defaultProcess(string);
    }
}
