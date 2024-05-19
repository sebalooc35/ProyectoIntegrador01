package org.backendada.proyectointegrador01.controller.health;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @RequestMapping("/health")
    public ResponseEntity<String> checkAPI(){
        return new ResponseEntity<>("<h1>The API is working ok!</h1>", HttpStatus.OK);
    }
}
