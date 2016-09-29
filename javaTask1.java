/**
 * Created by Zaytsev on 29.09.2016.
 */
public class javaTask1 {

    public static void main(String[] args){
        System.out.println("Нулевая запись");
        alexGroup2();
        alexGroup();
    }
    public static void alexGroup(){
        System.out.println("Начало записи");
    }
    static void alexGroup2(){
        System.out.println("Вторая запись");
        System.out.println("Третья запись");
    }
    static void alexGroup3(){ System.out.println("Четвертая запись");
    }
    static void alexGroup4 () {
        System.out.println("А та запись вообще не должна быть на сервере в ответах");
    }
}
