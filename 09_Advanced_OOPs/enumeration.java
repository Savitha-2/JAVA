    enum Day {
    SUNDAY,
    MONDAY,         
    TUESDAY,
    WEDNESDAY,  
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class enumeration {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
        Day[] days = Day.values();
        System.out.println(days);

        for(Day dy: days){
            System.out.println(dy);
        }
        // Example of using enum in a conditional
        if(today == Day.WEDNESDAY){
            System.out.println("It's midweek!");
        }
        else{
            System.out.println("It's not midweek.");
        }
        
        // Using enum in a switch-case
        switch(today){
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day.");
                break;
            case FRIDAY:
                System.out.println("End of the work week.");
                break;
            default:
                System.out.println("Just another day.");
                break;
        }
    }
    
}
