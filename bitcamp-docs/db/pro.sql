-- 프로젝트
DROP TABLE proj;

-- 고객사
DROP TABLE client;

-- 클라이언트관리자
DROP TABLE cli_mgr;

-- 팀원
DROP TABLE team;

-- 사용자
DROP TABLE user;

-- 컨펌
DROP TABLE conf;

-- 프로젝트발주
DROP TABLE pro_order;

-- 개발사
DROP TABLE devel;

-- 회사
DROP TABLE comp;

-- 결제
DROP TABLE pay;

-- 개발사프로젝트발주
DROP TABLE devel_order;

-- 프로젝트
CREATE TABLE proj (
  proj_id  INTEGER     NOT NULL, -- 프로젝트번호
  sdt      DATETIME    NOT NULL, -- 프로젝트시작일
  edt      DATETIME    NOT NULL, -- 프로젝트마감기한
  cont     TEXT        NOT NULL, -- 프로젝트내용
  proj_pay INTEGER     NOT NULL, -- 프로젝트예산
  pers     INTEGER     NOT NULL, -- 프로젝트참가인원
  name     VARCHAR(80) NOT NULL, -- 프로젝트명
  place    VARCHAR(80) NOT NULL, -- 프로젝트개발장소
  devel_id INTEGER     NOT NULL  -- 개발사번호
);

-- 프로젝트 기본키
CREATE UNIQUE INDEX PK_proj
  ON proj ( -- 프로젝트
    proj_id ASC -- 프로젝트번호
  );

-- 프로젝트 인덱스
CREATE INDEX IX_proj
  ON proj( -- 프로젝트
    name ASC -- 프로젝트명
  );

-- 프로젝트
ALTER TABLE proj
  ADD
    CONSTRAINT PK_proj -- 프로젝트 기본키
    PRIMARY KEY (
      proj_id -- 프로젝트번호
    );

-- 프로젝트
COMMENT ON TABLE proj IS '프로젝트';

-- 프로젝트번호
COMMENT ON COLUMN proj.proj_id IS '프로젝트번호';

-- 프로젝트시작일
COMMENT ON COLUMN proj.sdt IS '프로젝트시작일';

-- 프로젝트마감기한
COMMENT ON COLUMN proj.edt IS '프로젝트마감기한';

-- 프로젝트내용
COMMENT ON COLUMN proj.cont IS '프로젝트내용';

-- 프로젝트예산
COMMENT ON COLUMN proj.proj_pay IS '프로젝트예산';

-- 프로젝트참가인원
COMMENT ON COLUMN proj.pers IS '프로젝트참가인원';

-- 프로젝트명
COMMENT ON COLUMN proj.name IS '프로젝트명';

-- 프로젝트개발장소
COMMENT ON COLUMN proj.place IS '프로젝트개발장소';

-- 개발사번호
COMMENT ON COLUMN proj.devel_id IS '개발사번호';

-- 프로젝트 기본키
COMMENT ON INDEX PK_proj IS '프로젝트 기본키';

-- 프로젝트 인덱스
COMMENT ON INDEX IX_proj IS '프로젝트 인덱스';

-- 프로젝트 기본키
COMMENT ON CONSTRAINT proj.PK_proj IS '프로젝트 기본키';

-- 고객사
CREATE TABLE client (
  client_id  INTEGER NOT NULL, -- 고객사번호
  cli_mgr_id INTEGER NOT NULL  -- 클라이언트관리자번호
);

-- 고객사 기본키
CREATE UNIQUE INDEX PK_client
  ON client ( -- 고객사
    client_id ASC -- 고객사번호
  );

-- 고객사
ALTER TABLE client
  ADD
    CONSTRAINT PK_client -- 고객사 기본키
    PRIMARY KEY (
      client_id -- 고객사번호
    );

-- 고객사
COMMENT ON TABLE client IS '고객사';

-- 고객사번호
COMMENT ON COLUMN client.client_id IS '고객사번호';

-- 클라이언트관리자번호
COMMENT ON COLUMN client.cli_mgr_id IS '클라이언트관리자번호';

-- 고객사 기본키
COMMENT ON INDEX PK_client IS '고객사 기본키';

-- 고객사 기본키
COMMENT ON CONSTRAINT client.PK_client IS '고객사 기본키';

