public class Stock {
    String label;
    int quantity;

    Stock(String label, int quantity) {
        this.label = label;
        this.quantity = quantity;
    }

    String getLabel() {
        return label;
    }

    int getQuantity() {
        return quantity;
    }

    void setLabel(String newLabel) {
        this.label = newLabel;
    }

    void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }


}
