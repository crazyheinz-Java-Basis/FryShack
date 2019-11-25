package be.intecbrussel;


import java.time.LocalDate;

public class AgendaApp {

    public static void main(String[] args) {

        AgendaCalculations agenda =  new AgendaCalculations(LocalDate.of(2019, 01, 28));
        agenda.calcDaysCourse();

        AgendaCalculations agenda1 = new AgendaCalculations(LocalDate.of(2019, 04, 20));
        agenda1.calcDaysVacation();

        AgendaCalculations agenda2 = new AgendaCalculations(LocalDate.of(2019, 06, 21));
        agenda2.getDaySummerTime();




    }

}
