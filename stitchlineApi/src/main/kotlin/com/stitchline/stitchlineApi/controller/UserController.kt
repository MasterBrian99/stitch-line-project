package com.stitchline.stitchlineApi.controller

import com.stitchline.stitchlineApi.dto.UserDTO
import com.stitchline.stitchlineApi.entity.User
import com.stitchline.stitchlineApi.repo.UserRepo
import com.stitchline.stitchlineApi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/")
@CrossOrigin
class UserController(private val userService: UserService) {


    @PostMapping(path = ["/user"],consumes = [MediaType.APPLICATION_JSON_VALUE],produces = [MediaType.APPLICATION_JSON_VALUE])
    fun addUser(@RequestBody userDTO:UserDTO):ResponseEntity<UserDTO>{
        return userService.addUser(userDTO)
   }
    @PostMapping(path = ["/find"],consumes = [MediaType.APPLICATION_JSON_VALUE],produces = [MediaType.APPLICATION_JSON_VALUE])
    fun searchUser(@RequestBody userDTO:UserDTO):ResponseEntity<UserDTO>{
      return userService.searchUser(userDTO.username);

    }
}