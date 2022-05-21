package com.admin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.admin.models.Customer;
import com.admin.models.WashPacks;
import com.admin.models.Washer;
import com.admin.models.WasherLeaderboard;
import com.admin.repo.AdminRepository;
import com.admin.service.AdminService;
import com.admin.service.AdminServiceImpl;
import com.netflix.discovery.converters.Auto;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	
	@Autowired
	private AdminRepository adminRepository;
		
//	Method to add washpack
//  http://localhost:9005/admin/add-pack	
	@PostMapping("/add-pack")
	public WashPacks addNewPack(@RequestBody WashPacks packs)	{
		return adminServiceImpl.addNewWashPack(packs);
	}
	
	
//	Method to get washpack by name
//  http://localhost:9005/admin/get-pack/gold	
	@GetMapping("/get-pack/{name}")
	public WashPacks pack(@PathVariable("name") String name)	{
		return adminServiceImpl.findByName(name);
	}
	
	
//	Method to get washpack by id
//  http://localhost:9005/admin/4	
	@GetMapping("{packId}")
	public ResponseEntity<WashPacks> getCarById(@PathVariable("packId") int packId) {
		return new ResponseEntity<WashPacks>(adminServiceImpl.findWashpacksById(packId),HttpStatus.OK);
	}
	
	
//	Method to get all washpacks
//  http://localhost:9005/admin/all-packs	
	@GetMapping("/all-packs")
	public ResponseEntity<List<WashPacks>> allPacks(){
		return new ResponseEntity<>(adminRepository.findAll(), HttpStatus.OK);
	}
	
//	Method to edit washpack by id
//  http://localhost:9005/admin/edit-pack/4260	
	@PutMapping("/edit-pack/{packId}")
	public ResponseEntity<WashPacks> updateWashpacks(@PathVariable("packId") int packId, @RequestBody WashPacks washPacks){
		return new ResponseEntity<>(adminServiceImpl.editWashPack(washPacks, packId), HttpStatus.OK);
	}
	
	
//	Deleting washpack by id
//  http://localhost:9005/admin/delete/4260	
	@DeleteMapping("/delete/{packId}")
    public void deleteById(@PathVariable("packId") int packId) {
        this.adminServiceImpl.deleteWashpackById(packId);
    }
	
	
//	Method to load all the customers
    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> listOfCustomers() {
        return new ResponseEntity<>(adminServiceImpl.listOfCustomers(), HttpStatus.OK);
    }

//    Method to load all the washers
    @GetMapping("/washers")
    public ResponseEntity<List<Washer>> listOfWashers() {
        return new ResponseEntity<>(adminServiceImpl.listOfWashers(), HttpStatus.OK);
    }
	
//  Method to display the leaderboard
	@GetMapping("/leaderboard")
	public List<WasherLeaderboard> washerLeaderboard(){
		return adminServiceImpl.washerLeaderboard();
	}
	
//	Method to add washpack
//  http://localhost:9005/admin/add-leaderboard	
	@PostMapping("/add-leaderboard")
	public WasherLeaderboard addToLeaderBoard(@RequestBody WasherLeaderboard washerLeaderboard)	{
		return adminServiceImpl.addToLeaderboard(washerLeaderboard);
	}
	
}
