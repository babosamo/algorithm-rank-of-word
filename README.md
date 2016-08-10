#algorithm-rank-of-word

주어진 문자열의 알파벳으로 나올 수 있는 모든 문자열을 만든다.

경우의 문자열을 오름차순 정렬하였을 때 주어진해당 문자열의 순위를 구하는 문제

## rule

n 개의 알파뱃으로 구성된 문자열이 주어진다.

문자열에는 같은 알파벳이 존재할 수 있다.

문자열의 조합은 주어진 문자열의 알파벳으로 조합한다.

오름차순으로 정렬된 경우의 문자열 배열중 순위를 구한다. (배열의 첫번째 index 는 0 이다.)

## 예제

* 조건

		bac

* 결과

 		index = 2
		
	
* 경우의 문자열
	
		abc
		acb
		bac
		bca
		cab
		cba
		
	

## 예제 2

* 조건

		caba

* 결과 
	
		index = 10
	
*  경우의 문자열

		aabc
		aacb
		abac
		abca
		acab
		acba
		baac
		baca
		bcaa
		caab
		caba
		cbaa
		


## 예제 3

* 조건

		abba

* 결과 
	
		index = 2	
	
*  경우의 문자열

		aabb
		abab
		abba
		baab
		baba
		bbaa

## 예제 4

* 조건

		babca

* 결과 
	
		index = 15
	
*  경우의 문자열

		aabbc
		aabcb
		aacbb
		ababc
		abacb
		abbac
		abbca
		abcab
		abcba
		acabb
		acbab
		acbba
		baabc
		baacb
		babac
		babca
		bacab		
		bacba
		bbaac
		bbaca
		bbcaa
		bcaab
		bcaba
		bcbaa
		caabb
		cabab
		cabba
		cbaab
		cbaba
		cbbaa
		
