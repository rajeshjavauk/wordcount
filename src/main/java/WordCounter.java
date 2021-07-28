import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private Map<String, Long> wordMap = new HashMap<>();

    public void add(String word) {
        var filters = new Validator();
        if (filters.execute(word)) {
            var translator = new Translator();
            word = translator.execute(word);
            wordMap.put(word, wordMap.compute(word, (k, v) -> (v == null) ? 1 : v + 1));
        }
    }

    public Long wordCount(String word) {
        return wordMap.getOrDefault(word, 0L);
    }

}
