	• Primary key를 id로 설정하면 다른 사용자가 같은 id를 사용하는 것을 방지 할 수 있음
	• 대소문자 구분없이 사용 가능(설명 메뉴에서 변경 가능)
	• 행을 선택할 때는 where, 열을 선택할 때는 select 사용
	• 파이썬이나 MySQL로 대량의 정보 분석이 가능
	• 연월일은 - 으로 구분, 시각은 시분초를  : 으로 구분
	• Null 값을 검색시에는 = 는 사용하지 않고 is null 을 활용
	• 연산자 우선순위 고려, ( ) 사용하여 우선순위 높이기 가능
	• Like 로 패턴 매칭 활용
	• Select 는 데이터를 참조만 할 뿐 변경하지는 않음
	• 연산자를 사용하여 계산이 가능하며, select *, price*quantity as amount from sample 과 같이 계산 결과의 명칭을 주어 표로 나타낼 수 있음 (as는 생략이 가능)
	• null 값은 0으로 간주되지 않음. null 과 연산 결과는 null
	• 서버 내부의 처리 순서 :  where - select - order by 순서로 처리
	• 단순 case 문과 검색 case 문이 존재, 단순 case 문으로는 null 을 처리할 수 없음
	• LIMIT 으로 위에서부터 출력값을 제한할 수 있음
	
	데이터 정의 언어(DDL)
		• 데이터베이스, 테이블 생성 : CREATE
			○ 데이터베이스 생성 : CREATE DATABASE 데이터베이스명
			○ 테이블 생성 : CREATE TABLE 테이블명
		• 테이블 구조 변경 : ALTER TABLE
			○ 칼럼 추가 : ALTER TABLE 테이블명 ADD COLUMN 칼럼명 타입(크기) 제약조건
			○ 칼럼 수정 : ALTER TABLE 테이블명 MODIFY COLUMN 칼럼명 타입(크기) 제약조건
			○ 칼럼 삭제 : ALTER TABLE 테이블명 DROP COLUMN 칼럼명
			○ 칼럼명 변경 : ALTER TABLE 테이블명 CHANGE 칼럼명 새칼럼명 타입(크기)
				§ 제약의 종류 :
					□ PRIMARY KEY : 주키 설정(데이터 중복 허용X + not null)
					□ NOT NULL : NULL데이터 허용 안함. 무조건 데이터 들어와야함.
					□ AUTO_INCREMENT : 자동증가. int형이고 주키인 컬럼에만 사용.
					□ UINSIGNED : 음수 표현 제거.
					□ UNIQUE : 중복데이터 허용 X
		• 테이블, 데이터베이스 삭제 : DROP
			○ 데이터베이스 삭제 : DROP DATABASE 데이터베이스명
			○ 테이블 삭제 : DROP TABLE 테이블명
		• 테이블 내 모든 데이터 삭제 : TRUNCATE
			○ TRUNCATE TABLE 테이블명
	
	
		데이터 조작 언어(DML)
			• 데이터 조회 : SELECT
				○ SELECT 칼럼 FROM 테이블 WHERE 조건
			• 데이터 수정 : UPDATE
				○ UPDATE 테이블 SET 칼럼 = 값, .... WHERE 조건
			• 데이터 삽입 : INSERT
				○ INSERT INTO 테이블 SET 칼럼 = 값, ...
			• 데이터 삭제 : DELETE
				○ DELETE FROM 테이블 WHERE 조건
	
	
