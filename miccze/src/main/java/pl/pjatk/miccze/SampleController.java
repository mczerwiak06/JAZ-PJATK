package pl.pjatk.miccze;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class SampleController {


    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        //return ResponseEntity.ok().build(); //tak robimy jak chcemy zwrócic tylko sam status bez body. build() używamy gdy nie dotarczamy żadnego body
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        Car honda = new Car("Honda");
        return ResponseEntity.ok(honda);
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> value(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello1")//w postmanie wpisujemy localhost:8080/test/hello1?reqParam=aaa
    public ResponseEntity<String> anotherValue(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);

    }
    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}
