

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动初始化成功");
            System.out.println("这是一次更新");
            System.out.println("这是一次更新");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
