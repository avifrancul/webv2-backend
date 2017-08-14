package com.webv2.backend.webv2backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
public class TravelClaimsController {
@GetMapping("/claims")
 public  TravelClaims getTravelclaim (){

return (new TravelClaims(1,"NA-123-QA","Insurer1"));

    }


}
