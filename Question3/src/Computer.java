
// This class uses the Builder Pattern to create Computer objects step-by-step.

public class Computer {

    // These are the properties of a Computer-
    private String CPU;
    private int RAM;
    private int storage;
    private String graphicsCard;

    // Private constructor: only the Builder can create Computer objects
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // Simple method to show the Computer configuration
    public void showConfig() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println();
    }

    // Builder class starts here
    public static class Builder {

        // Same fields as Computer
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;

        // Methods to set each field
        // Each method returns "this" to support method chaining
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;   // allows chaining like setCPU().setRAM()
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

