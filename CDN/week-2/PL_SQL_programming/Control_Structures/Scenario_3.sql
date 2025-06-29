DECLARE
  v_due_date DATE := SYSDATE + 30;
BEGIN
  FOR loan_rec IN (SELECT CustomerID, LoanID, DueDate 
                   FROM Loans 
                   WHERE DueDate <= v_due_date AND DueDate >= SYSDATE) 
  LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.LoanID || 
                         ' for Customer ' || loan_rec.CustomerID || 
                         ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/
