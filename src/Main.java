public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", "Granta", 2015, "Россия", "желтый",
                100, 1.7, "автоматическая" , "седан",
                "а001аа82", 4, true, true, true);
//        lada.brand = "Lada ";
//        lada.model = "Granta";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый";
//        lada.year = 2015;
//        lada.country = "Россия";

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия",
                "черный",200, 3.0,"автоматическая" ,"седан",
                "а001аа61",4,true, true, true);
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "черный";
//        audi.year = 2020;
//        audi.country = "Германия";

        Car bmv = new Car("BMW", "Z8", 2021, "Германия", "черный",
                200, 3.0, "автоматическая", "седан",
                "а001аа61", 5, true, true, true);
//        bmv.brand = "BMW";
//        bmv.model = "Z8";
//        bmv.engineVolume = 3.0;
//        bmv.color = "черный";
//        bmv.year = 2021;
//        bmv.country = "Германия";

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея",
                "красный", 150, 2.4, "автоматическая","седан",
                "а001аа61", 5, true, true, true);
//        kia.brand = "Kia";
//        kia.model = "Sportage 4-го поколения";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.year = 2018;
//        kia.country = "Южная Корея";

        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый",
                200, 1.6, "автоматическая", "седан",
                "а001аа61", 4, true, true, true);
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый";
//        hyundai.year = 2016;
//        hyundai.country = "Южная Корея";

        System.out.println(" brand: " + lada.getBrand() + ", model: " + lada.getModel() + ", year: " +
                lada.getYear() +", country: " + lada.getCountry() + ", color: " + lada.getColor() +
                ", maxMovementSpeed: " + lada.getMaxMovementSpeed() + lada);
        System.out.println(" brand: " + audi.getBrand() + ", model: " + audi.getModel() + ", year: " +
                audi.getYear() +", country: " + audi.getCountry() + ", color: " + audi.getColor() +
                ", maxMovementSpeed: " + audi.getMaxMovementSpeed() + audi);
        System.out.println(" brand: " + bmv.getBrand() + ", model: " + bmv.getModel() + ", year: " +
                bmv.getYear() +", country: " + bmv.getCountry() + ", color: " + bmv.getColor() +
                ", maxMovementSpeed: " + bmv.getMaxMovementSpeed() + bmv);
        System.out.println(" brand: " + kia.getBrand() + ", model: " + kia.getModel() + ", year: " +
                kia.getYear() +", country: " + kia.getCountry() + ", color: " + kia.getColor() +
                ", maxMovementSpeed: " + kia.getMaxMovementSpeed() + kia);
        System.out.println(" brand: " + hyundai.getBrand() + ", model: " + hyundai.getModel() + ", year: " +
                hyundai.getYear() +", country: " + hyundai.getCountry() + ", color: " + hyundai.getColor() +
                ", maxMovementSpeed: " + hyundai.getMaxMovementSpeed() + hyundai);
        Bus bus1  = new Bus("ikarus ", "280", 2010,"Венгрия", "красный",
                110);
        Bus bus2  = new Bus("Scania ", "Citywide", 2021,"Швеция", "белый",
                150);
        Bus bus3  = new Bus("MAN", "Lion's Coach", 2020,"Турция", "черный",
                160);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }

}
