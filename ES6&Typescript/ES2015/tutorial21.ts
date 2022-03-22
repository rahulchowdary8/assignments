class person{
    greet(){}
}
let p = new person();

console.log(p.greet === person.prototype.greet);