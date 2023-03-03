package com.example.demo.AppUser;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// API lyer
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "api/v1/appuser")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> verifyAppUser(@RequestBody AppUser appUser) {
        System.out.println("Success calling");
        return ResponseEntity.ok().body(appUserService.verifyAppUser(appUser));
    }

    @GetMapping()
    public List<AppUser> getmyUser() {
        return appUserService.getAppUser();
    }

    @PostMapping
    public void registerNewAppUser(@RequestBody AppUser appUser) {
        appUserService.addNewAppUser(appUser);
    }

    @DeleteMapping(path = "{appUserId}")
    public void deleteAppUser(@PathVariable("appUserId") Long appUserId) {
        appUserService.deleteAppUser(appUserId);
    }

    @PutMapping(path = "{appUserId}")
    public void updateAppUser(
            @PathVariable("appUserId") Long appUserId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        appUserService.updateAppUser(appUserId, name, email);
    }
}
