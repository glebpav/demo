package com.example.demo.contrellers

import com.example.demo.physicProvider.PhysicMagic
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView


@RestController
@RequestMapping("/physic")
class PhysicController {

    @GetMapping
    fun enterData(model: Model): String {
        return "input"
    }

    @GetMapping
    @RequestMapping("/pt")
    fun getPTRes(model: Model, @RequestParam p: String, @RequestParam t: String): String{
        val newPoint = PhysicMagic.getPointDataFromPT(p.toDouble(), t.toDouble())
        println("$p --- $t")
        return newPoint.toString()
    }

    @GetMapping
    @RequestMapping("/ps")
    fun getPSRes(model: Model, @RequestParam p: String, @RequestParam s: String): String{
        val newPoint = PhysicMagic.getPointDataFromPS(p.toDouble(), s.toDouble())
        return newPoint.toString()
    }

    /*@GetMapping
    @RequestMapping("/pt")
    fun getPTRes(@RequestParam p: String, @RequestParam t: String, model: MutableMap<String, Any>): ModelAndView {
        val newPoint = PhysicMagic.getPointDataFromPT(p.toDouble(), t.toDouble())
        println("$p --- $t")
        model["func"] = "PT"
        return ModelAndView("main", model)
    }

    @GetMapping
    @RequestMapping("/ps")
    fun getPSRes(@RequestParam p: String, @RequestParam s: String, model: MutableMap<String, Any>): ModelAndView {
        val newPoint = PhysicMagic.getPointDataFromPS(p.toDouble(), s.toDouble())
        model["func"] = "PS"
        return ModelAndView("main", model)
    }*/

}