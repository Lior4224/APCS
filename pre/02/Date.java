public class Date{
  public static void main(String[] args){
    String day, month;
    int date, year;
    day = "Wednesday";
    date = 1;
    month = "September ";
    year = 2021;
    System.out.println("American format:");
    System.out.print(day);
    System.out.print(", ");
    System.out.print(month);
    System.out.print(date);
    System.out.print(", ");
    System.out.print(year);
    System.out.println(".");
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + year);
  }
}
