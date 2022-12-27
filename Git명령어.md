<!--22.12.26.Mon -->
# 필수 명령어 정리.
## 보충 사이트
Source : [https://chlolisher.tistory.com/137](https://chlolisher.tistory.com/137)

---
## Config (로컬 계정 , 이메일 입력 , 정보)
- 입력
  - git config --global user.name '계정이름기입'
  - git config --global user.email '계정이메일 기입'
  - 초기화
  - git config 삭제하기 
    - git config --unset user.name
    - git config --unset user.email
  
  - 삭제해도 계속 남아있는 경우 global 옵션을 주어 설정했을 것임, global로 설정된 사용자를 지울 경우 아래와 같이 global 추가
    - git config --unset --global user.name
    - git config --unset --global user.email

config 상태
- local , global ,system
  - 로컬 : 특정 저장소
  - 글로벌 : 전역 , 전체
  - 시스템 : 시스템의 모든 사용자 , 저장소.

---

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
    - git push origin --all
      - 모든 브랜치 일괄 전송

---

## 복제
- $ git clone 'URL'
  - 기존의 소스 코드 다운로드/복제

- $ git clone /로컬/저장소/경로
  - 로컬 저장소 복제

- $ git clone 사용자명@호스트:/원격/저장소/경로
  - 원격 서버 저장소 복제

## Merge

- $ git pull
  - 원격 저장소의 변경 내용이 현재 디렉토리에 가져와지고 병합된다.

- $ git merge <다른 브랜치이름>
  - 현재 브랜치에 다른 브랜치의 수정사항 병합

- $ git add <파일명>
  - 각 파일을 병합    

- $ git diff <브랜치이름><다른 브랜치이름>
  - 변경 내용 merge 전에 바뀐 내용을 비교할 수 있다.

---
## 확인 , 검색 , 상태

- 로그 확인
  - git log

- 깃 상태 확인
  - git status


## 원격 저장소 (Origin)에서 로컬 저장소로

- 가져오기
  - git pull --rebase origin main

---

## Branch

- 생성
  - git branch 브랜치명

- 이동
  - git checkout 브랜치명

- 삭제
  - git branch -d 브랜치명

- 확인
  - git brach -a

- 이름 변경
  - git branch -m [브랜치 명] [새로운 브랜치명]