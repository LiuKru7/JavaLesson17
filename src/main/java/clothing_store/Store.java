package clothing_store;


import java.util.Scanner;

public class Store {
    public static final String MENU_CONTENT = """
            Menu:
            1. Add Shirt
            2. Add Pants
            3. Add Jacket
            4. Checkout
            5. Remove Shirts
            6. Remove Pants
            7. Remove Jackets
            8. Exit
            """;
    private final ClothingItem[] clothingItems;
    private static final Scanner input = new Scanner(System.in);
    private static int arrayClothingIndex;

    public Store() {
        startProgram();
        arrayClothingIndex = input.nextInt();
        this.clothingItems = new ClothingItem[arrayClothingIndex];
    }

    public static void main(String[] args) {
        new Store().menu();
    }


    private static void startProgram() {
        System.out.println("Welcome to the clothing store!");
        System.out.println("******************************");
        System.out.print("Enter basket size: ");
    }

    public void menu() {
        while (true) {
            System.out.print(MENU_CONTENT);
            System.out.print("Enter your choice: ");
            int index = input.nextInt();
            if (index > 0 && index < 4) {
                addItem(index);
            } else if (index == 4) {
                checkout();
            } else if (index > 4 && index < 8) {
                removeItem(index);
            } else if (index == 8) {
                System.exit(1);
            }
        }
    }

    public void addItem(int index) {
        String itemType = "";

        switch (index) {
            case 1 -> itemType = "Shirt";
            case 2 -> itemType = "Pants";
            case 3 -> itemType = "Jacket";
            default -> System.out.println("error");
        }
        System.out.printf("Enter the price of the %s: ", itemType);
        double price = input.nextDouble();

        System.out.printf("Enter the quantity of the %s: ", itemType);
        int quantity = input.nextInt();
        ClothingItem newItem = new ClothingItem(index, quantity, price);
        for (int i = 0; i < this.clothingItems.length; i++) {
            if (this.clothingItems[i] == null) {
                this.clothingItems[i] = newItem;

                return;
            }
        }
        System.out.println("Your clothing basket is full");
    }

    public void checkout() {
        System.out.println("Receipt:");
        double fullCost = 0;
        for (ClothingItem clothingItem : this.clothingItems) {
            if (clothingItem != null) {
                fullCost += clothingItem.getFullPrice();
                System.out.println(clothingItem);
            }
        }
        double pvm = (fullCost / 100) * 21;
        System.out.printf("Total cost : $%.2f %n%n", fullCost);
        System.out.println("Price without PVM: " + (fullCost - pvm) + "$");
        System.out.println("PVM: " + pvm + "$");
    }

    public void removeItem(int index) {
        int typeIndex = 0;
        switch (index) {
            case 5 -> typeIndex = 1;
            case 6 -> typeIndex = 2;
            case 7 -> typeIndex = 3;
            default -> System.out.println("error");
        }

        for (int i = 0; i < this.clothingItems.length; i++) {
            if (this.clothingItems[i] != null && this.clothingItems[i].getType() == typeIndex) {
                this.clothingItems[i] = null;
                return;
            }
        }
    }
}
