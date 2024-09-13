package com.TestAPI.RestAPI.controller;

import java.util.*;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.TestAPI.RestAPI.exception.VendorAlreadyExistsException;
import com.TestAPI.RestAPI.exception.ErrorResponse;
import com.TestAPI.RestAPI.exception.NoSuchVendorExistsException;
import com.TestAPI.RestAPI.model.CloudVendor;
import com.TestAPI.RestAPI.service.CloudVendorService;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	
	CloudVendorService cloudVendorService;

	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}


	@GetMapping("{id}")
	public CloudVendor getCLoudVendorDetails(@PathVariable int id) {
		
		return cloudVendorService.getCloudVendor(id);
		
	}
	@GetMapping()
	public List<CloudVendor> getAllCLoudVendorDetails() {
		return cloudVendorService.getAllCloudVendor();
		
	}
	
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor ) {
		cloudVendorService.createCloudVendor(cloudvendor);
		
		return "successfully created";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor ) {
		cloudVendorService.updateCloudVendor(cloudvendor);
		
		return "successfully updated";
	}
	
	@DeleteMapping("{id}")
	public String deleteCloudVendorDetails(@PathVariable int id) {
		cloudVendorService.deleteCloudVendor(id);
	
		return "successfully deleted";
	}
	
	

}
