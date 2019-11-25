package be.intecbrussel;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgendaCalculations {


    private LocalDate compareDate;

    public AgendaCalculations(LocalDate compareDate) {
        this.compareDate = compareDate;
    }



    // geef het aantal dagen tussen nu en het begin van de opleiding 28/01/2019.

    public void calcDaysCourse() {

        System.out.println("Er zijn " + ChronoUnit.DAYS.between(compareDate,LocalDate.now()) + " dagen verstreken sinds de opleiding.");

    }


    //geef het aantal dagen tot de eerste wel verdiende vakantie 20/04/2019.

    public void calcDaysVacation() {

        System.out.println("Er zijn nog " + ChronoUnit.DAYS.between(LocalDate.now(), compareDate) + " dagen te gaan tot we eindelijk vakantie hebben.");

    }

    //Bereken de dag vd week waarop het begin van de zomer start(21 juni) dit jaar.

    public void getDaySummerTime() {

        System.out.println("Het zomeruur start op een " + compareDate.getDayOfWeek());


    }






}
