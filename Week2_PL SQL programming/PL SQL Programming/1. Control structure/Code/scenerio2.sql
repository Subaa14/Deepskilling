BEGIN
  FOR cust IN (SELECT CustomerID FROM CUSTOMERS WHERE Balance > 10000)
  LOOP
    UPDATE CUSTOMERS
    SET IsVIP = 'Y'
    WHERE CustomerID = cust.CustomerID;
  END LOOP;
  COMMIT;
END;
/