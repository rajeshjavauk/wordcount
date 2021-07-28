import java.util.AbstractMap;
import java.util.Map;

public class Validator implements Command<String, Boolean> {

    @Override
    public Boolean execute(String input) {
        return input.chars().allMatch(Character::isAlphabetic);
    }

}
