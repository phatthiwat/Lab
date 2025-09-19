public class Item {
    // Private field สำหรับเก็บราคา
    private float price;
    
    // Constructor ที่ตั้งค่าเริ่มต้นให้ price เป็น 0
    public Item() {
        this.price = 0;
    }
    
    // Method สำหรับดึงค่า price
    public float getPrice() {
        return price;
    }
    
    // Method สำหรับตั้งค่า price
    public void setPrice(float p) {
        this.price = p;
    }
}
