package com.stitchline.stitchlineApi.repo

import com.stitchline.stitchlineApi.entity.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepo :MongoRepository<User,String> {


}