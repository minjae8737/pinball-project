# 애완동물 용품 샵 HAPPY SHOP
![logo](https://github.com/user-attachments/assets/1fa579cf-f5da-4790-bfc0-0d535ddd652a)

<br>

## 프로젝트 소개
- 강아지와 고양이를 위한 다양한 용품(장난감, 사료, 간식, 옷 등)을 편리하게 구매할 수 있는 온라인 쇼핑몰 플랫폼을 제공합니다.

<br>

## 개발 기간
24.12.09 ~ 25.01.07

<br>

## 🛠️ 기술 스택
- **Backend**: Java, Spring Boot, Spring Security, Spring Data, QueryDSL
- **Frontend**: HTML, CSS, JavaScript, jQuery, Thymeleaf, Bootstrap
- **Database**: MySQL
- **Tools**: IntelliJ IDEA, AWS S3
- **버전 및 이슈관리** : GitLab
- **협업 툴** : Discord, Notion

<br>

## 주요 기능
### 이민재
- 리뷰
    - 평점 (0.5 ~ 5점)
    - 구매자만 등록가능
- 상품 문의(코멘트,리코멘트)
    - 비밀글
        - 작성자와 관리자만 열람 가능
    - 상품 문의 및 답변
        - 로그인한 유저만 문의 가능
        - 관리자가 답변


### 정시원
- 상품
    - 상품
        - 조회수 기준 정렬
        - 상품 대표 이미지 표시
    - 상품 옵션
        - 옵션명 (ex. 색상-Red , 사이즈-S +1000원)
        - 옵션 추가 금액
        - 옵션 재고
    - 상품 이미지
        - 상품 설명 이미지
- 카테고리
    - 카테고리
        - 동물 타입에 따른 하위 카테고리 (ex. 식품, 의류, 건강)


### 조은이
- 유저
    - 시큐리티 적용
        - 커스텀 UserDetails
    - OAuth 로그인
    - 이메일 로그인
    - 회원가입
        - 이메일 인증
    - 마이페이지
    - 어드민페이지
- 배송지


### 신동훈
- 주문(결제)
    - 결제수단
        - 카드결제
        - 카카오페이 결제
    - 결제페이지
    - 주문목록 페이지


### 배재현
- 장바구니
    - localStorage 를 사용한 데이터 관리
        - 선택 삭제
        - 전체 삭제
        - 상품 옵션 수정

<br>

## ERD
<img width="1253" alt="스크린샷 2025-01-07 오후 1 33 00" src="https://github.com/user-attachments/assets/91618e84-dfa9-4a1a-8a5f-570a5428f112" />

<br>

## WireFrame
<img width="1211" alt="스크린샷 2025-01-07 오후 1 33 24" src="https://github.com/user-attachments/assets/5aa9927c-9231-4e69-9c10-78f523a812d3" />

<br>

## 동작 화면
### 메인 페이지
<img width="953" alt="스크린샷 2025-01-16 오후 2 46 34" src="https://github.com/user-attachments/assets/32f3b932-06b3-4b6c-aa34-48d7b8cc3b01" />
<img width="1903" alt="스크린샷 2025-01-16 오후 2 46 46" src="https://github.com/user-attachments/assets/3d99bb21-bd74-4184-9fcf-9606b5e4e68f" />

### 로그인
<img width="869" alt="스크린샷 2025-01-16 오후 2 49 57" src="https://github.com/user-attachments/assets/38057923-62bb-4156-89b3-4eaf1cb78331" />

### 회원가입
<img width="1325" alt="스크린샷 2025-01-16 오후 2 50 06" src="https://github.com/user-attachments/assets/33b9e46e-8bf6-4d04-afa6-27706c3670f7" />

### 마이페이지
<img width="1663" alt="스크린샷 2025-01-16 오후 2 49 49" src="https://github.com/user-attachments/assets/800a4a95-7cf9-4f55-a668-0ce17896a5b1" />

### 상품 리스트
<img width="1406" alt="스크린샷 2025-01-16 오후 2 50 40" src="https://github.com/user-attachments/assets/32f90a36-071e-4250-a2a5-04ec3c65861a" />

### 상품 상세 화면
<img width="1355" alt="스크린샷 2025-01-16 오후 2 47 05" src="https://github.com/user-attachments/assets/33513ed1-a06c-482c-9814-9facec634733" />

### 리뷰
<img width="1363" alt="스크린샷 2025-01-16 오후 2 47 35" src="https://github.com/user-attachments/assets/00992211-965a-4e11-a5c1-67eb752b9ac7" />

### Q&A
<img width="1338" alt="스크린샷 2025-01-16 오후 2 47 45" src="https://github.com/user-attachments/assets/658f3f88-ac9e-48c3-82fe-23ddef391228" />
<img width="1340" alt="스크린샷 2025-01-16 오후 2 48 18" src="https://github.com/user-attachments/assets/b628cc25-4b0f-4b41-a076-e5f08c26b7f9" />

### 결제
<img width="1360" alt="스크린샷 2025-01-16 오후 2 48 59" src="https://github.com/user-attachments/assets/c4507574-f80c-48b5-afe9-265a739e7eaf" />

### 장바구니
<img width="1903" alt="스크린샷 2025-01-16 오후 2 49 38" src="https://github.com/user-attachments/assets/22a80ef7-5104-4f7b-80b4-418f84a1515d" />



<br>

## 프로젝트 후기

이번에는 한 달 동안 쇼핑몰 주제를 가지고 팀 프로젝트를 진행하였다.

1차 프로젝트 이후 배웠던 Spring Security는 내가 담당하지 못하여 적용해 볼 수 없었지만, 개인적으로 연습해 보기로 했다.

이번 프로젝트에서 주제 선정 때 와디즈, 텀블벅과 같은 펀딩사이트를 처음에 팀원들과 기획했었지만 도와주시는 코치님들의 조언으로 기본적인 쇼핑몰로 바꾸게 되었다.
프로젝트 마무리할 때 거의 딱 맞춰서 개발 완료되어서 바꾸길 잘한 거 같다.

이번 Review와 Q&A 쪽을 담당하면서 처음에 화면 구성되어 있던
상품 상세 페이지 쪽에서만 구현하다 보니 백앤드 쪽으로 딱히 더 해볼 게 없어서 아쉬웠다.
대부분 모달 창을 사용한 데이터 전송이라 자바스크립트 코드를 많이 사용하게 되어서 자바스크립트로 무엇을 할 수 있는지 좀 더 알게 되는 시간이었다.

이번 프로젝트에서 공부한 내용을 적용할 기회는 없었지만, 팀원과 프로젝트 할 때 좀 더 자세하게 소통하는 것으로
DB 환경을 통일한다거나, git에 올라가면 안 되는 파일들을 서로 이야기했다면 좀 더 수월하게 작업 할 수 있지 않을까 생각이 들었다.





