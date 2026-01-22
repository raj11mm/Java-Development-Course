public class GetterSetter {
    private int pageNo;

    public void setDate(int x) {
        if(x > 0) {
            pageNo = x;
        } else {
            System.out.println("Invalid Data");
        }
    }

    public void getData() {
        System.out.println(pageNo);
    }
}

 class Book {
    public static void main(String[] args) {
        GetterSetter g = new GetterSetter();
        g.setDate(10);
        g.getData();
    }
}
