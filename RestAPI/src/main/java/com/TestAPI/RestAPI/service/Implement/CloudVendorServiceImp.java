package com.TestAPI.RestAPI.service.Implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TestAPI.RestAPI.exception.VendorAlreadyExistsException;
import com.TestAPI.RestAPI.exception.NoSuchVendorExistsException;
import com.TestAPI.RestAPI.model.CloudVendor;
import com.TestAPI.RestAPI.repository.CloudVendorRepository;
import com.TestAPI.RestAPI.service.CloudVendorService;


@Service
public class CloudVendorServiceImp implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;
	

	public CloudVendorServiceImp(CloudVendorRepository cloudVendorRepository) {
		//super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		CloudVendor existingCustomer
        = cloudVendorRepository.findById(cloudVendor.getVendorId())
              .orElse(null);
    if (existingCustomer == null) {
    	cloudVendorRepository.save(cloudVendor);
        return "Customer added successfully";
    }
    else
        throw new VendorAlreadyExistsException(
            "Customer already exists!!");
		
		//cloudVendorRepository.save(cloudVendor);
		// return "Successfully Saved";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendor);
		return "Successfully Updated";
	}

	@Override
	public String deleteCloudVendor(int cloudVendorId) {
		// TODO Auto-generated method stub
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Deleted";
	}

	@Override
	public CloudVendor getCloudVendor(int cloudVendorId) {
		
		return cloudVendorRepository.findById(cloudVendorId).orElseThrow(() -> new NoSuchVendorExistsException("NO Vendor present with ID= "+cloudVendorId));
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

}
