package com.sw.Annotations.controller;

import java.util.ArrayList;
import java.util.List;

public class UserController {

		public List<String> getUsers(){
			final List<String> users=new ArrayList();
			users.add("Thamizh");
			users.add("Ilakkiya");
			users.add("Selva");
			users.add("Nilesh");
			users.add("Manivel");
			
			return users;
		}
}
