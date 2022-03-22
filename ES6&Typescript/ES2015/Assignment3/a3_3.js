"use strict";
// IMPLEMENTATIONS
class Employee {
    constructor(NAME, TYPE, DEPT) {
        this.name = NAME;
        this.type = TYPE;
        this.dept = DEPT;
    }
    getDetails() {
        return {
            Employee_Name: this.name,
            Employee_Type: this.type,
            Employee_Department: this.dept
        };
    }
}
;
class Circle {
    constructor(NAME, TYPE, AREA) {
        this.name = NAME;
        this.type = TYPE;
        this.area = AREA;
    }
    getDetails() {
        return {
            Circle_Name: this.name,
            Circle_Type: this.type,
            Circle_Area: this.area
        };
    }
}
// for employee
let e = new Employee("Kartik", "Manager", "Marketing");
console.log(e.getDetails());
// for circle
let c = new Circle("Big Circle", "Big-O", 1212212);
console.log(c.getDetails());
