(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* (count x) 2)
   :else true))


(defn leap-year? [year]
  ":(")

; '_______'


(boolean "afas")
(teen? 12) ;=> false
(teen? 13) ;=> true
(teen? 15) ;=> true
(teen? 19) ;=> true
(teen? 20) ;=> false
(teen? 27) ;=> false
(abs -2) ;=> 2
(abs 42) ;=> 42
(divides? 2 4) ;=> true
(divides? 4 2) ;=> false
(divides? 5 10) ;=> true
(divides? 2 5) ;=> false
(fizzbuzz 2)  ;=> ""
(fizzbuzz 45) ;=> "gotcha!"
(fizzbuzz 48) ;=> "fizz"
(fizzbuzz 70) ;=> "buzz"
(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true
