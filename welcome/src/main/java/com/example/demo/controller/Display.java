package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.DataDTO;
import com.example.demo.entity.Data;
import com.example.demo.service.DataService;
@RestController
public class Display {
	
	@Autowired
 	private DataService dataService;

//		@GetMapping("/hi")
//		public String display() {
//			return "Hi Nikhil";
//		}
//		@PostMapping("/post")
//		public String display2(@RequestBody String name) {
//			return "Hi"+name;
//		}
//		@PostMapping("/post/{name1}")
//		public String display3(@RequestBody String name, @PathVariable String name1, @RequestHeader String name2) {
//			return "Hi "+name+" " +name1 +" "+name2;
//		}
//		@PostMapping("/jsonpost")
//		public Message display3(@RequestBody String name1,@RequestHeader String name2) {
//			Message obj = new Message(name1,name2);
//			return obj;
//		}

	 	
	    @GetMapping("/getNotes")
	    public List<Data> getNotes(){
	    	 //Iterable<Data> allList = dataService.getdata();
	    	 return (List<Data>) dataService.getNotes();
	 		//return new ResponseEntity<>(allList, HttpStatus.OK);

	    }
	    @PostMapping("/addNote")
	    public String addData1(@RequestBody Data data){
	    	String name=dataService.addNote(data);
	    	return "note with title "+name+" added successfully";
	    }
//	    @PostMapping("/insertheader")
//	    public String addData2(@RequestHeader Data data){
//	    	String name=dataService.addData(data);
//	    	return name+" added successfully";
//	    }
	    
	    @PutMapping("/editNote")
	    public String editNote(@RequestBody Data data) {
	    	String name=dataService.editNote(data);
	    	return "note with title "+name+" updated";
	    }
	    @DeleteMapping("/deleteNote")
	    public String deleteData(@RequestBody String title) {
	    	String a=dataService.deleteData(title);
	    	return "The note with title "+a+" deleted";
	    }
	    
	    }


