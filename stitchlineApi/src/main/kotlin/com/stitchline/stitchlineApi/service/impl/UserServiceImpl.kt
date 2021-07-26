package com.stitchline.stitchlineApi.service.impl

import com.stitchline.stitchlineApi.dto.UserDTO
import com.stitchline.stitchlineApi.entity.User
import com.stitchline.stitchlineApi.repo.UserRepo
import com.stitchline.stitchlineApi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
@Service
class UserServiceImpl(private var userRepo: UserRepo):UserService {
    override fun addUser(userDTO: UserDTO) : ResponseEntity<UserDTO>{
        val findById=userRepo.findById(userDTO.username)
        if (!findById.isPresent){
            userRepo.save(User(userDTO.username,userDTO.fullName,userDTO.picked,userDTO.email,userDTO.mobile,userDTO.password,userDTO.address,userDTO.nic,userDTO.employeeNumber))
            return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
        }
        return ResponseEntity.status(HttpStatus.OK).body(UserDTO());
    }
    override fun searchUser(username: String): ResponseEntity<UserDTO>{
            val findById=userRepo.findById(username)
                if (findById.isPresent){
                    return ResponseEntity.status(HttpStatus.OK).body(UserDTO(findById.get().username,findById.get().fullName,findById.get().picked,findById.get().email,findById.get().mobile,findById.get().password,findById.get().address,findById.get().nic,findById.get().employeeNumber));
                }
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(UserDTO());
    }
}