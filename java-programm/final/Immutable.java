public final class  Immutable{

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