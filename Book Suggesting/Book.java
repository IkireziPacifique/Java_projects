enum Day{
    MONDAY(),
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY;
}

public class Book {
    public static void main(String[] args){
        Day weekday = Day.FRIDAY;

        switch (weekday) {
            case MONDAY:
                System.out.println("Please read 'Think Big'");
                break;
            case TUESDAY:
                System.out.println("Please read 'Live full, Die Empty'");
                break;
            case WEDNESDAY:
                System.out.println("Please read 'Cinderella'");
                break;
            case THURSDAY:
                System.out.println("Please read 'Harry Potter'");
                break;
            case FRIDAY:
                System.out.println("Please read 'The purpose of a driven Live'");
                break;
        }
    }
}