-- 클라이언트관리자
CREATE TABLE cli_mgr (
  cli_mgr_id INTEGER NOT NULL, -- 클라이언트관리자번호
  conf_id    INTEGER NOT NULL  -- 컨펌번호
);

-- 클라이언트관리자 기본키
CREATE UNIQUE INDEX PK_cli_mgr
  ON cli_mgr ( -- 클라이언트관리자
    cli_mgr_id ASC -- 클라이언트관리자번호
  );

-- 클라이언트관리자
ALTER TABLE cli_mgr
  ADD
    CONSTRAINT PK_cli_mgr -- 클라이언트관리자 기본키
    PRIMARY KEY (
      cli_mgr_id -- 클라이언트관리자번호
    );

-- 클라이언트관리자
COMMENT ON TABLE cli_mgr IS '클라이언트관리자';

-- 클라이언트관리자번호
COMMENT ON COLUMN cli_mgr.cli_mgr_id IS '클라이언트관리자번호';

-- 컨펌번호
COMMENT ON COLUMN cli_mgr.conf_id IS '컨펌번호';

-- 클라이언트관리자 기본키
COMMENT ON INDEX PK_cli_mgr IS '클라이언트관리자 기본키';

-- 클라이언트관리자 기본키
COMMENT ON CONSTRAINT cli_mgr.PK_cli_mgr IS '클라이언트관리자 기본키';

-- 팀원
CREATE TABLE team (
  team_id INTEGER     NOT NULL, -- 팀원번호
  major   VARCHAR(80) NOT NULL, -- 전공
  grade   VARCHAR(80) NOT NULL, -- 학력
  work    TEXT        NULL      -- 개별업무내용
);

-- 팀원 기본키
CREATE UNIQUE INDEX PK_team
  ON team ( -- 팀원
    team_id ASC -- 팀원번호
  );

-- 팀원
ALTER TABLE team
  ADD
    CONSTRAINT PK_team -- 팀원 기본키
    PRIMARY KEY (
      team_id -- 팀원번호
    );

-- 팀원
COMMENT ON TABLE team IS '팀원';

-- 팀원번호
COMMENT ON COLUMN team.team_id IS '팀원번호';

-- 전공
COMMENT ON COLUMN team.major IS '전공';

-- 학력
COMMENT ON COLUMN team.grade IS '학력';

-- 개별업무내용
COMMENT ON COLUMN team.work IS '개별업무내용';

-- 팀원 기본키
COMMENT ON INDEX PK_team IS '팀원 기본키';

-- 팀원 기본키
COMMENT ON CONSTRAINT team.PK_team IS '팀원 기본키';

-- 사용자
CREATE TABLE user (
  user_id INTEGER      NOT NULL, -- 사용자번호
  name    VARCHAR(80)  NOT NULL, -- 이름
  email   VARCHAR(40)  NOT NULL, -- 이메일
  posi    VARCHAR(10)  NOT NULL, -- 직책
  phot    VARCHAR(255) NULL,     -- 사진
  tel     VARCHAR(30)  NULL      -- 전화번호
);

-- 사용자 기본키
CREATE UNIQUE INDEX PK_user
  ON user ( -- 사용자
    user_id ASC -- 사용자번호
  );

-- 사용자 유니크 인덱스
CREATE UNIQUE INDEX UIX_user
  ON user ( -- 사용자
    email ASC -- 이메일
  );

-- 사용자 인덱스
CREATE INDEX IX_user
  ON user( -- 사용자
    name ASC -- 이름
  );

-- 사용자
ALTER TABLE user
  ADD
    CONSTRAINT PK_user -- 사용자 기본키
    PRIMARY KEY (
      user_id -- 사용자번호
    );

-- 사용자
ALTER TABLE user
  ADD
    CONSTRAINT UK_user -- 사용자 유니크 제약
    UNIQUE (
      email -- 이메일
    );

-- 사용자
COMMENT ON TABLE user IS '사용자';

-- 사용자번호
COMMENT ON COLUMN user.user_id IS '사용자번호';

-- 이름
COMMENT ON COLUMN user.name IS '이름';

-- 이메일
COMMENT ON COLUMN user.email IS '이메일';

-- 직책
COMMENT ON COLUMN user.posi IS '직책';

-- 사진
COMMENT ON COLUMN user.phot IS '사진';

-- 전화번호
COMMENT ON COLUMN user.tel IS '전화번호';

-- 사용자 기본키
COMMENT ON INDEX PK_user IS '사용자 기본키';

