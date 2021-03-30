
DROP TABLE SHOPPINGCART; 

CREATE TABLE SHOPPINGCART(
	projectItemSeq NUMBER(30),
	quantity NUMBER(30) NOT NULL,
	price NUMBER(30) NOT NULL,
	userId VARCHAR2(30) NOT NULL, 
	CONSTRAINT SHOPPINGCART_PK PRIMARY KEY (projectItemSeq),
	CONSTRAINT SHOPPINGCART_USERID_FK FOREIGN KEY (userId) REFERENCES MEMBERS (userId)
);

INSERT INTO SHOPPINGCART
VALUES (3, 1, 1000, 'test1');

DROP SEQUENCE ORDERSEQ;

DROP TABLE ORDERPAGE;

CREATE SEQUENCE ORDERSEQ;

CREATE TABLE ORDERPAGE(
	orderSeq NUMBER(30), 
	quantity NUMBER(30) NOT NULL,
	userId VARCHAR2(30) NOT NULL, 
	projectItemSeq NUMBER(30) NOT NULL, 
	address VARCHAR2(100),
	phone NUMBER(100),
	totalPrice NUMBER(30),
	orderDate DATE NOT NULL,
	CONSTRAINT ORDERPAGE_PK PRIMARY KEY (orderSeq),
	CONSTRAINT ORDERPAGE_USERID_FK FOREIGN KEY (userId) REFERENCES MEMBERS (userId),
	CONSTRAINT ORDERPAGE_PROJECTITEMSEQ_FK FOREIGN KEY (projectItemSeq) REFERENCES PROJECTITEM (projectItemSeq) 
);

INSERT INTO ORDERPAGE
VALUES (ORDERSEQ.NEXTVAL, 2, 'test1', 3, '너네집', 0, 20000, SYSDATE);

SELECT * FROM ORDERPAGE;
SELECT * FROM SHOPPINGCART;
SELECT PROJECTITEMSEQ, PROJECTITEMNAME, QUANTITY, PROJECTID, PRICE
  		FROM PROJECTITEM
  		WHERE PROJECTITEMSEQ = 83;

SELECT * FROM PROJECTITEM;

