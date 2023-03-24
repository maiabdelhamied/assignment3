public class Main {
    public static void main(String[] args) {
        GroceryList gl=new GroceryList();
        GroceryItemOrder i1=new GroceryItemOrder("Oranges",2.5);
        i1.setItemQuantity(3);
        gl.add(i1);

        GroceryItemOrder i2=new GroceryItemOrder("Apples",1.5);
        i2.setItemQuantity(2);
        gl.add(i2);
        System.out.println(gl.getTotalCost());
    }
}