CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_department_id    IN NUMBER,
  p_bonus_percent    IN NUMBER
) IS
BEGIN
  UPDATE EMPLOYEES
  SET Salary = Salary + (Salary * p_bonus_percent / 100)
  WHERE DepartmentID = p_department_id;
  
  COMMIT;
END;
/