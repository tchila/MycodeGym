package fr.codegym.task.task14.task1408;

 class NorthAmericanHen extends Hen  {
    @Override
    int getMonthlyEggCount() {
        return 10;
    }
    String getDescription() {
        return super.getDescription() + " Je viens d'"+Continent.NORTHAMERICA +". Je ponds " +getMonthlyEggCount() +
                " œufs par mois.";
    }
}
