// JavaScript Objects and Methods -
console.log("=== JavaScript Objects and Methods Demonstration ===\n");

let obj1 = { a: 1, b: 2 };
let obj2 = { b: 3, c: 4 };

// 1. Object.assign
let assigned = Object.assign({}, obj1, obj2);
console.log("Object.assign({}, obj1, obj2):", assigned);

// 2. Object.create
let proto = { greet: function () { return "Hello"; } };
let created = Object.create(proto);
console.log("Object.create(proto).greet():", created.greet());

// 3. Object.defineProperty
let definePropObj = {};
Object.defineProperty(definePropObj, "x", {
  value: 10,
  writable: false
});
console.log("Object.defineProperty:", definePropObj.x);

// 4. Object.defineProperties
let definePropsObj = {};
Object.defineProperties(definePropsObj, {
  a: { value: 1, writable: true },
  b: { value: 2, writable: false }
});
console.log("Object.defineProperties:", definePropsObj);

// 5. Object.entries
let entriesObj = { a: 1, b: 2 };
console.log("Object.entries:", Object.entries(entriesObj));

// 6. Object.fromEntries
let fromEntries = Object.fromEntries([["x", 10], ["y", 20]]);
console.log("Object.fromEntries:", fromEntries);

// 7. Object.freeze
let freezeObj = { a: 1 };
Object.freeze(freezeObj);
freezeObj.a = 100;
console.log("Object.freeze:", freezeObj);

// 8. Object.getOwnPropertyDescriptor
console.log("Object.getOwnPropertyDescriptor:", 
  Object.getOwnPropertyDescriptor(definePropObj, "x"));

// 9. Object.getOwnPropertyDescriptors
console.log("Object.getOwnPropertyDescriptors:", 
  Object.getOwnPropertyDescriptors(definePropsObj));

// 10. Object.getOwnPropertyNames
console.log("Object.getOwnPropertyNames:", Object.getOwnPropertyNames(definePropsObj));

// 11. Object.getOwnPropertySymbols
let sym = Symbol("id");
let symObj = { [sym]: 123 };
console.log("Object.getOwnPropertySymbols:", Object.getOwnPropertySymbols(symObj));

// 12. Object.getPrototypeOf
console.log("Object.getPrototypeOf:", Object.getPrototypeOf(created));

// 13. Object.hasOwn
console.log("Object.hasOwn(obj1, 'a'):", Object.hasOwn(obj1, "a"));

// 14. Object.is
console.log("Object.is(NaN, NaN):", Object.is(NaN, NaN));

// 15. Object.isExtensible
let extensibleObj = {};
console.log("Object.isExtensible:", Object.isExtensible(extensibleObj));

// 16. Object.isFrozen
console.log("Object.isFrozen(freezeObj):", Object.isFrozen(freezeObj));

// 17. Object.isSealed
let sealedObj = { a: 1 };
Object.seal(sealedObj);
console.log("Object.isSealed:", Object.isSealed(sealedObj));

// 18. Object.keys
console.log("Object.keys:", Object.keys(obj1));

// 19. Object.preventExtensions
let preventObj = { a: 1 };
Object.preventExtensions(preventObj);
preventObj.b = 2;
console.log("Object.preventExtensions:", preventObj);

// 20. Object.seal
let sealObj = { a: 1 };
Object.seal(sealObj);
sealObj.a = 10;
console.log("Object.seal:", sealObj);

// 21. Object.setPrototypeOf
let proto2 = { sayHi: () => "Hi" };
let spObj = {};
Object.setPrototypeOf(spObj, proto2);
console.log("Object.setPrototypeOf:", spObj.sayHi());

// 22. Object.values
console.log("Object.values:", Object.values(obj1));

console.log("\n--- Prototype Methods ---\n");
let protoMethodsObj = { x: 10 };

// constructor
console.log("constructor:", protoMethodsObj.constructor === Object);

// hasOwnProperty
console.log("hasOwnProperty('x'):", protoMethodsObj.hasOwnProperty("x"));

// isPrototypeOf
console.log("isPrototypeOf:", Object.prototype.isPrototypeOf(protoMethodsObj));

// propertyIsEnumerable
console.log("propertyIsEnumerable('x'):", protoMethodsObj.propertyIsEnumerable("x"));

// toLocaleString
console.log("toLocaleString:", protoMethodsObj.toLocaleString());

// toString
console.log("toString:", protoMethodsObj.toString());

// valueOf
console.log("valueOf:", protoMethodsObj.valueOf());
