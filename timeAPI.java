import java.time.*;
class timeAPI{
    public static void main(String args[]){
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        //you can directly write in print statement aswell
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
