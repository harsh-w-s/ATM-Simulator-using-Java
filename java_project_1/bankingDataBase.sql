create database bankingSystem;
use bankingSystem;

create table signUp(form_no varchar(30), name varchar(30), father_name varchar(30), DOB varchar(30), gender varchar(30), email varchar(60), marital_status varchar(30), address varchar(90), city varchar(30), pincode varchar(30), state varchar(30));
create table signUp2(form_no varchar(30), religion varchar(30), category varchar(30), income varchar(60), education varchar(30), occupation varchar(60), pan varchar(30), aadhar varchar(30), seniorCitizen varchar(30), existingAccount varchar(30));
create table signUp3(form_no varchar(30), account_type varchar(30), cardno varchar(30), pin varchar(30), services varchar(60));
create table transactions(cardNumber varchar(30), date varchar(30), type varchar(30), amount int);
create table bankAccounts(cardNumber varchar(30), pin varchar(30), netBalance int);

DELIMITER //

CREATE TRIGGER balanceUpdate
AFTER INSERT ON transactions
FOR EACH ROW
BEGIN
    IF NEW.type = 'Deposit' THEN
        UPDATE bankAccounts
        SET netBalance = netBalance + NEW.amount
        WHERE cardNumber = NEW.cardNumber;
    
    ELSEIF NEW.type = 'Withdraw' THEN
        UPDATE bankAccounts
        SET netBalance = netBalance - NEW.amount
        WHERE cardNumber = NEW.cardNumber;
    END IF;
END;

DELIMITER ;

drop trigger balanceUpdate;
alter table transactions modify column amount int;
alter table transactions drop column netBalance;

select * from signUp;
select * from signUp2;
select * from signUp3;
select * from transactions;
select * from bankAccounts;