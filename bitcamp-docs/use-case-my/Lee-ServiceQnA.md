# 서비스게시판 QnA(ServiceQnA)
QnA를 등록, 조회, 삭제 , 답변, 답변삭제하는 유스케이스 이다.

## 주 액터(Primary Actor)
회원\
관리자

## 보조 액터(Secondary Actor)

## 사전 조건(Preconditions)
- 회원으로 로그인 되어 있다.(QnA 질문하기, QnA 조회하기, QnA삭제하기)
- 관리자로 로그인 되어 있다.(QnA 답변달기, QnA 답변 삭제하기)

## 종료 조건(Postconditions)
회원이 QnA를 등록하였다.
회원이 자신의 QnA를 조회하였다.
회원이 자신의 QnA를 삭제하였다.
관리자가 QnA에 답변을 작성하였다.
관리자가 QnA에 작성한답변을 삭제하였다.

## 시나리오(Flow of Events)

### QnA 조회하기(회원)

1. 회원이 QnA카테고리를 클릭한다.
2. 시스템은 해당 회원이 작성한 QnA목록을 출력한다.
3. 회원이 출력된 목록에서 조회하고싶은 QnA를 클릭한다.
4. 시스템은 해당 QnA상세정보를 출력한다.

### QnA 질문하기(회원)

1. 액터는 QnA문의하기 버튼을 클릭한다. 
2. 시스템은 QnA 입력폼을 출력한다.
3. 액터는 질문하고싶은 내용을 입력한후 등록하기 버튼을 누른다.
4. 시스템은 등록된 정보를 저장한후 `QnA 조회하기` 유스케이스 2번으로 간다.
    - QnA 입력폼에 작성된 내용이 없을경우,
        - 작성된 내용이 업다고 알린다.

### QnA 삭제하기(회원)

1. 액터는 QnA상세정보 화면에서 삭제하기 버튼을 클릭한다.
2. 시스템은 해당 QnA를 삭제한 후 `QnA 조회하기` 유스케이스 2번으로 간다.

### QnA 답변하기(관리자)

1. 시스템은 전체 QnA목록을 출력한다.
2. 액터는 미답변된 QnA목록보기 카테고리를 클릭한다.
3. 시스템은 시스템은 답변되지 않은 QnA목록을 출력한다.
4. 액터는 출력된 QnA목록에서 답변할 QnA를 클릭한다.
5. 시스템은 해당 QnA의 상세정보와 답변폼을 출력한다.
6. 액터는 질문을 읽고, 출력된폼에 답변을 작성한 후 등록하기 버튼을 클릭한다. 
7. 시스템은 등록된 내용을 저장한 후 `QnA 답변하기` 유스케이스 3번으로 간다.
    - QnA 답변 입력폼에 작성된 내용이 없을경우,
        - 작성된 내용이 업다고 알린다.

### QnA 답변 삭제하기(매니저)
1. 시스템은 전체 QnA목록을 출력한다.
2. 액터는 답변된 QnA목록보기 카테고리를 클릭한다.
3. 시스템은 시스템은 답변된 QnA목록을 출력한다.
4. 액터는 출력된 QnA목록에서 답변 삭제할 QnA를 클릭한다.
5. 시스템은 해당 QnA의 상세정보와 답변을 출력한다.
6. 액터는 출력된QnA 상세정보 화면에서 답변삭제하기 버튼을 클릭한다.
7. 시스템은 해당 답변을 삭제한 후 'QnA 답변 삭제하기' 유스케이스의 3번으로 간다.