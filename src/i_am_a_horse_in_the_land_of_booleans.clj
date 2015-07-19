(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

;Exercise 1
;Implement (boolean x), which works like the built-in boolean function: for nil and false, it returns false, 
; and for all other values it returns true. You can use if in its implementation, but not the build-in boolean.
;(boolean "foo") ;=> true
;(boolean nil) ;=> false
;(boolean (+ 2 3)) ;=> true
;(boolean true) ;=> true
;(boolean false) ;=> false
(defn boolean [x] 
  (if (= x true) true (if (= x false) false (if (= x nil) false true))))

;Exercise 3
;Write the function (abs n), which returns the absolute value of n, i.e. if n<0, 
; the value of (abs n) is −n, and otherwise n.
;(abs -2) ;=> 2
;(abs 42) ;=> 42
(defn abs [x] 
  (if (> x 0) x (- x (* 2 x))))

;Exercise 4
;Write the function (divides? divisor n), which returns true if divisor divides n and false otherwise.
;(mod num div) returns 0 if div divides num exactly:
;(mod 10 5) ;=> 0
;(mod 3 2)  ;=> 1
;(divides? 2 4) ;=> true
;(divides? 4 2) ;=> false
;(divides? 5 10) ;=> true
;(divides? 2 5) ;=> false
 (defn divides? [divisor n] 
   (if (= (mod n divisor) 0) true false))


;Exercise 5
;Write the function (fizzbuzz n) that returns
;   "fizz" when n is divisible by 3,
;   "buzz" when n is divisible by 5,
;   "gotcha!" when n is divisible by 15, and
;   the empty string "" otherwise.
;Use the divides? function from the previous exercise.
;(fizzbuzz 2)  ;=> ""
;(fizzbuzz 45) ;=> "gotcha!"
;(fizzbuzz 48) ;=> "fizz"
;(fizzbuzz 70) ;=> "buzz"
(defn fizzbuzz [n] 
  (cond 
    (divides? 15 n) "gotcha!" 
    (divides? 5 n) "buzz" 
    (divides? 3 n) "fizz" 
    :else ""))


;Exercise 2
;Write the function (teen? age), which returns truthy if age is at least 13 and at most 19. 
; Use only one comparison operator and give it three arguments.
;(teen? 12) ;=> false
;(teen? 13) ;=> true
;(teen? 15) ;=> true
;(teen? 19) ;=> true
;(teen? 20) ;=> false
;(teen? 27) ;=> false
 (defn teen? [age]  
   (> 20 age 12))


;Exercise 7
;Write the function (not-teen? age), which returns true when teen? returns false and false otherwise.
;(not-teen? 13) ;=> false
;(not-teen? 25) ;=> true
;(not-teen? 12) ;=> true
;(not-teen? 19) ;=> false
;(not-teen? 20) ;=> true
(defn not-teen? [age]
  ":(")

;Exercise 6
;Write a function (generic-doublificate x) that takes one argument and
;doubles it if it is a number,
;returns nil if it is an empty collection,
;if it is a list or a vector, returns two times the length of it
;returns true otherwise.
;You can use the following functions:
;(number? n) returns true if n is a number.
;(empty? coll) returns true if coll is empty.
;(list? coll) and (vector? coll) test if coll is a list or a vector.
;(count coll) returns the length of a list or a vector.
;(generic-doublificate 1)        ;=> 2
;(generic-doublificate [1 2])    ;=> 4
;(generic-doublificate '(65 21)) ;=> 4
;(generic-doublificate {})       ;=> nil
;(generic-doublificate [])       ;=> nil
;(generic-doublificate {:a 1})   ;=> true
(defn generic-doublificate [x]
  ":(")

;Exercise 8
;Write the function (leap-year? year), which returns true if year is a leap year, otherwise false. 
;  A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case 
;  it still is a leap year if it is divisible by 400.
;See Wikipedia for a simple pseudocode solution.
;(leap-year? 100) ;=> false
;(leap-year? 200) ;=> false
;(leap-year? 400) ;=> true
;(leap-year? 12)  ;=> true
;(leap-year? 20)  ;=> true
;(leap-year? 15)  ;=> false
(defn leap-year? [year]
  ":(")

; '_______'
