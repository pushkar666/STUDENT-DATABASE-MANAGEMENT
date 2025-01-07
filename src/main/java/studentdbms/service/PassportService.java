/**
 * The PassportService class in the studentdbms.service package provides methods for saving Passport entities using PassportRepository with transactional support.
 * @author PUSHKAR D
 * @version 1.0
 */
package studentdbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import studentdbms.entity.Passport;
import studentdbms.repository.PassportRepository;

@Service
public class PassportService 
{
	@Autowired
	private PassportRepository passportRepository;
	
	@Transactional
	public Passport save(Passport passport) {
		return passportRepository.save(passport);
	}
}
