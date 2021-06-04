package com.Anaxport.Master.GST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Anaxport.Master.GST.Repository.GstRatesRepo;
import com.Anaxport.Master.GST.Entity.GstRates;

@RestController
@RequestMapping("api/v1/gst")
public class GstController {
	
	@Autowired
	private GstRatesRepo gstRatesRepo;
	
	@GetMapping("/getAll")
	public List<GstRates> getAllGstRates(){
		return gstRatesRepo.findAll();
	}
	
	@GetMapping("/get/byId")
	public GstRates getById(@RequestParam Integer id) {
		return gstRatesRepo.findById(id).get();
	}
	
	@PostMapping("/post")
	public ResponseEntity<GstRates> postGstRate(@RequestBody GstRates gstRate){
		return ResponseEntity.created(null).body(gstRatesRepo.saveAndFlush(gstRate));
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<GstRates> updateGstRate(@RequestBody GstRates gstRate){
		return ResponseEntity.created(null).body(gstRatesRepo.save(gstRate));
	}
	
	
	
}
