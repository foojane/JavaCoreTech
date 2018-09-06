import java.time.LocalDate;

public class TestLocalDate
{
    public static void main(String[] args)
    {
        LocalDate begin = LocalDate.of(2015, 3, 29);
        LocalDate now = begin.plusDays(1258);
        System.out.println(now.getYear() + "/" + now.getMonthValue() + "/" + now.getDayOfMonth());
    }
}
