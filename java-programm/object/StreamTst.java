
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class StreamTst
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(67);
        list.add(78);
        list.add(90);
        list.add(23);
        list.add(89);
    }

    public void filterUse(List<Integer> markList)
    {
        List<Integer> filterMarks = markList.stream().filter(m -> m >= 90)
    }
}