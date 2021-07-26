package com.stitchline.stitchlineApi.service.impl

import com.stitchline.stitchlineApi.dto.UserDTO
import com.stitchline.stitchlineApi.entity.User
import com.stitchline.stitchlineApi.repo.UserRepo
import com.stitchline.stitchlineApi.service.UserService
import com.stitchline.stitchlineApi.util.StandardResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
@Service
class UserServiceImpl(private var userRepo: UserRepo):UserService {
    override fun addUser(userDTO: UserDTO):ResponseEntity<StandardResponse>{
        val findById=userRepo.findById(userDTO.username)
        if (!findById.isPresent){
            userRepo.save(User(userDTO.username,userDTO.fullName,userDTO.picked,userDTO.email,userDTO.mobile,userDTO.password,userDTO.address,userDTO.nic,userDTO.employeeNumber))
            return ResponseEntity(StandardResponse("201","success",userDTO),HttpStatus.CREATED)
        }
        return ResponseEntity(StandardResponse("400","Username is already used",userDTO),HttpStatus.OK)

    }

    override fun searchUser(userDTO: UserDTO):ResponseEntity<StandardResponse>{
            val findById=userRepo.findById(userDTO.username)
                if (findById.isPresent){
                    return if (findById.get().password==userDTO.password){
                        ResponseEntity(StandardResponse("200","success",
                            UserDTO(findById.get().username,findById.get().fullName,findById.get().picked,findById.get().email,findById.get().mobile,findById.get().password,findById.get().address,findById.get().nic,findById.get().employeeNumber)
                        ),HttpStatus.OK)
                    } else{
                        ResponseEntity(StandardResponse("400","Wrong password",
                            UserDTO(findById.get().username,findById.get().fullName,findById.get().picked,findById.get().email,findById.get().mobile,findById.get().password,findById.get().address,findById.get().nic,findById.get().employeeNumber)
                        ),HttpStatus.OK)
                    }

                }
                return ResponseEntity(StandardResponse("400","Username Not Found", UserDTO()),HttpStatus.OK)
    }
}