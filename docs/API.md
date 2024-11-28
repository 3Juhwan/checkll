### 기이수 성적 데이터 조회

**path**

`/api/v1/pastgrade`

**HTTP method**

`GET`

**request**

**response**
```
{
    "majorAvg": "3.88",
    "totalAvg": "3.96",
    "cultureAvg": "4.06",
    "accessAt": HHMMSS
}
```

**status code**

`200 OK`

---

### 관리자가 인증 정보 세팅

**path**

`/api/v1/setinfo`

**HTTP method**

`POST`

**request**
```
{
    "jSessionId" = "89e411a80321429ba5738e488cba978b41fbab477a4fe1eff88f",
    "runningSejong" = "472df382-2578-4e32-92c3-fb35149ddec6",
    "loginDt" = "20241128135035"
}
```

**response**

**status code**

`200 OK`

---

### 요청 시작

**path**

`/api/v1/start-session`

**HTTP method**

`POST`

**request**
```
{
    "jSessionId" = "89e411a80321429ba5738e488cba978b41fbab477a4fe1eff88f",
    "runningSejong" = "472df382-2578-4e32-92c3-fb35149ddec6",
    "loginDt" = "20241128135035"
}
```

**response**
```
{
    "majorAvg": "3.88",
    "totalAvg": "3.96",
    "cultureAvg": "4.06",
    "accessAt": HHMMSS
}
```

**status code**

`200 OK`

---

### 요청 중단

**path**

`/api/v1/end-session`

**HTTP method**

`GET`

**request**

**response**

**status code**

`200 OK`