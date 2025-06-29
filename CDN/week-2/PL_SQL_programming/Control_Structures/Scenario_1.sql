BEGIN
  FOR cust_rec IN (SELECT CustomerID, Age, LoanInterestRate 
                   FROM Customers 
                   WHERE Age > 60) 
  LOOP
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE CustomerID = cust_rec.CustomerID;
  END LOOP;

  COMMIT;
END;
/
