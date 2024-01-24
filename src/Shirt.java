public class Shirt {
  public int shirtID = 0;
  public String description = "Лляна сорочка";
  public char colorCode = 'W';
  public double price = 5.0;
  public int quantityInStock = 100;
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}