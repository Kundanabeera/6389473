CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  FOR acc_rec IN (SELECT AccountID, Balance 
                  FROM Accounts 
                  WHERE AccountType = 'SAVINGS') 
  LOOP
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountID = acc_rec.AccountID;
  END LOOP;

  COMMIT;
END;
/