-- 사용자 유니크 인덱스
COMMENT ON INDEX UIX_user IS '사용자 유니크 인덱스';

-- 사용자 인덱스
COMMENT ON INDEX IX_user IS '사용자 인덱스';

-- 사용자 기본키
COMMENT ON CONSTRAINT user.PK_user IS '사용자 기본키';

-- 사용자 유니크 제약
COMMENT ON CONSTRAINT user.UK_user IS '사용자 유니크 제약';

-- 컨펌
CREATE TABLE conf (
  conf_id INTEGER  NOT NULL, -- 컨펌번호
  conf_dy DATETIME NOT NULL, -- 컨펌날짜
  prog    TEXT     NOT NULL, -- 프로젝트진행상황
  satis   BOOLEAN  NOT NULL, -- 클라이언트만족도
  pay_id  INTEGER  NOT NULL, -- 결제번호
  proj_id INTEGER  NOT NULL  -- 프로젝트번호
);

-- 컨펌 기본키
CREATE UNIQUE INDEX PK_conf
  ON conf ( -- 컨펌
    conf_id ASC -- 컨펌번호
  );

-- 컨펌
ALTER TABLE conf
  ADD
    CONSTRAINT PK_conf -- 컨펌 기본키
    PRIMARY KEY (
      conf_id -- 컨펌번호
    );

-- 컨펌
COMMENT ON TABLE conf IS '컨펌';

-- 컨펌번호
COMMENT ON COLUMN conf.conf_id IS '컨펌번호';

-- 컨펌날짜
COMMENT ON COLUMN conf.conf_dy IS '컨펌날짜';

-- 프로젝트진행상황
COMMENT ON COLUMN conf.prog IS '프로젝트진행상황';

-- 클라이언트만족도
COMMENT ON COLUMN conf.satis IS '클라이언트만족도';

-- 결제번호
COMMENT ON COLUMN conf.pay_id IS '결제번호';

-- 프로젝트번호
COMMENT ON COLUMN conf.proj_id IS '프로젝트번호';

-- 컨펌 기본키
COMMENT ON INDEX PK_conf IS '컨펌 기본키';

-- 컨펌 기본키
COMMENT ON CONSTRAINT conf.PK_conf IS '컨펌 기본키';

-- 프로젝트발주
CREATE TABLE pro_order (
  pro_order_id   INTEGER  NOT NULL, -- 프로젝트발주번호
  pro_order_dy   DATETIME NOT NULL, -- 프로젝트발주일
  pro_order_pay  INTEGER  NOT NULL, -- 프로젝트견적
  pro_order_cont TEXT     NOT NULL, -- 발주내용
  client_id      INTEGER  NOT NULL  -- 고객사번호
);

-- 프로젝트발주 기본키
CREATE UNIQUE INDEX PK_pro_order
  ON pro_order ( -- 프로젝트발주
    pro_order_id ASC -- 프로젝트발주번호
  );

-- 프로젝트발주
ALTER TABLE pro_order
  ADD
    CONSTRAINT PK_pro_order -- 프로젝트발주 기본키
    PRIMARY KEY (
      pro_order_id -- 프로젝트발주번호
    );

-- 프로젝트발주
COMMENT ON TABLE pro_order IS '프로젝트발주';

-- 프로젝트발주번호
COMMENT ON COLUMN pro_order.pro_order_id IS '프로젝트발주번호';

-- 프로젝트발주일
COMMENT ON COLUMN pro_order.pro_order_dy IS '프로젝트발주일';

-- 프로젝트견적
COMMENT ON COLUMN pro_order.pro_order_pay IS '프로젝트견적';

-- 발주내용
COMMENT ON COLUMN pro_order.pro_order_cont IS '발주내용';

-- 고객사번호
COMMENT ON COLUMN pro_order.client_id IS '고객사번호';

-- 프로젝트발주 기본키
COMMENT ON INDEX PK_pro_order IS '프로젝트발주 기본키';

-- 프로젝트발주 기본키
COMMENT ON CONSTRAINT pro_order.PK_pro_order IS '프로젝트발주 기본키';

-- 개발사
CREATE TABLE devel (
  devel_id INTEGER NOT NULL, -- 개발사번호
  team_id  INTEGER NOT NULL  -- 팀원번호
);

-- 개발사 기본키
CREATE UNIQUE INDEX PK_devel
  ON devel ( -- 개발사
    devel_id ASC -- 개발사번호
  );

