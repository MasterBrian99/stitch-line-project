package com.stitchline.stitchlineApi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
 data class User(
    @Id
    var username: String="",
    var fullName: String="",
    var picked: String="",
    var email: String="",
    var mobile: String="",
    var password: String="",
    var address: String="",
    var nic: String="",
    var employeeNumber: String="",
)
