package doctors;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> speciality = Arrays.asList(
                "Hospital:Surgeon:Radiologist:Maxillofacial Surgeon:Pediatrician",
                "Clinic:Pediatrician",
                "Clinic:Internist:Laryngologist:Pediatrician");

        List<String> individualSpeciality = speciality.stream()
                .map(spec -> spec.split(":"))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        Predicate<String> prefix = s -> s.equals("Hospital") || s.equals("Clinic");
        individualSpeciality.removeIf(prefix);

        individualSpeciality.forEach(System.out::println);
    }
}
