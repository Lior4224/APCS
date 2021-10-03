public class Time{
  public static void main(String[] args){
    int hour, minute, second;
    double sinceMidnight, leftInDay, leftInDay2;
    hour = 17;
    minute = 29;
    second = 30;
    System.out.println("Seconds since midnight: " + ((hour * 3600) + (minute * 60) + second));
    sinceMidnight = ((hour * 3600) + (minute * 60) + second);
    System.out.println("Seconds remaining in the day: " + (86400 - ((hour * 3600) + (minute * 60) + second)));
    leftInDay = (86400 - ((hour * 3600) + (minute * 60) + second));
    leftInDay2 = leftInDay;
    System.out.println ("Percentage of the day that has passed: " + (100 * (sinceMidnight / 86400)));
    hour = 17;
    minute = 39;
    second = 10;
    leftInDay = (86400 - ((hour * 3600) + (minute * 60) + second));
    System.out.println(((leftInDay2 - leftInDay) / 60) + " minutes have passed.");
  }
}
