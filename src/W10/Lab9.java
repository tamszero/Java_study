package W10;

import java.util.*;

public class Lab9 {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        String ID, name, str;

        System.out.println("Input 5 IDs and Names");
        for(int i = 0; i<5; i++){
            ID = sc.next();
            name = sc.next();
            myMap.put(ID, name);
        }

        System.out.println("HashMap size : " + myMap.size());
        System.out.println("Input ID to search: ");
        ID = sc.next();
        System.out.println(myMap.get(ID));
        System.out.println(myMap);

        Set s = myMap.keySet();
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            str = it.next(); //str이 키가 되는거임
            System.out.println("<" + str + myMap.get(str)+">"); //이건 value
        }
    }
}
