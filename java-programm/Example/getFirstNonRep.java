import java.util.LinkedHashMap;
import java.util.Map;

public class getFirstNonRep {

public static char get(String s) throws Exception {
    if (s.length() == 0) {
        System.out.println("Fail");
        System.exit(0);
    } else {
        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> hm : m.entrySet()) {
            if (hm.getValue() == 1) {
                return hm.getKey();
            }
        }
    }
    return 0;
}

public static void main(String[] args) throws Exception {

    System.out.print(get("RaRdhdika"));

    }

 }