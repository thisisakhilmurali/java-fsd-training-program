function doSomething() {
    for (var i = 0; i < 5; i++) {
        console.log(i);
    }
    console.log("Final Value of i: " + i);
}
doSomething();
var a;
var b;
var c;
var d;
var e = [1, 2, 3, 4];
var f = [1, true, "R", 4];
var Colors;
(function (Colors) {
    Colors[Colors["Red"] = 0] = "Red";
    Colors[Colors["Blue"] = 1] = "Blue";
    Colors[Colors["Purple"] = 2] = "Purple";
})(Colors || (Colors = {}));
;
var bgColor = Colors.Blue;
