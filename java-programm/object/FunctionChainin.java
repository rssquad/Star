import java.util.function.*;
class FunctionChainin
{
    public static void main(String[] args)
    {
        Function<Integer,Integer> f1 = n->n*n*n;
        Function<Integer,Integer> f2 = n->2*n;
        System.out.println(f1.andThen(f2).apply(5));
        System.out.println(f1.compose(f2).apply(5));

    }
}