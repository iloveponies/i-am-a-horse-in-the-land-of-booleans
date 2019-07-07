(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(boolean "foo") ;=> true
(boolean nil) ;=> false
(boolean (+ 2 3)) ;=> true
(boolean true) ;=> true
(boolean false) ;=> false

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(abs -2) ;=> 2
(abs 42) ;=> 42


(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false
    ))

(divides? 2 4) ;=> true
(divides? 4 2) ;=> false
(divides? 5 10) ;=> true
(divides? 2 5) ;=> false

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""
   ))

(fizzbuzz 2)  ;=> ""
(fizzbuzz 45) ;=> "gotcha!"
(fizzbuzz 48) ;=> "fizz"
(fizzbuzz 70) ;=> "buzz"

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (if (teen? age)
    false
    true)
  )
(not-teen? 13) ;=> false
(not-teen? 25) ;=> true
(not-teen? 12) ;=> true
(not-teen? 19) ;=> false
(not-teen? 20) ;=> true

(defn generic-doublificate [x]
  (cond
       (number? x) (* x 2)
       (empty? x) nil
       (list? x) (* (count x) 2)
       (vector? x) (* (count x) 2)
       :else true

      ))

(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true

(defn leap-year? [year]
  (cond
   (and (divides? 4 year) (divides? 100 year) (divides? 400 year)) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else false


   ))

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false

; '_______'