-- 개발사
ALTER TABLE devel
  ADD
    CONSTRAINT PK_devel -- 개발사 기본키
    PRIMARY KEY (
      devel_id -- 개발사번호
    );

-- 개발사
COMMENT ON TABLE devel IS '개발사';

-- 개발사번호
COMMENT ON COLUMN devel.devel_id IS '개발사번호';

-- 팀원번호
COMMENT ON COLUMN devel.team_id IS '팀원번호';

-- 개발사 기본키
COMMENT ON INDEX PK_devel IS '개발사 기본키';

-- 개발사 기본키
COMMENT ON CONSTRAINT devel.PK_devel IS '개발사 기본키';

-- 회사
CREATE TABLE comp (
  comp_id   INTEGER      NOT NULL, -- 회사번호
  name      VARCHAR(80)  NOT NULL, -- 회사명
  tel       VARCHAR(30)  NOT NULL, -- 회사전화번호
  fax       VARCHAR(30)  NOT NULL, -- 회사팩스
  email     VARCHAR(40)  NOT NULL, -- 회사이메일
  addr      VARCHAR(255) NOT NULL, -- 회사주소
  bsi_rgist VARCHAR(255) NOT NULL  -- 사업자등록증
);

-- 회사 기본키
CREATE UNIQUE INDEX PK_comp
  ON comp ( -- 회사
    comp_id ASC -- 회사번호
  );

-- 회사 유니크 인덱스
CREATE UNIQUE INDEX UIX_comp
  ON comp ( -- 회사
    tel       ASC, -- 회사전화번호
    email     ASC, -- 회사이메일
    fax       ASC, -- 회사팩스
    name      ASC, -- 회사명
    addr      ASC, -- 회사주소
    bsi_rgist ASC  -- 사업자등록증
  );

-- 회사 인덱스
CREATE INDEX IX_comp
  ON comp( -- 회사
    name ASC -- 회사명
  );

-- 회사
ALTER TABLE comp
  ADD
    CONSTRAINT PK_comp -- 회사 기본키
    PRIMARY KEY (
      comp_id -- 회사번호
    );

-- 회사
ALTER TABLE comp
  ADD
    CONSTRAINT UK_comp -- 회사 유니크 제약
    UNIQUE (
      tel,       -- 회사전화번호
      email,     -- 회사이메일
      fax,       -- 회사팩스
      name,      -- 회사명
      addr,      -- 회사주소
      bsi_rgist  -- 사업자등록증
    );

-- 회사
COMMENT ON TABLE comp IS '회사';

-- 회사번호
COMMENT ON COLUMN comp.comp_id IS '회사번호';

-- 회사명
COMMENT ON COLUMN comp.name IS '회사명';

-- 회사전화번호
COMMENT ON COLUMN comp.tel IS '회사전화번호';

-- 회사팩스
COMMENT ON COLUMN comp.fax IS '회사팩스';

-- 회사이메일
COMMENT ON COLUMN comp.email IS '회사이메일';

-- 회사주소
COMMENT ON COLUMN comp.addr IS '회사주소';

-- 사업자등록증
COMMENT ON COLUMN comp.bsi_rgist IS '사업자등록증';

-- 회사 기본키
COMMENT ON INDEX PK_comp IS '회사 기본키';

-- 회사 유니크 인덱스
COMMENT ON INDEX UIX_comp IS '회사 유니크 인덱스';

-- 회사 인덱스
COMMENT ON INDEX IX_comp IS '회사 인덱스';

-- 회사 기본키
COMMENT ON CONSTRAINT comp.PK_comp IS '회사 기본키';

-- 회사 유니크 제약
COMMENT ON CONSTRAINT comp.UK_comp IS '회사 유니크 제약';

-- 결제
CREATE TABLE pay (
  pay_id   INTEGER     NOT NULL, -- 결제번호
  pay_pric INTEGER     NOT NULL, -- 결제금액
  pay_stat BOOLEAN     NOT NULL, -- 결제상태
  pay_dy   DATETIME    NOT NULL, -- 결제기간
  pay_ty   VARCHAR(80) NOT NULL  -- 결제유형명
);

-- 결제 기본키
CREATE UNIQUE INDEX PK_pay
  ON pay ( -- 결제
    pay_id ASC -- 결제번호
  );

