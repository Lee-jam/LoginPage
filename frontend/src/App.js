import logo from './logo.svg';
import './App.css';
import {useState} from 'react';



function App() {
  
  return (
    <div className="App">
      <form action="http://localhost:8081/login/new" method='post'>
        이름 : <input name='name'></input><br/>
        아이디 : <input name='id'></input><br/>
        비밀번호 : <input name='pw'></input><br/>
        이메일 : <input name='email'></input><br/>
        <button>가입</button>

      </form>
    </div>
  );
}
//state 변경함수 특징 : 변경 사항만 있을 때만 적용, ...을 붙인 이유는 새로운 state로 보이게 하기 위해서 let copy = [...제목];
//{} 중괄호 문법은 변수를 넣을 수 있는 문법. 모든 곳에 사용 가능 : 데이터 바인딩
export default App;
