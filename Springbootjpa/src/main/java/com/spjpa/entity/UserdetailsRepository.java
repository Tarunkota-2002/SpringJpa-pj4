package com.spjpa.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

@Transactional
public interface UserdetailsRepository  extends JpaRepository<User_info, Integer>{
	//List<User_info> findByCitnames(String city);
	List<User_info> findBymailid(String mail);
	List<User_info> findByCitnamesAndGender(String city,String gender);
	List<User_info> findByNameStarts(String prefix);
	Optional<User_info> findById(int id);
	Optional<User_info>getloadgetcitynamesAndgender() ;
	
	int deleteByAge(int age);
	List<User_info> findByCitnames(String city);
	Optional<User_info>loadDataBynameStartswith(String letter);
	
	//here below given table is are default methods created by jpa repo so in any other class file
	//by using autowired concept of repo class no need to mention that created method in 
	
//	| Method           | Purpose                     | Example Call                 | SQL Generated                  |
//	| ---------------- | --------------------------- | ---------------------------- | ------------------------------ |
//	| `save(entity)`   | Insert or update one record | `userRepo.save(u1);`         | `INSERT` or `UPDATE`           |
//	| `saveAll(list)`  | Insert/update multiple      | `userRepo.saveAll(users);`   | Batch insert/update            |
//	| `findById(id)`   | Find record by primary key  | `userRepo.findById(1001);`   | `SELECT * WHERE id=?`          |
//	| `findAll()`      | Get all records             | `userRepo.findAll();`        | `SELECT * FROM table`          |
//	| `count()`        | Count records               | `userRepo.count();`          | `SELECT COUNT(*)`              |
//	| `delete(entity)` | Delete by object            | `userRepo.delete(u1);`       | `DELETE FROM table WHERE id=?` |
//	| `deleteById(id)` | Delete by ID                | `userRepo.deleteById(1001);` | `DELETE FROM table WHERE id=?` |
//	| `existsById(id)` | Check if exists             | `userRepo.existsById(1001);` | `SELECT 1 FROM ...`            |


}
