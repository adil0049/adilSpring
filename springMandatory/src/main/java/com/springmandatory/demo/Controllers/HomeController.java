package com.springmandatory.demo.Controllers;

import com.springmandatory.demo.Model.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
@ComponentScan

@Controller
public class HomeController {

private ArrayList<Student> students = new ArrayList<Student>();

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/allStudents")
    public String allStudents(){
        return "allStudents";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/grade")
    public String grade(){
        return "grade";
    }

    @GetMapping("/update")
    public String update(){
        return "update";
    }

    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }

    @GetMapping("/oneStudent")
    public String oneStudent(){
        return "oneStudent";
    }
}

