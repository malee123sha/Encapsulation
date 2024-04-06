public class Area {
    private int length;
    private int width;
    Area(int length,int width) {
        this.length = length;
        this.width  = width;
    }
    public void getArea() {
        int area = length * width;
        System.out.println("Area is :-"+area);
    }
}
class Test {
    public static void main(String[] args) {
        Area a = new Area(100,50);
        a.getArea();
    }
}
