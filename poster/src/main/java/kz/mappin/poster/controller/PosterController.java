package kz.mappin.poster.controller;

import kz.mappin.poster.model.Poster;
import kz.mappin.poster.repository.PosterRepository;
import kz.mappin.poster.service.IPosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PosterController {

    @Autowired
    IPosterService service;

    @Autowired
    PosterRepository repository;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("title", "Редактор плакатов карты");
        return "personalised-map-poster";
    }

//    @PostMapping("/poster/add")
//    public String addPoster(@RequestParam String style, @RequestParam String layout, @RequestParam String labelTitle,
//                            @RequestParam String labelSubTitle, @RequestParam String labelLocation, @RequestParam String size,
//                            @RequestParam Boolean updateCoor,
//                            Model model){
//        if(style == null){
//            System.out.println("NULL");
//        }
//
//        Poster poster = new Poster();
//        poster.setColor(style);
//        poster.setLayouts(layout);
//        poster.setTitle(labelTitle);
//        poster.setSubtitle(labelSubTitle);
//        poster.setFullCoor(labelLocation);
//        poster.setSize(size);
//        poster.setUpdateCoor(updateCoor);
//
//        service.create(poster);
//        return "redirect:/";
//    }

    @PostMapping("/poster/add")
    public String addPoster(@RequestParam String labelTitle, @RequestParam String labelSubTitle, @RequestParam String labelLocation,@RequestParam String size,
                            Model model){

        Poster poster = new Poster();
        poster.setTitle(labelTitle);
        poster.setSubtitle(labelSubTitle);
        poster.setFullCoor(labelLocation);
        poster.setSize(size);

        service.create(poster);
        return "redirect:/";
    }

    @GetMapping("/poster/all")
    public String allPosters(Model model){
        Iterable<Poster> posters = repository.findAll();
        model.addAttribute("posters", posters);
        return "personalised-map-poster";
    }
}
