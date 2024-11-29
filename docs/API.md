### 기이수 성적 데이터 조회

**path**

`/api/pastgrade`

**HTTP method**

`GET`

**request**

**response**
```json
{
    "majorAvg": "3.88",
    "totalAvg": "3.96",
    "cultureAvg": "4.06",
    "accessAt": "HHMMSS"
}
```

**status code**

`200 OK`

---

### 관리자가 인증 정보 세팅

**path**

`/api/setinfo`

**HTTP method**

`GET`

~~**request**~~

수동 String 생성. SetCredential호출

**response**

**status code**

`200 OK`

---

### 요청 시작

**path**

`/api/start-session`

**HTTP method**

`GET`

**request**

**response**

**status code**

`200 OK`

---

### 요청 중단

**path**

`/api/end-session`

**HTTP method**

`GET`

**request**

**response**

**status code**

`200 OK`