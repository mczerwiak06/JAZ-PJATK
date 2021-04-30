package pl.pjatk.miccze;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    @GetMapping("/{value}")
    public ResponseEntity<String> someValue(@PathVariable String value){
        return ResponseEntity.ok(value);
    }

    @GetMapping("/param")
    public ResponseEntity<String> paramValue(@RequestParam String enteredParam){
        return ResponseEntity.ok(enteredParam);
    }

    @PutMapping
    public ResponseEntity<Car> update(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

    @PutMapping("/{anotherValue}")
    public ResponseEntity<String> updateWithPath(@PathVariable String anotherValue){
        return ResponseEntity.ok(anotherValue);
    }

    @PostMapping("/car")
    public ResponseEntity<Car> addNewCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/{model}")
    public ResponseEntity<Void> deletyById(@PathVariable String model){
        return ResponseEntity.ok().build();
    }
}
