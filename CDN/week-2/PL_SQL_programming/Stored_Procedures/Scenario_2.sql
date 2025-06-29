CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_dept_id IN NUMBER,
  p_bonus_pct IN NUMBER  -- e.g., pass 10 for 10%
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_bonus_pct / 100)
  WHERE DepartmentID = p_dept_id;

  COMMIT;
END;
/
