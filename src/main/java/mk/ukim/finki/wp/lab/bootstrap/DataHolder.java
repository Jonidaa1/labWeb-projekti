package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Registration;
import mk.ukim.finki.wp.lab.model.Workshop;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Workshop> workshops = null;
    public static List<Registration> registrations = null;

    @PostConstruct
    public void init() {
        workshops = new ArrayList<>();
        workshops.add(new Workshop("Java Basics", "Programming", 1500, 20));
        workshops.add(new Workshop("Spring Boot Intro", "Programming", 2500, 15));
        workshops.add(new Workshop("Advanced Thymeleaf", "Web", 2000, 10));
        workshops.add(new Workshop("HTML & CSS", "Web", 1200, 25));
        workshops.add(new Workshop("JavaScript Fundamentals", "Web", 1800, 18));
        workshops.add(new Workshop("Docker for Beginners", "DevOps", 2200, 12));
        workshops.add(new Workshop("Git & GitHub", "DevOps", 900, 30));
        workshops.add(new Workshop("SQL Essentials", "Databases", 1600, 14));
        workshops.add(new Workshop("UX Design Basics", "Design", 2100, 8));
        workshops.add(new Workshop("Machine Learning 101", "Data Science", 3000, 0));

        registrations = new ArrayList<>();
    }
}