-- 결제
ALTER TABLE pay
  ADD
    CONSTRAINT PK_pay -- 결제 기본키
    PRIMARY KEY (
      pay_id -- 결제번호
    );

-- 결제
COMMENT ON TABLE pay IS '결제';

-- 결제번호
COMMENT ON COLUMN pay.pay_id IS '결제번호';

-- 결제금액
COMMENT ON COLUMN pay.pay_pric IS '결제금액';

-- 결제상태
COMMENT ON COLUMN pay.pay_stat IS '결제상태';

-- 결제기간
COMMENT ON COLUMN pay.pay_dy IS '결제기간';

-- 결제유형명
COMMENT ON COLUMN pay.pay_ty IS '결제유형명';

-- 결제 기본키
COMMENT ON INDEX PK_pay IS '결제 기본키';

-- 결제 기본키
COMMENT ON CONSTRAINT pay.PK_pay IS '결제 기본키';

-- 개발사프로젝트발주
CREATE TABLE devel_order (
  devel_id     INTEGER NOT NULL, -- 개발사번호
  pro_order_id INTEGER NOT NULL  -- 프로젝트발주번호
);

-- 개발사프로젝트발주 기본키
CREATE UNIQUE INDEX PK_devel_order
  ON devel_order ( -- 개발사프로젝트발주
    devel_id     ASC, -- 개발사번호
    pro_order_id ASC  -- 프로젝트발주번호
  );

-- 개발사프로젝트발주
ALTER TABLE devel_order
  ADD
    CONSTRAINT PK_devel_order -- 개발사프로젝트발주 기본키
    PRIMARY KEY (
      devel_id,     -- 개발사번호
      pro_order_id  -- 프로젝트발주번호
    );

-- 개발사프로젝트발주
COMMENT ON TABLE devel_order IS '개발사프로젝트발주';

-- 개발사번호
COMMENT ON COLUMN devel_order.devel_id IS '개발사번호';

-- 프로젝트발주번호
COMMENT ON COLUMN devel_order.pro_order_id IS '프로젝트발주번호';

-- 개발사프로젝트발주 기본키
COMMENT ON INDEX PK_devel_order IS '개발사프로젝트발주 기본키';

-- 개발사프로젝트발주 기본키
COMMENT ON CONSTRAINT devel_order.PK_devel_order IS '개발사프로젝트발주 기본키';

-- 프로젝트
ALTER TABLE proj
  ADD
    CONSTRAINT FK_devel_TO_proj -- 개발사 -> 프로젝트
    FOREIGN KEY (
      devel_id -- 개발사번호
    )
    REFERENCES devel ( -- 개발사
      devel_id -- 개발사번호
    );

-- 개발사 -> 프로젝트
COMMENT ON CONSTRAINT proj.FK_devel_TO_proj IS '개발사 -> 프로젝트';

-- 고객사
ALTER TABLE client
  ADD
    CONSTRAINT FK_comp_TO_client -- 회사 -> 고객사
    FOREIGN KEY (
      client_id -- 고객사번호
    )
    REFERENCES comp ( -- 회사
      comp_id -- 회사번호
    );

-- 회사 -> 고객사
COMMENT ON CONSTRAINT client.FK_comp_TO_client IS '회사 -> 고객사';

-- 고객사
ALTER TABLE client
  ADD
    CONSTRAINT FK_cli_mgr_TO_client -- 클라이언트관리자 -> 고객사
    FOREIGN KEY (
      cli_mgr_id -- 클라이언트관리자번호
    )
    REFERENCES cli_mgr ( -- 클라이언트관리자
      cli_mgr_id -- 클라이언트관리자번호
    );

-- 클라이언트관리자 -> 고객사
COMMENT ON CONSTRAINT client.FK_cli_mgr_TO_client IS '클라이언트관리자 -> 고객사';

-- 클라이언트관리자
ALTER TABLE cli_mgr
  ADD
    CONSTRAINT FK_user_TO_cli_mgr -- 사용자 -> 클라이언트관리자
    FOREIGN KEY (
      cli_mgr_id -- 클라이언트관리자번호
    )
    REFERENCES user ( -- 사용자
      user_id -- 사용자번호
    );

-- 사용자 -> 클라이언트관리자
COMMENT ON CONSTRAINT cli_mgr.FK_user_TO_cli_mgr IS '사용자 -> 클라이언트관리자';

