package com.stitchline.stitchlineApi.service

import com.stitchline.stitchlineApi.dto.UserDTO
import com.stitchline.stitchlineApi.entity.User
import org.springframework.http.ResponseEntity

interface UserService {

    fun addUser(userDTO: UserDTO): ResponseEntity<UserDTO>
    fun searchUser(username:String): ResponseEntity<UserDTO>
}