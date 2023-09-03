const open = (event) => {
    // 이벤트의 전파를 부모 요소로 전달되지 않도록 중지합니다.
    // 버튼 안에 텍스트가 있어서 텍스트를 클릭하면 이벤트가 중복으로 발생이 되요.
    // 이것을 이벤트 버블링이라고 해요. 즉 모달창이 열리고 바로 닫히는 것이지요.
    // 이를 방지하기 위한 코드입니다.
    // event.stopPropagation();

    // 클릭된 버튼의 다음 형제 요소를 가져옵니다. 여기서는 모달 요소가 버튼의 다음 형제 요소입니다.
    var modal = event.currentTarget.nextElementSibling;

    // 모달 요소의 "hidden" 클래스를 제거하여 모달 창을 화면에 표시합니다.
    modal.classList.remove("hidden");
}

// 버튼 또는 배경을 클릭하면 모달 창을 닫기 위한 함수
const close = (event) => {
    // 이벤트의 전파를 부모 요소로 전달되지 않도록 중지합니다.
    // event.stopPropagation();

    // 클릭된 버튼 또는 배경으로부터 가장 가까운 상위 요소 중 "modal" 클래스를 가진 요소를 가져옵니다.
    // 여기서 "modal" 클래스를 가진 요소는 모달 창의 전체 영역을 가리킵니다.
    var modal = event.currentTarget.closest('.modal');

    // 모달 요소의 "hidden" 클래스를 추가하여 모달 창을 화면에서 숨깁니다.
    modal.classList.add("hidden");
}


// "openBtn" 클래스를 가진 모든 버튼에 대해 "open" 함수를 이벤트 리스너로 등록합니다.
document.querySelectorAll(".openBtn").forEach(btn => {
    btn.addEventListener("click", open);
});

// "closeBtn" 클래스 또는 ".bg" 클래스를 가진 모든 요소에 대해 "close" 함수를 이벤트 리스너로 등록합니다.
document.querySelectorAll(".closeBtn, .bg").forEach(btn => {
    btn.addEventListener("click", close);
});