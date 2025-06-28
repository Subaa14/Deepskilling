BEGIN
  FOR cust IN (SELECT c.CustomerID, l.LoanID, l.InterestRate
               FROM CUSTOMERS c
               JOIN LOANS l ON c.CustomerID = l.CustomerID
               WHERE c.Age > 60) 
  LOOP
    UPDATE LOANS
    SET InterestRate = InterestRate - (InterestRate * 0.01)
    WHERE LoanID = cust.LoanID;
  END LOOP;
  COMMIT;
END;
/