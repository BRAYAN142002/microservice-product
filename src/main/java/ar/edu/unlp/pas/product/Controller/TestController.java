package ar.edu.unlp.pas.product.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}