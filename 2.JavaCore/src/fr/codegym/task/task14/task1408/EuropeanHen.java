package fr.codegym.task.task14.task1408;

class EuropeanHen  extends Hen {

    @Override
    int getMonthlyEggCount() {
        return 8;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Je viens d'"+Continent.EUROPE+". Je ponds " +getMonthlyEggCount() +
                " œufs par mois.";
    }
}
