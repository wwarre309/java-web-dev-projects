package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        return Double.compare(menuItem.price, price) == 0 &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category);
    }

//    @Override
//    public int hashCode() {
//        return Menu.hash(price, description, category);
//    }

//    @Override
//    public String toString() {
//        return "Category: " + category + ", Description: " + description + ", Price: " + price + ", New: " + isNew;
//    }

    @Override
    public String toString(){
        return String.format("%s from the %s category, price: $%.2f%s.\n", this.description,
                this.category, this.price, (this.isNew) ? " and is new to the menu" : "");
    }

}


