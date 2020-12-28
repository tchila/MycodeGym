package fr.codegym.task.task14.task1408;

class AsianHen extends Hen  {
    @Override
    int getMonthlyEggCount() {
        return 5;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Je viens d'"+Continent.ASIA+". Je ponds " +getMonthlyEggCount() +
                " œufs par mois.";
    }
}

