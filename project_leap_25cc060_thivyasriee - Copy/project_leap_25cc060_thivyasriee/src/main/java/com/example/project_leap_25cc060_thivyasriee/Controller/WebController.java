package com.example.project_leap_25cc059_swathika.Controller;

import com.example.project_leap_25cc059_swathika.Model.JsonDetails;
import com.example.project_leap_25cc059_swathika.Model.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/calculate")
    int calculate(int a, int b, String operation) {


        switch (operation) {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                return a / b;

            default:
                return 0;
        }
    }

    @GetMapping("/student")
    public student getStudentDetails() {

        student st = new student();

        st.setName("Rohith");
        st.setDept("CCE");
        st.setRollNo("25");

        return st;
    }

    @GetMapping("/jsondetails")
    public JsonDetails getJsonDetails() {

        JsonDetails st = new JsonDetails();

        st.setName("Aravind");
        st.setDept("CCE");
        st.setRollNo(12);
        st.setActive(true);
        st.setUsername("aravind10");

        return st;
    }
}