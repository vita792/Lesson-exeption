package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	EmployeeCreator employeeCreator = new EmployeeCreatorFromMemory("E:/Vita/projects/test.txt");
	employeeCreator.createEmployee(10);
    }
}
