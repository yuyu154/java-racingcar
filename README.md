# 자동차 경주 게임 프로젝트
---
## 프로젝트 개요

### 입력
 - n대의 자동차 이름을 쉼표로 구분해 입력받음 (이름은 5자 이하)
 - 몇 번 이동할 것인지 입력받음

### 출력
 - 전진하는 자동차를 출력할 때 자동차 이름 출력  ("이름" : --...-)
 - 게임이 끝나고 누가 우승했는지 출력 (우승자는 한명 이상)

### 고려사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있음
- 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우 전진
- 게임이 끝났을 때, 이동 횟수가 가장 많은 자동차가 우승 (한명 이상)

---
---

## 구현할 기능 목록

## Car 클래스
- 자동차를 나타내는 클래스
1. random 값이 4이상이면 전진하도록 구현
2. 0 ~ 9 사이의 random 숫자를 생성하는 기능 구현
3. Car 클래스의 name, position get 함수 구현

## Parser 클래스
- 사용자의 입력을 받아 처리하는 클래스
1. n대의 자동차를 입력받고 List로 반환
2. 입력을 쉼표로 구분해 List로 만듬
3. 몇 번 이동할 것인지 입력받고 int로 반환 

## GameArena 클래스
- 경기 진행을 담당하는 클래스
1. Car 클래스의 name, position 을 이용해 경기 진행 상황 표시
2. 이동 횟수가 끝났는지 확인
3. 이동 횟수가 끝나면 우승자를 출력


