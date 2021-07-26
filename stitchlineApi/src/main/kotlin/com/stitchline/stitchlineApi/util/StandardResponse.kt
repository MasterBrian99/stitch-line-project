package com.stitchline.stitchlineApi.util

import com.stitchline.stitchlineApi.dto.UserDTO

class StandardResponse(
    var code:String="",
    var message:String="",
    var data:UserDTO,

    )