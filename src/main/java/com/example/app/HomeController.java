package com.example.app;


import com.example.app.model.Inquiry;
import com.example.app.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry",new Inquiry());
        return "index";
    }

    @GetMapping("/author")
    public String author(Model model){

        model.addAttribute("authors",homeService.getAuthors());
        return "author";
    }

    @PostMapping("/author")
    public String searchAuthor(Model model, @ModelAttribute Inquiry inquiry){
        String authorName = inquiry.getSearchString();
        model.addAttribute("authors",homeService.searchAuthors(authorName));
        return "author";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/blog-single")
    public String blog_single(){
        return "blog-single";
    }

    @GetMapping("/book")
    public String book(){
        return "book";
    }

    @GetMapping("/coming-soon")
    public String coming_soon(){
        return "coming-soon";
    }



}
