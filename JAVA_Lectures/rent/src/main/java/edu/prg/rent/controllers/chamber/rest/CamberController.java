package edu.prg.rent.controllers.chamber.rest;

import edu.prg.rent.model.Chamber;
import edu.prg.rent.model.Comfort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/chamber")

public class CamberController {
    private List<Chamber> list = Stream.of(new Chamber(
            "№1",4, Comfort.STANDART,100,"Super CLASS"),new Chamber(
            "№2",20, Comfort.HOSTEL,20,"foo"),new Chamber(
            "№3",2, Comfort.LUX,500,"Super CLASS o go go"),new Chamber(
            "№4",4, Comfort.SEMILUX,200,"zaibca")
            )
            .collect(Collectors.toList());
    @RequestMapping("/all")

    List<Chamber> getAllChambers(){
        return list;
    }
}
