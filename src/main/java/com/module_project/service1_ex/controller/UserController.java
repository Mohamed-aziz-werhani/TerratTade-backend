package com.module_project.service1_ex.controller;

import com.module_project.service1_ex.model.JwtResponse;
import com.module_project.service1_ex.model.LoginRequest;
import com.module_project.service1_ex.model.User;
import com.module_project.service1_ex.service.JwtTokenProvider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.module_project.service1_ex.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("user")
public class UserController {

    /*
    private final ExService exService;
    
    public ExController(ExService exService){
    this.exService=exService;
    }
    */
    @Autowired //pour faire le dependy injection et on n'ai pas besoin d'utilise le constructor
  private  UserService userService ; 
    @Autowired
    private JwtTokenProvider tokenProvider; 
    
    public UserController(){
    tokenProvider=new JwtTokenProvider();
    }
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Bonjour, aziz !"; 
    }
    
    
    
       /*@GetMapping("/item/{année}")
    public ResponseEntity<String> getItemById(@PathVariable Long année1) {
        // Vous pouvez accéder à l'id ici
        return ResponseEntity.ok("l'année de  " + année1);
    }*/

   
       @GetMapping("/test")
    public ResponseEntity<String> getItemById() {
        // Vous pouvez accéder à l'id ici
        String token = tokenProvider.generateToken("hello");
        return ResponseEntity.ok("token"+token);
    }
    
   
    
    
    @PostMapping()
      public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = this.userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    } 
      @PostMapping("/login")
      public ResponseEntity<?> auth(@RequestBody LoginRequest loginRequest){
       User user = userService.getByemail(loginRequest.getEmail());
        System.out.println(user);
        if (user != null && userService.comparePassword(loginRequest.getPassword(), user.getPassword())) {
            // Générer le token JWT
            String token = tokenProvider.generateToken(user.getEmail());

            // Créer une réponse contenant l'utilisateur et le token
            JwtResponse response = new JwtResponse(user, token); 
            return ResponseEntity.ok(response);
        } else {
            // Si les informations de connexion sont incorrectes
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou mot de passe incorrect");
        }
    }
      
      
}

  

