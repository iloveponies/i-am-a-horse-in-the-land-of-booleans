(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "Works the same as the standard boolean fn"
  (if(or (false? x) (nil? x)) false true))

(defn abs [x]
  "Returns the absolute value of x"
  (if(< x 0) (- x) x))

(defn divides? [divisor n]
  "Returns true if divisor is a divisor of n"
  (if(== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  "Fizzzzzzzbuzzzzzzzz"
  (cond
   (== (mod n 15) 0)   "gotcha!"
   (== (mod n 5) 0)   "buzz"
   (== (mod n 3) 0 ) "fizz"
   :else              ""))

(defn teen? [age]
  "Returns true if age is between 13 to 19 inclusive"
  (if(<= 13 age 19) true false))

(defn not-teen? [age]
  "Returns the opposite of fn teen?"
  (not (teen? age)))

(defn generic-doublificate [x]
  "Doubles any input in a logical way"
  (cond
   (number? x)  (* x 2)
   (empty? x)   nil
   (list? x)    (* (count x) 2)
   (vector? x)  (* (count x) 2)
   :else        true))

(defn leap-year? [year]
  "Tells you if it's a leap year"
  (cond
   (== (mod year 400) 0) true
   (== (mod year 100) 0) false
   (== (mod year 4) 0)   true
   :else                 false))

; '_______'
