package com.stitchline.stitchlineApi.service

import com.stitchline.stitchlineApi.dto.UserDTO
import com.stitchline.stitchlineApi.entity.User
import com.stitchline.stitchlineApi.util.StandardResponse
import org.springframework.http.ResponseEntity

interface UserService {

    fun addUser(userDTO: UserDTO) :ResponseEntity<StandardResponse>
    fun searchUser(userDTO: UserDTO): ResponseEntity<StandardResponse>
}