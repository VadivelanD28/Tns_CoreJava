package com.tnsif.Student;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Importing Rest Controller
@RestController
public class StudentController 
{
	
@Autowired
	private StudentService service;


//Restful API methods for Retrievel methods
   @GetMapping("/Student")
   public List<Student> list()
    {
	return service.listAll();
	}
   
   
// To getting the repsonse from server side 
   @GetMapping("/Student/{id}")
   public ResponseEntity<Student> get(@PathVariable Integer id) //Path variable used to taking ID
   {
	   // Excepitonal Handling try and catch blocks 
	   try
	   {
		   Student student1 = service.get(id);
		   
		   // CONNECTED WITH THE SERVER
		   return new ResponseEntity<Student>(student1,HttpStatus.OK);
	   }
	   catch (NoSuchElementException e) // ERROR MEANS NOT FOUND 
	   {
		   return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		   
	   }
   }
   
   
   
   // REST API Methods Create operation     by using  "POSTMAPPING"
   @PostMapping("/Student")
   
   public void add(@RequestBody Student student1)
   {
	   service.save(student1);
   }
   
   
   
   
   // REST API Methods UPDATE Operation   by using "PUTMAPPING"
   @PutMapping("/Student/{id}") // I can update an entity
   public ResponseEntity<?> update(@RequestBody Student student1, @PathVariable Integer id)
   {
	   // Excepitonal Handling try and catch blocks 
	   try
	   {
		   student1.setId(id);
		   
		   //Student existstudent1 = service.get(id);
		   service.save(student1);
		   // CONNECTED WITH THE SERVER
		   return new ResponseEntity<>(HttpStatus.OK);
	   }
	   catch (NoSuchElementException e) // ERROR MEANS NOT FOUND 
	   {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		   
	   }
   }

   
	   // DELETE Operation   by Using DeleteMapping
	   @DeleteMapping("/Student/{id}")
	    public void delete(@PathVariable Integer id)
	    {
		   service.delete(id);
	    }
}
