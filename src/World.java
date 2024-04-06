 public class World {
    private String name;
    private long age;
    private String color;

    public String getName() {
        return name;
    }
    public long getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(long age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
    class  Test3 {
        public static void main(String[] args) {
            World w = new World();
            w.setName("Earth");
            w.setAge(4000000000L);
            w.setColor("Blue");
            System.out.println("World's Name is :-"+w.getName());
            System.out.println("World's Age is :-"+w.getAge());
            System.out.println("World's Colour is :-"+w.getColor());
        }
    }
