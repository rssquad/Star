class ImmutableExa
{
    public static void main(String[] args)
    {
        System.out.println("This is immutableexa class..!!");

        Immutable im = new Immutable("Radhika", 101);
        // im.setName("Kaipan");
        System.out.println(im.getName() + " " + im.getId());
               
    }
}


 final class  Immutable{

    // final String str = "This is immutable example";

    // public String getStr() {
    //     return str;
    // }

private final String name;
private final int id;

public Immutable(String name, int id)
{
    this.name = name;
    this.id = id;
}
public String getName()
{
    return name;
}

public int getId()
{
    return id;
}


}