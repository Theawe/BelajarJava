import java.time.LocalDate;

class LokalTime{
  public static void main(String[] args) {
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        int year = newYearsEve.getYear(); // 1999
        int month = newYearsEve.getMonthValue(); // 12
        int day = newYearsEve.getDayOfMonth(); // 31

        System.out.println(year + " " + month + " " day);

    }
}
