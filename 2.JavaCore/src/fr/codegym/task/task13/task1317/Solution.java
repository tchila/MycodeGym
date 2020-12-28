package fr.codegym.task.task13.task1317;

/* 
Beau temps
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Aujourd'hui, le temps sera : %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}
