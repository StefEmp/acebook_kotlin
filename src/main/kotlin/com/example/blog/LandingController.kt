package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LandingController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Welcome to Acebook"
        return "landing_page"
    }

}