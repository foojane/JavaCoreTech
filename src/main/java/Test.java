public class Test
{
    public static void main(String[] args)
    {
        Movable m = new Car();
        ((Car) m).fix();
    }

}

enum Size
{
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE
}

interface Movable
{
    void run();
}

class Car implements Movable
{

    public void run()
    {
        System.out.println("run");
    }

    public void fix()
    {
        System.out.println("fix");
    }

}

class Plane implements Movable
{
    public void run()
    {
        System.out.println("fly");
    }
}

class Train implements Movable
{
    public void run()
    {
        System.out.println("train run");
    }
}

