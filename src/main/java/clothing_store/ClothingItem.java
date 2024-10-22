package clothing_store;

import lombok.Data;
import lombok.Getter;
@Data
public class ClothingItem {
    private int type;
    private int quantity;
    private double price;
    private double fullPrice;

    public ClothingItem(int type, int quantity, double price) {
        setType(type);
        setQuantity(quantity);
        setPrice(price);
        setFullPrice(price, quantity);
    }


    public void setType(int type) {
        if (type < 1 || type > 3) {
            System.out.println("Invalid type.");
            return;
        }
        this.type = type;
    }


    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Invalid quantity, can`t be negative or zero ");
            return;
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity, can`t be negative or zero ");
            return;
        }
        this.quantity = quantity;
    }

    public void setFullPrice(double price, int quantity) {
        this.fullPrice = price * quantity;
    }

    private String typeToString(int type) {
        if (type == 1) {
            return "Shirt";
        } else if (type == 2) {
            return "Pants";
        } else if (type == 3) {
            return "Jacket";
        }
        return "";
    }

    @Override
    public String toString() {
        return typeToString(type) + " " +
                "x" + quantity +
                ": $" + fullPrice;

    }
}
