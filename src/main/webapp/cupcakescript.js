/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var menu = document.getElementById("menu");
var nameRegExp = /^[a-zA-ZæøåÆØÅ ]+$/;

menu.onsubmit = function () { 
    var nameRegExp = /^[a-zA-ZæøåÆØÅ ]+$/;
    var emailRegExp = / ^ ( ( [ \ - \ w ] + ) \ . ? ) + @ ( ( [ \ - \ w ] + ) \ . ? ) + \ . [ a - zA -Z ] { 2 , 4 } $ /; //http://www.tutorialspark.com/javascript/JavaScript_Regular_Expression_Form_Validation.php
    var passwordRegExp = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,16}$/; //https://stackoverflow.com/questions/12090077/javascript-regular-expression-password-validation-having-special-characters
    
    
    var nameInput = document.getElementById("name").value;
    console.log(nameInput);
    var passwordInput = document.getElementById("password").value;
    console.log(passwordInput);
    var balanceInput = document.getElementById("balance").value;
    console.log(balanceInput);
    var emailInput = document.getElementById("email").value;
    console.log(emailInput);
    
    var nameResult = checkInput(nameInput, nameRegExp);
    var passwordResult = checkInput(passwordInput, passwordRegExp);
    var balanceResult = checkInput(balanceInput, passwordRegExp);
    var emailResult = checkInput(emailInput, emailRegExp);
    console.log(nameResult);
    console.log(passwordResult);
    console.log(balanceResult);
    console.log(emailResult);
 
    return nameResult && passwordResult && balanceResult && emailResult; 
};

function checkInput(value, regexp) {
    if (regexp.test(value) === false) {
        alert("You entered a wrong value. Try again");
        return false;
    }
    return true;
}

