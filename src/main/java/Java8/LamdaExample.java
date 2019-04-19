package Java8;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.jayway.restassured.RestAssured.given;

public class LamdaExample {


    public static void main(String args[]) {

        List<String> myList = new ArrayList<>();
        Map<String,String> myMap = new HashMap<>();

        String restAPI = "https://api.domainsdb.info/search?query=facebook&tld=com";

        myList = given().when().get(restAPI).jsonPath().get("domains.domain");

        given().when().get(restAPI).jsonPath().get("domains");



        // myList.forEach(puka -> System.out.println(puka));

        myList.forEach(puka -> System.out.println(puka.contains(".fr")+"  "+puka)) ;

        myList = myList.stream().filter(mylist -> mylist.contains(".de")).collect(Collectors.toList());

        //  myList.forEach(puka -> System.out.println(puka));


    }

}