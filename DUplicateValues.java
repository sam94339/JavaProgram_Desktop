import java.util.HashMap;
import java.util.Map;

class DUplicateValues{

    public static void main(String[] args){

        int[] a = {1, 4, 1, 7, 6, 4, 5, 1, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<a.length; i++){


            if(map.containsKey(a[i])){

                int c = map.get(a[i]);
                map.put(a[i], c + 1);
            }else{

                map.put(a[i], 1);
            }
        }

        System.out.println(map);

        for(Map.Entry<Integer, Integer> m : map.entrySet()){

            if(m.getValue()>1){

                System.out.println(m.getKey() + " " + m.getValue());
            }
        }
    }
}