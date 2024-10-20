$(document).ready(function() {

    // 전역 스코프에서 함수 정의
    window.over = function(obj) {
        obj.src = "./logo.png";
    }
    
    window.out = function(obj) {
        obj.src = "./logob.png";
    }
    
});
