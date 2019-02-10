import java.util.function.*;
class Consumers
{
    public static void main(String[] args)
    {
        Consumer<Movie> c1 = c->System.out.println(c.name + " Reales soon..!!");
        Consumer<Movie> c2 = c->System.out.println(c.name + " realesed but bigger flop..!!");
        Consumer<Movie> c3 = c->System.out.println(c.name + " saved in database..");
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        Movie m = new Movie("Spider");
        cc.accept(m);
    }
}

class Movie{

    String name;

    Movie(String name)
    {
        this.name = name;
    }
}
