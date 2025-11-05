// Computer.java
// Implements the Builder Pattern using a static nested Builder class.

public class Computer {

    // -------- Computer Fields --------
    private String CPU;
    private int RAM;
    private int storage;
    private String graphicsCard;

    // Private constructor to force object creation only through Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // Display computer details
    public void showConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println();
    }

    // -------- Static Nested Builder Class --------
    public static class Builder {

        // Same fields as Computer
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;

        // Setter for CPU
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;   // method chaining
        }

        // Setter for RAM
        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        // Setter for storage
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        // Setter for graphics card
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Build method that returns the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}

