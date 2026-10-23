public class ChildClassDemo extends ParentClassDemo{

    public void engine(){
        System.out.println("new engine ");
    }

    public void color(){
        System.out.println(color);
    }

    public static void main(String[] args){
        ChildClassDemo cd = new ChildClassDemo();
        cd.color();
        cd.Brakes();

    }
}
