<!--22.12.26.Mon -->
# 필수 명령어 정리.
## 로컬 계정 , 이메일 입력 , 정보
- 입력
  - git config --global user.name '계정이름기입'
  - git config --global user.email '계정이메일 기입'
  - 초기화

- local , global ,system
  - 로컬 : 특정 저장소
  - 글로벌 : 전역 , 전체
  - 시스템 : 시스템의 모든 사용자 , 저장소.



## 로컬 깃 폴더 생성
  - 깃 폴더 지정 ,생성
    - git init
  - 지우기

## 로컬 깃 폴더 origin ( 원격 )저장소와 연결
  - 연결
    - git remote add origin (연결한 저장소 주소 붙혀넣기)
  - 해제
    - git remote rm origin
    - git remote remove origin
  - 연결된 저장소 확인
    - git remote -v

## 파일 전송상태 확인 ,  커밋 , 푸시
  - 확인
    - git status 
    - modified : 파일 버전 변경된 내용 표시 ( 빨간색 : 보내지 않은 것 , 초록색 : 보낸 것 )
  - 전송
    - git add . 
    - 전체 파일 전송 : git add .
    - 
  - 커밋
    - git commit -m "commit message"

  - 전송 + 커밋
    - git commit -am "second commit"


  - 푸시
    - git push orgin main
    - 파일 , 커밋 모두 원격 저장소에 전송
    - 원격 저장소의 main이라는 항목에 저장하겠다. ( 다른 branch에 넣을 수 있다.)


## 확인 , 검색 , 상태

- 로그 확인
  - git log

- 깃 상태 확인
  - git status


## 원격 저장소 (Origin)에서 로컬 저장소로

- 가져오기
  - git pull --rebase origin main