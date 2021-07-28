import java.util.AbstractMap;
import java.util.Map;

public class Translator implements Command<String, String> {

    private static final Map<String, String> WORD_DICTIONARY = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("flor", "flower"),
            new AbstractMap.SimpleEntry<>("blume", "flower")
    );

    @Override
    public String execute(String input) {
        return WORD_DICTIONARY.getOrDefault(input, input);
    }
}