-- 클라이언트관리자
ALTER TABLE cli_mgr
  ADD
    CONSTRAINT FK_conf_TO_cli_mgr -- 컨펌 -> 클라이언트관리자
    FOREIGN KEY (
      conf_id -- 컨펌번호
    )
    REFERENCES conf ( -- 컨펌
      conf_id -- 컨펌번호
    );

-- 컨펌 -> 클라이언트관리자
COMMENT ON CONSTRAINT cli_mgr.FK_conf_TO_cli_mgr IS '컨펌 -> 클라이언트관리자';

-- 팀원
ALTER TABLE team
  ADD
    CONSTRAINT FK_user_TO_team -- 사용자 -> 팀원
    FOREIGN KEY (
      team_id -- 팀원번호
    )
    REFERENCES user ( -- 사용자
      user_id -- 사용자번호
    );

-- 사용자 -> 팀원
COMMENT ON CONSTRAINT team.FK_user_TO_team IS '사용자 -> 팀원';

-- 컨펌
ALTER TABLE conf
  ADD
    CONSTRAINT FK_pay_TO_conf -- 결제 -> 컨펌
    FOREIGN KEY (
      pay_id -- 결제번호
    )
    REFERENCES pay ( -- 결제
      pay_id -- 결제번호
    );

-- 결제 -> 컨펌
COMMENT ON CONSTRAINT conf.FK_pay_TO_conf IS '결제 -> 컨펌';

-- 컨펌
ALTER TABLE conf
  ADD
    CONSTRAINT FK_proj_TO_conf -- 프로젝트 -> 컨펌
    FOREIGN KEY (
      proj_id -- 프로젝트번호
    )
    REFERENCES proj ( -- 프로젝트
      proj_id -- 프로젝트번호
    );

-- 프로젝트 -> 컨펌
COMMENT ON CONSTRAINT conf.FK_proj_TO_conf IS '프로젝트 -> 컨펌';

-- 프로젝트발주
ALTER TABLE pro_order
  ADD
    CONSTRAINT FK_client_TO_pro_order -- 고객사 -> 프로젝트발주
    FOREIGN KEY (
      client_id -- 고객사번호
    )
    REFERENCES client ( -- 고객사
      client_id -- 고객사번호
    );

-- 고객사 -> 프로젝트발주
COMMENT ON CONSTRAINT pro_order.FK_client_TO_pro_order IS '고객사 -> 프로젝트발주';

-- 개발사
ALTER TABLE devel
  ADD
    CONSTRAINT FK_comp_TO_devel -- 회사 -> 개발사
    FOREIGN KEY (
      devel_id -- 개발사번호
    )
    REFERENCES comp ( -- 회사
      comp_id -- 회사번호
    );

-- 회사 -> 개발사
COMMENT ON CONSTRAINT devel.FK_comp_TO_devel IS '회사 -> 개발사';

-- 개발사
ALTER TABLE devel
  ADD
    CONSTRAINT FK_team_TO_devel -- 팀원 -> 개발사
    FOREIGN KEY (
      team_id -- 팀원번호
    )
    REFERENCES team ( -- 팀원
      team_id -- 팀원번호
    );

-- 팀원 -> 개발사
COMMENT ON CONSTRAINT devel.FK_team_TO_devel IS '팀원 -> 개발사';

-- 개발사프로젝트발주
ALTER TABLE devel_order
  ADD
    CONSTRAINT FK_devel_TO_devel_order -- 개발사 -> 개발사프로젝트발주
    FOREIGN KEY (
      devel_id -- 개발사번호
    )
    REFERENCES devel ( -- 개발사
      devel_id -- 개발사번호
    );

-- 개발사 -> 개발사프로젝트발주
COMMENT ON CONSTRAINT devel_order.FK_devel_TO_devel_order IS '개발사 -> 개발사프로젝트발주';

-- 개발사프로젝트발주
ALTER TABLE devel_order
  ADD
    CONSTRAINT FK_pro_order_TO_devel_order -- 프로젝트발주 -> 개발사프로젝트발주
    FOREIGN KEY (
      pro_order_id -- 프로젝트발주번호
    )
    REFERENCES pro_order ( -- 프로젝트발주
      pro_order_id -- 프로젝트발주번호
    );

-- 프로젝트발주 -> 개발사프로젝트발주
COMMENT ON CONSTRAINT devel_order.FK_pro_order_TO_devel_order IS '프로젝트발주 -> 개발사프로젝트발주';