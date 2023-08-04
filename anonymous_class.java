package anonymous;
class Ab
{
    public void show()
    {
        System.out.println("in A show");
    }
}
public class anonymous_class {
    public static void main(String[] args)
    {
        Ab obj = new Ab()
        {
            public void show(){
                System.out.println("in New show");
            }

        };
        obj.show();
    }

}
