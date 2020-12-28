package fr.codegym.task.task14.task1408;

class AfricanHen  extends Hen {
    @Override
    int getMonthlyEggCount() {
        return 20;
    }
    @Override
    String getDescription() {
        return super.getDescription() + " Je viens d'"+Continent.AFRICA+". Je ponds " +getMonthlyEggCount() +
                " œufs par mois.";
    }
}