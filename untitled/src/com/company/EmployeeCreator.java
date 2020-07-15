package com.company;

import java.io.IOException;

public interface EmployeeCreator {
    Employee[] createEmployee(int employeeCount) throws IOException;
}
