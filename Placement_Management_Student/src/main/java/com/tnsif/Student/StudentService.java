package com.tnsif.Student;
// Importing list 
import java.util.List;
// Here we are importing autowired annotations
import org.springframework.beans.factory.annotation.Autowired;
// Here we are importing Service Annotations
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

// Here we are using importing Transactional package
import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> listAll()
	{
		return repository.findAll(); // It is builtin method
	}
	
	 // I save my student database stored in list method 
	public void save(Student Student)
	{
		repository.save(Student);
	}
	public Student get(Integer id) {
		return repository.findById(id).get();
	}
	public void delete(Integer id)
    {
	   repository.deleteById(id);
    }

}
