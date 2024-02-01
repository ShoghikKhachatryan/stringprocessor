public interface StringProcessor {
    String process(String input);

    default String defaultProcess(String string) {
        return "Processed:" + process(string);
    }
}
