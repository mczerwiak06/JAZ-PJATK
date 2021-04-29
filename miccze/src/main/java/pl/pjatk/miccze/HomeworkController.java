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
}
