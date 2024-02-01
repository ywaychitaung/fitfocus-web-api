package com.team10nus.web_api.controller.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.team10nus.web_api.entity.Profile;
import com.team10nus.web_api.repository.ProfileRepository;
import com.team10nus.web_api.service.ProfileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProfileApiController {

    @Autowired 
    public ProfileService profileService;

    @GetMapping("users/profiles/show/{profieId}")
    public ResponseEntity<?> show(@PathVariable("id") Integer id)
     {

        Profile eprofile=profileService.getProfile(id);
        if(eprofile!=null)
        {
            return new ResponseEntity<>(eprofile,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } 
        
    }
    
   
    


    

}
