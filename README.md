# Academy_Spring

<웹 기초>

클라이언트 (웹 브라우저) - 웹 서버

클라이언트는 쉽게 사용자라고 생각할 수 있다.
클라이언트는 웹 브라우저를 통해 서버로 요청(Request)를 보낸다.

서버는 클라이언트에서 받은 요청에 대한 데이터를 처리하고
클라이언트로 응답(Response)을 보낸다.

요청 형식
- 요청 전문
  - 헤더(Header)
      - 요청에 대한 정보가 담겨있다.
      - 요청 전문에 대한 정보 (Content-Type)
        - 환경에 대한 정보
        - 요청한 URL
        - 브라우저에 대한 정보 (언어, 전송할 데이터 형식 등...)
        - 쿠키 정보 등..
   - 요청 방식(Method)
       - GET : 서버에서 데이터 조회 용도(브라우저 주소창에 있음)
          - 요청 본문은 비어있음
          - 쿼리 스트링을 사용함
        - POST : 작성(데이터 전송/수정)
            - 요청 본문에 데이터가 있음
            
- 요청 본문(Body)
    - POST 방식으로 전송할 데이터
    
    
응답 형식
- 응답 전문
    - 헤더(Header)
        - 본문에 대한 형식 (Content-Type : - text/html ... )
        - 자주 보이는 응답코드들... (200, 300, 400, 500 번대 코드들임)
            - 200 : OK (문제 없음)
            - 201 : 작성됨
            - 204 : 요청은 잘 되었지만, 출력 내용은 없음
            
            - 301 : 페이지가 이동 되었음
            - 304 : FORBIDDEN
            
            - 400 : Bad Request - 요청 방식 오류 -> ex) 요청 데이터가 잘못 되었을 때 등 ...
            - 401 : unauthorized - 접속 권한 없음 -> ex) 관리자 페이지에 접속할 경우 ...
            - 404 : Not Found - 페이지 없음 -> ex) 주소가 잘못 되었을 때 ...
            
            - 500 : 서버 오류 -> 서버 혹은 소스코드에 오류가 있는 경우가 많음
        
        - 브라우저 통제를 위한 정보
            - ex) Location : 주소 -> 브라우저에게 주소를 이동하라고 명령함
                  Set-Cookie : 서버에서 브라우저에게 쿠키 데이터를 저장하라고 명령함
                 
- 응답 본문 (Body)
    - 서버가 응답한 출력 내용
        - ex) html 문서 등 ...
