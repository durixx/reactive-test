package durco.test.reactive.reactivetest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/kkt")
public class Rest {

    @GetMapping("/x")
    public List<String> xxx () {
        return Arrays.asList("a","a", "a");
    }
}
