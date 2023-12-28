package ru.skillfactory;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.skillfactory.dto.StudentData;

@RestController
@RequestMapping("/hello")
public class HelloController {
    //Метод для передачи данных
    @GetMapping("/student")
    public String helloStudent() {
        return "Hello, student!";
    }
    // Метод который приветствует по имени (позволяет динамически менять name)
    @RequestMapping(value = "/greetings/{name}")
    public String greetingsByName(@PathVariable String name) {
        return "Hello, " + name;
    }

    @RequestMapping(value = "/student/submit")
    @ResponseStatus(HttpStatus.OK)
    // Аннотация @RequestBody говорит о том, что данный объект представлен в запросе как форм-дата
    // и Spring MVC будет пытаться сконвертировать данные из форм-дата из запроса в данный класс
    public String giveMeFeedbackAboutGrade(@RequestBody StudentData studentData) {
        return "You are great with your grade " + studentData.getFirstName()
                + studentData.getLastName() + studentData.getGrade();
    }
}
