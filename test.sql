DROP DATABASE s1;

CREATE DATABASE s1;

USE s1;

CREATE TABLE t_order(
id INT(5) PRIMARY KEY AUTO_INCREMENT,
userNo INT(5) NOT NULL,
productNo INT(5) NOT NULL
);

CREATE TABLE t_user(
id INT(5) PRIMARY KEY AUTO_INCREMENT,
userId CHAR(200) NOT NULL,
userPw CHAR(200) NOT NULL,
userName CHAR(50) NOT NULL,
addr CHAR(200) NOT NULL
);

CREATE TABLE t_product(
id INT(5) PRIMARY KEY AUTO_INCREMENT,
pname CHAR(100) NOT NULL,
price INT(10) NOT NULL
);


INSERT INTO t_product
SET pName = '운동화',
price = 1000000;

INSERT INTO t_product
SET pName = '코트',
price = 100000;

INSERT INTO t_product
SET pName = '반바지',
price = 30000;

INSERT INTO t_product
SET pName = '스커트',
price = 15000;

INSERT INTO t_product
SET pName = '코트',
price = 100000;

INSERT INTO t_product
SET pName = '티셔츠',
price = 9000;

INSERT INTO t_product
SET pName = '운동화',
price = 200000;

INSERT INTO t_product
SET pName = '모자',
price = 30000;



INSERT INTO t_user
SET userId = 'user1',
userPw = 'pass1',
userName = '손흥민',
addr = '런던';

INSERT INTO t_user
SET userId = 'user2',
userPw = 'pass2',
userName = '설현',
addr = '서울';

INSERT INTO t_user
SET userId = 'user3',
userPw = 'pass3',
userName = '원빈',
addr = '대전';

INSERT INTO t_user
SET userId = 'user4',
userPw = 'pass4',
userName = '송혜교',
addr = '대구';

INSERT INTO t_user
SET userId = 'user5',
userPw = 'pass5',
userName = '소지섭',
addr = '부산';

INSERT INTO t_user
SET userId = 'user6',
userPw = 'pass6',
userName = '김지원',
addr = '울산';


INSERT INTO t_order
SET userNo = 1,
productNo = 1;

INSERT INTO t_order
SET userNo = 2,
productNo = 2;

INSERT INTO t_order
SET userNo = 3,
productNo = 3;

INSERT INTO t_order
SET userNo = 4,
productNo = 4;

INSERT INTO t_order
SET userNo = 5,
productNo = 5;

INSERT INTO t_order
SET userNo = 6,
productNo = 6;

INSERT INTO t_order
SET userNo = 6,
productNo = 7;

INSERT INTO t_order
SET userNo = 1,
productNo = 5;

INSERT INTO t_order
SET userNo = 4,
productNo = 4;

INSERT INTO t_order
SET userNo = 1,
productNo = 1;

INSERT INTO t_order
SET userNo = 5,
productNo = 8;



SELECT * FROM t_user;
SELECT * FROM t_product;
SELECT * FROM t_order;


SELECT * FROM t_user;
# 1. 손흥민의 주문 개수는? 3
SELECT id FROM t_user WHERE userName = '손흥민';
SELECT COUNT(*) FROM t_order WHERE userNo = 1;

# 2. 손흥민이 산 상품은? 운동화, 코트
SELECT id FROM t_user WHERE userName = '손흥민';
SELECT productNo FROM t_order WHERE userNo = 1;
SELECT * FROM t_product WHERE id = 1 OR id = 5;

# 3. 스커트를 산 사람은? 송혜교
DESC t_product;

SELECT id FROM t_product WHERE pname = '스커트';
SELECT userNo FROM t_order WHERE productNo = 4;
SELECT userName FROM t_user WHERE id = 4;

# 4. 가장 많이 주문한 사람의 아이디와 이름, 주문개수는? user1, 손흥민, 3

SELECT * FROM t_order ORDER BY userNo;
SELECT userId, userName FROM t_user WHERE id = 1;

# 5. 소지섭이 사용한 총 금액은? 130000

SELECT id FROM t_user WHERE userName = '소지섭';
SELECT productNo FROM t_order WHERE userNo = 5;
SELECT price FROM t_product WHERE id = 5 OR id = 8;


; # 곱셈 좌측 테이블 데이터 개수 * 우측 테이블 데이터 개수 => 카르테시언곱

SELECT * FROM t_product;
SELECT * FROM t_user;


# 1. 손흥민의 주문 개수는?

SELECT COUNT(*) 
FROM t_order
INNER JOIN t_user
ON t_order.userNo = t_user.id
INNER JOIN t_product
ON t_order.productNo = t_product.id
WHERE t_user.userName = '손흥민';

# 2. 손흥민이 산 상품은?
SELECT p.id, p.pname 
FROM t_order o
INNER JOIN t_user u
ON o.userNo = u.id
INNER JOIN t_product p
ON o.productNo = p.id
WHERE u.userName = '손흥민';


# 3. 스커트를 산 사람은? 

SELECT DISTINCT u.userName 
FROM t_order o
INNER JOIN t_user u
ON o.userNo = u.id
INNER JOIN t_product p
ON o.productNo = p.id
WHERE p.pname = '스커트';


# 4. 가장 많이 주문한 사람의 아이디와 이름, 주문개수는?

SELECT u.userId uid, u.userName un, COUNT(u.userId) cnt
FROM t_order o
INNER JOIN t_user u
ON o.userNo = u.id
INNER JOIN t_product p
ON o.productNo = p.id
GROUP BY userId, userName
ORDER BY cnt DESC
LIMIT 1;


# 5. 소지섭이 사용한 총 금액은?
SELECT u.id, u.userId, u.userName, SUM(p.price) `sum`
FROM t_order o
INNER JOIN t_user u
ON o.userNo = u.id
INNER JOIN t_product p
ON o.productNo = p.id
GROUP BY u.id, u.userId, u.userName
HAVING u.userName = '소지섭';

# 조인
# group by - 집계함수
