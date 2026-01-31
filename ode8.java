interface payment{
    void pay();
}
class UPI implements payment{
public void pay(){
    System.out.println("paying");
}
}
class ode8{
    public static void main(String[] args) {
        UPI Gpay=new UPI();
        Gpay.pay();
    }
}