import org.junit.Test;

public class MainClass {

    public int getLocalNumber() {
        return 14;
    }
    @Test
    public void testGetLocalNumber()
        {
            System.out.println("Тест 1: Проверка ровняется ли переменная getLocalNumber 14?");
            if (this.getLocalNumber()== 14)
            {
                System.out.println("Результат проверки: ");
                System.out.println("True");
                System.out.println(" getLocalNumber is 14");
            }
    else{
        System.out.println("False");
        System.out.println("Something wrong num is not 14, need recheck");
        }
        }

}
