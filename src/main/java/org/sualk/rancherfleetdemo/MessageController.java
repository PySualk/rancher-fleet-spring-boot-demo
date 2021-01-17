package org.sualk.rancherfleetdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

@RestController
public class MessageController {

    @GetMapping()
    public ResponseEntity<?> getMessage() {
        final String message = "Version 1.0 (" + LocalDateTime.now() + ")";
        return ResponseEntity.of(Optional.of(Map.of("message", message)));
    }

}
