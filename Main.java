import java.util.List;
import Encode_and_Decode_Strings_Question.*;
public class Main {

    public static void main(String[] args) {
        List<String> s = List.of(new String[]{"neet", "code", "love", "you"});
        System.out.println(Solution.decode(Solution.encode(s)));
    }

}
