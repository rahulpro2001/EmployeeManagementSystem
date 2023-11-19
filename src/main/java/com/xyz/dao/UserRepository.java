package com.xyz.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.xyz.entity.Employee;

public interface UserRepository extends CrudRepository<Employee,Integer>{
	@Query(value="select * from Emp_system  where id=:id",nativeQuery=true)
	public Employee findBymyId(@Param("id") int id);
}
