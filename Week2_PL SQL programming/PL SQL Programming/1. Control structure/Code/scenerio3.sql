DECLARE
  v_name CUSTOMERS.Name%TYPE;
BEGIN
  FOR loan_rec IN (
    SELECT l.LoanID, l.CustomerID, l.DueDate, c.Name
    FROM LOANS l
    JOIN CUSTOMERS c ON l.CustomerID = c.CustomerID
    WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
  )
  LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: ' || loan_rec.Name || 
                         ', your loan (ID: ' || loan_rec.LoanID || 
                         ') is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-Mon-YYYY'));
  END LOOP;
END;
/