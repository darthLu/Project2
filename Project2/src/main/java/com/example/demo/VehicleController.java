/*
package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;



@RestController
public class VehicleController {

    private static int id = 0;

    @Autowired
    private VehicleDbo vehicleDbo;

    @RequestMapping(value="/addVehicle", method= RequestMethod.POST)
    public Vehicle addVehicle(@RequestBody Vehicle newVehicle) throws IOException{
        vehicleDbo.create(newVehicle);
        return newVehicle;
    }

    @RequestMapping(value="getVehicle/{id}", method=RequestMethod.GET)
    public Vehicle getVehicle(@PathVariable("id") int id) throws IOException{
        return vehicleDbo.getById(id);
    }

    @RequestMapping(value="updateVehicle", method=RequestMethod.PUT)
    public Vehicle updateVehicle(@RequestBody Vehicle newVehicle) throws IOException{
        vehicleDbo.updateVehicle(newVehicle);
        return newVehicle;
    }

    @RequestMapping(value="deleteVehicle/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteVehicle(@PathVariable("id") int id) throws IOException {
        vehicleDbo.deleteVehicle(id);
        return null;
    }

    // TEST METHOD TO MAKE SURE THE REST API IS FUNCTIONING
    @RequestMapping("/greeting")
    public Greeting greeting() { return new Greeting(id, "Correct Functionality!"); }

}
 */