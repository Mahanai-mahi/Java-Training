class Food{
    int orderId;
    String customerName;
    String foodName;
    int quantity;
    double price;
    double total;    
    String status;

Food(int orderId,String customerName,String foodName,int quantity,double price){
    this.orderId=orderId;
    this.customerName=customerName;
    this.foodName=foodName;
    this.quantity=quantity;
    this.price=price;
    
}
public double calculateTotal(){
    total=price*quantity;
    return total;
}
void displayOrder(){
    System.out.println("Order Id"+orderId);
    System.out.println("Customer Name"+customerName);
    System.out.println("Food Name"+foodName);
    System.out.println("Qunatity"+quantity);
    System.out.println("Price"+price);
}

void cancelOrder(){
if(status.equals("cancelled")){
    System.out.println("Order already cancelled ");
}else{
    status="Cancelled";
    System.out.println("Order successfully Cancelled");
}
}
}

public class FoodDelivery {
    
}
