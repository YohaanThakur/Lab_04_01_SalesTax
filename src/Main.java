private static String[] args;

    void main() {
        double price = 120.0;             // Example purchase price
        double taxRate = 0.05;            // 5% sales tax
        double tax = price * taxRate;     // Calculate tax

        String output1 = "Purchase Price: $" + price;
        String output2 = "Sales Tax (5%): $" + tax;

        System.out.println(output1);
        System.out.println(output2);

    }
