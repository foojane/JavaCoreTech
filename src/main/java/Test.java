public class Test
{
    public static void main(String[] args) {
        Size s = Size.MEDIUM;
        System.out.println(Size.EXTRA_LARGE);
        System.out.println(s.toString());
    }
}

enum Size
{
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE
}
