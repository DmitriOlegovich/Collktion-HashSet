import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private Set<String> words = new HashSet<>();

    public WordsChecker(String text){
        this.words.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String newWord){
        return words.contains(newWord);
    }


}
