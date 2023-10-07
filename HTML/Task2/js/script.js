const form = document.querySelector("#form");
// const fName = document.querySelector("#fName").setAttribute("required")
const subBtn = document.getElementById("submit");
subBtn.addEventListener("click", (e) => {
  e.preventDefault();
  // let check = document.querySelector("#male").checked = true
  // function isMale(id){
  //     if(id == true) console.log("Male");
  // }

  // isMale(check);
  alert(
    "First Name : " +
      form.fName.value +
      " | " +
      " Last Name : " +
      form.lName.value +
      " | " +
      " DOB: " +
      form.dob.value +
      " | " +
      " Gender : " +
      " | " +
      " Country : " +
      form.country.value +
      " | " +
      " Profession : " +
      form.profession.value +
      " | " +
      " Email : " +
      form.email.value +
      " | " +
      " Mobile No. : " +
      form.phone.value
  );
});
