package com.company;
import java.io.*;
import static java.lang.Character.SIZE;

public class EmployeeCreatorFromMemory implements EmployeeCreator {
    private File dataFile;

    public EmployeeCreatorFromMemory(String path) throws FileNotFoundException {
        this.dataFile = new File(path);
    }

    @Override
    public Employee[] createEmployee(int employeeCount) throws IOException {


        Employee[] emp = new Employee[employeeCount];
        //Add you logic here:
        // Use BufferedReader class
        // BufferedReader bufferedReader = new BufferedReader(new FileReader("E:/Vita/projects/test.txt"));
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(dataFile));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            String[] lines = bufferedReader.lines().toArray(String[]::new);
            for (String s : lines) {
                Integer.parseInt(s);
            }
            // construct you Employee class from lines using for loop, parse int values using
            //   Integer.parseInt()
            // use try catch for catching File not Found Exeption
            return emp;
        }
    }
}