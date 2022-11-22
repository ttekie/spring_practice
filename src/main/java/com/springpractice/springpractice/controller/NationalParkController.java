package com.springpractice.springpractice.controller;

import com.springpractice.springpractice.models.NationalParks;
import com.springpractice.springpractice.repositories.NationalParksRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/parks")
public class NationalParkController {

    private final NationalParksRepository  nationalParkDao;

    // dependency injection
    public NationalParkController(NationalParksRepository nationalParkDao) {
        this.nationalParkDao = nationalParkDao;
    }

    @GetMapping("/create/all-park")
    public String allParks(Model model) {
        List<NationalParks> parks = nationalParkDao.findAll();
        model.addAttribute("parks", parks);
        return "index";
    }

    @GetMapping("/create")
    public String createNewPost() {
        return "nationalPark";
    }

    @PostMapping("/create")
    public String addNewPost(@RequestParam(name="address") String address, @RequestParam (name="city") String city, @RequestParam(name="state") String state,
                             @RequestParam (name="zipcode") String zipcode, @RequestParam (name="phoneNumber") String phoneNumber) {
        NationalParks nationalPark = new  NationalParks(address, city, state, zipcode, phoneNumber);
        nationalParkDao.save(nationalPark);
        return "redirect:/parks/create/all-park";
    }
}
