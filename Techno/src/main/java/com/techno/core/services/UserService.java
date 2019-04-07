package com.techno.core.services;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techno.core.entities.User;
import com.techno.core.repositories.UserRepository;

@RestController
public class UserService {

	@Autowired
	private UserRepository userRepositoryDAO;

	@CrossOrigin
	@RequestMapping(path = "/addUser", method = RequestMethod.POST)
	public @ResponseBody String addUser(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String nickName, @RequestParam String password, @RequestParam String img)
			throws ParseException {

		User newUser = new User();
		newUser.setfirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setNickName(nickName);
		newUser.setPassword(password);
		newUser.setImg(img);
		userRepositoryDAO.save(newUser);
		return "";
	}

	@CrossOrigin
	@RequestMapping(path = "/getUser", method = RequestMethod.GET)
	public User getUser(@RequestParam String nickName) {

		User findUser = userRepositoryDAO.findByNickName(nickName);
		return findUser;

	}

}
