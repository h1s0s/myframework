# 테이블 생성

CREATE TABLE mbr_member_info (
                                 mbr_no VARCHAR(10) PRIMARY KEY,
                                 id VARCHAR(50),
                                 password VARCHAR(50),
                                 mbr_name VARCHAR(50)
);

CREATE TABLE mbr_member_auth (
                                 mbr_no VARCHAR(10),
                                 auth_no VARCHAR(10),
                                 auth_name VARCHAR(50),
                                 PRIMARY KEY (mbr_no, auth_no),
                                 FOREIGN KEY (mbr_no) REFERENCES mbr_member_info(mbr_no),
                                 FOREIGN KEY (auth_no) REFERENCES sys_menu_info(menu_no)
);



CREATE TABLE sys_menu_info (
                               menu_no VARCHAR(10) PRIMARY KEY,
                               menu_name VARCHAR(50)
);

commit;