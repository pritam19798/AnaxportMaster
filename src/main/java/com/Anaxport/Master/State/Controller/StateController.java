package com.Anaxport.Master.State.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Anaxport.Master.State.Entity.StateInfo;
import com.Anaxport.Master.State.Repository.StateDetailRepository;
import com.Anaxport.Master.State.Repository.StateInfoRepository;


@RestController
@RequestMapping("/api/v1/state")
public class StateController {
	@Autowired
	private StateDetailRepository stateDetailRepo;
	
	@Autowired
	private StateInfoRepository stateInfoRepo;
	
	@GetMapping("/getstate")
	public ResponseEntity<StateInfo> getStateInfo(@RequestParam int stateId){
		Optional<StateInfo> byId=stateInfoRepo.findById(stateId);
		return ResponseEntity.of(byId);
	}
	
	@PostMapping("/addstate")
	public ResponseEntity<StateInfo> postState(@RequestBody StateInfo state){
		return ResponseEntity.created(null).body(stateInfoRepo.saveAndFlush(state));
	}
	
	@PutMapping("/updatestate")
	public ResponseEntity<StateInfo> updateState(@RequestBody StateInfo state){
		return ResponseEntity.created(null).body(stateInfoRepo.save(state));
	}

}
