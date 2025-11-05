// BuilderPatternDemo.java
// Demonstrates building different Computer objects using the Builder Pattern.

public class BuilderPatternDemo {

    public static void main(String[] args) {

        // Creating a Gaming PC using method chaining
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();

        // Creating a Office PC with a different configuration
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(8)
                .setStorage(500)
                .setGraphicsCard("Integrated Graphics")
                .build();

        // Display configurations
        System.out.println("Gaming PC Configuration:");
        gamingPC.showConfig();

        System.out.println("Office PC Configuration:");
        officePC.showConfig();
    }
}

