package levelupjava;

import java.util.*;
import java.util.stream.Collectors;

public class StudentVolunteer {

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly", "Tony"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Polly","Sally"),
                "Midnight Breakfast", List.of("Polly"));

        System.out.println(findStudentsWithIncompleteVolunteerEventsUsingStreams(
                students, attendeesMapping));
    }

    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {
        Set mapKeys = attendeesMapping.keySet();

        int count = 0;
        Map<String, Integer> studentCountMap = new HashMap<>();
        //"Sally", "Polly", "Molly",
        //                "Tony", "Harry");
        studentCountMap.put("Sally", 0);
        studentCountMap.put("Polly", 0);
        studentCountMap.put("Molly", 0);
        studentCountMap.put("Tony", 0);
        studentCountMap.put("Harry", 0);

        for (String st : students) {
            // iterate Map
            Iterator iterator = mapKeys.iterator();
            while (iterator.hasNext()) {
                if (attendeesMapping.get(iterator.next()).contains(st)) {
                    studentCountMap.put(st, ++count);
                }
            }
            count = 0;
        }

        List list = new ArrayList();
        for (String st : students) {
            if (studentCountMap.get(st) < 2) {
                list.add(st);
            }
        }

        return list;
    }

    public static List<String> findStudentsWithIncompleteVolunteerEventsUsingStreams(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {
        Map<String, Integer> studentCountMap = students.stream().collect(Collectors.toMap(s -> s, n -> 0));

        attendeesMapping.values().
                forEach(list -> list.stream()
                        .filter(student -> studentCountMap.containsKey(student))
                        .forEach(std -> studentCountMap.put(std, studentCountMap.get(std) + 1)));

        return studentCountMap.entrySet().stream()
                .filter(x -> x.getValue() < 2)
                .map(x -> x.getKey())
                .collect(Collectors.toList());

    }
}
