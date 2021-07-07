package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;
=======
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

<<<<<<< HEAD
=======
    @Query(nativeQuery = true)
    List<Company> charactersOfCompany(@Param("COMPANY_NAME") String name);

    @Query
    List<Company> findByCompany(@Param("NAME") String partOfTheName);

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
}
