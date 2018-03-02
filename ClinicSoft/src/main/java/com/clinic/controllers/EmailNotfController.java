package com.clinic.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.clinic.model.EmailModel;

/**
 * This class houses the implenentation of the email notification functionality micro service. 
 * 
 * @author  lkulkarni
 * @version 1.0
 */
@RestController(value="/emailCntrl")
public class EmailNotfController {

	/**
	 * This method sends an email to the desired email address when
	 * the subject , correct recipient email address and email body
	 * is sent to this service as a http post request.
	 *  
	 * @param  emailModel
	 * @return ResponseEntity
	 */
	@PostMapping(value="/sendEmailWithoutAttchmnt")
	public ResponseEntity<?> sendEmailWithoutAttchmnt(@RequestBody EmailModel emailModel){
		
		
		return null;
	}
	
}
