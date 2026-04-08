package W10;

import java.util.*;

public class W10_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 ID와 이름을 차례로 입력하세요. (종료시 0 0 입력)");

        String ID, Name;
        Map<String, String> myMap = new HashMap<String, String>();

        while (true){
            ID = sc.next();
            Name = sc.next();


            if(ID.equals("O") && Name.equals("O"))
                break;


            myMap.put(ID, Name);


        }

        Set s = myMap.keySet();
        Iterator<String> it = s.iterator();
        String str = it.next();

        while (it.hasNext()){
            System.out.println(str + myMap.get(str));
        }
        System.out.println(myMap.size());



        //max는 작은값, min은 큰 값으로 초기화 해둠
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        String maxName, maxID = "";
        String minName, minID = "";
        String currentName = myMap.get(str);
        int length = currentName.length();

        if(length > maxLength){
            maxLength = length;
            maxName = currentName;
            maxID = str;
        }

        if(length < minLength){
            minLength = length;
            minName = currentName;
            minID = str;
        }
    }
}
