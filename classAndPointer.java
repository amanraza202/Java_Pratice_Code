class Cookie{
    private String name;

    public Cookie(String Color){
        name = Color;

    }
    public String getColor(){
        return name;
    }
    public void setColor(String color){
        name = color;
    }
}
public class classAndPointer {
    public static void main(String[] args) {
        Cookie obj = new Cookie("Green");
        String ns = obj.getColor();
        System.out.println(ns);
        // After setting setcolor 
        obj.setColor("Blue");
        System.out.println(obj.getColor());
    }
}
