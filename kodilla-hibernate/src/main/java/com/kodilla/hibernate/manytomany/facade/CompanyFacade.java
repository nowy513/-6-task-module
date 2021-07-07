package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class CompanyFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompany(String partialName) throws CompanyFacadeException {
        List<Company> companyList = companyDao.findByCompany(partialName);
        boolean wasError = false;
        LOGGER.info("Searching for a company by it's partial name.");
        if (companyList.size() <= 0) {
            LOGGER.error(CompanyFacadeException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            if (wasError)
                LOGGER.info("Errors during process.");
            throw new CompanyFacadeException(CompanyFacadeException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companyList;
        }
    }

    public List<Employee> findEmployee(String partialSurname) throws CompanyFacadeException {
        List<Employee> employeesMatchingList = employeeDao.findByEmplyee(partialSurname);
        boolean wasError = false;
        LOGGER.info("Searching for a employee by it's partial surname");
        if (employeesMatchingList.size() <= 0) {
            LOGGER.error(CompanyFacadeException.ERR_EMPL_NOT_FOUND);
            if (wasError)
                LOGGER.info("Errors occured during searching for an employee process.");
            throw new CompanyFacadeException(CompanyFacadeException.ERR_EMPL_NOT_FOUND);
        } else {
            return employeesMatchingList;
        }
    }
}