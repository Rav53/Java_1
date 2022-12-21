import java.util.LinkedList;

public class Zadacha2 {
    public static void main(String[] args) {
        LinkedList<Integer> taskList = new LinkedList<>();
        taskList.add(-1);
        taskList.add(32);
        taskList.add(-5);
        taskList.add(6);
        taskList.add(7);
        System.out.println("Изначальный список:");
        System.out.println(taskList.toString());
        // System.out.println("Список знакочередующийся");
        // System.out.println(taskList.toString());
    }
}
//        boolean flag = true;
//        if (taskList.Count > 0);{
//
//        boolean minus = true;
//            for (int i = 1; i < 0; i++);
//                if (minus && taskList[i] < 0);{
//                    flag = false;
//                    break;
//                }
//                if (!minus && taskList[i] > 0);{
//                    flag = false;
//                    break;
//                }
//        }
//             if flag == True;{
//        System.out.println("Список знакочередующийся");
//        }
//             else System.out.println("Последовательность не знакочередующаяся.");
//}
//
         
    

