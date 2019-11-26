package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // creating new ArrayLists
        List<String> cars1 = new ArrayList<String>();
        List<String> cars2 = new ArrayList<String>();

        // playing with list 1
        cars1.add("BMW");
        cars1.add("Dacia");
        for(int i = 0; i<4; i++) {
            cars1.add("BMW");
        }

        System.out.println("Cars1: " + cars1);

        cars1.remove("BMW");
        System.out.println("new Cars1: " + cars1);

        // populating list 2
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Dacia");

        System.out.println("Cars2: " + cars2);

        List<String> result = commonBrands2(cars1, cars2);
        System.out.println("Common brands: " + result);

        Collections.reverse(result);
        System.out.println("Reverse common brands: " + result);

        List<String> all = new ArrayList<String>();
        all.addAll(cars1);
        all.addAll(cars2);
        System.out.println("All cars: " + all);

        all.addAll(1, result);
        System.out.println("All cars cu Common Brands in fata: " + all);
    }

    // finding elements that exist in both lists - V2
    public static List<String> commonBrands(List<String> list1, List<String> list2) { // V1
        List<String> cars = new ArrayList<String>();
        for(String currentBrandName : list1) {
            if(list2.contains(currentBrandName)) {
                cars.add(currentBrandName);
            }
        }
        return cars;
    }

    // finding elements that exist in both lists - V2
    public static List<String> commonBrands2(List<String> list1, List<String> list2) { // V2
        List<String> cars = new ArrayList<String>();
        for(int i=0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
                cars.add(list1.get(i));
            }
        }
        return cars;
    }
}
