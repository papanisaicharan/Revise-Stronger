package Introduction;

import java.time.LocalDate;

class JavaDate {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        // https://charansai850.medium.com/localdate-java-e7709605c55f
        LocalDate dt = LocalDate.of(year, month, day);
        return ""+dt.getDayOfWeek();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));
    }
}