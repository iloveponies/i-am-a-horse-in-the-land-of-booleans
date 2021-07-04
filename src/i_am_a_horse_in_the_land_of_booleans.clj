(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
  true
  false))

(boolean nil)
(boolean "false")
(boolean (+ 1 2 3))
(boolean (+ 1 2))
(boolean false)
(boolean true)


(defn abs [x]
  (if (< x 0)
    (- x)
    (+ x)))

(abs 2)
(abs -2)
(abs 0)


(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(divides? 3 9)
(divides? 2 9)



(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else            ""))

(fizzbuzz 15)

(defn teen? [age]
  (if (<= 13 age 19)
  true
  false))

(teen? 12)
(teen? 15)

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (+ x x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))


(generic-doublificate 5)
(generic-doublificate [])
(generic-doublificate [1 2 3])
(generic-doublificate '(1 2 3))

(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true

(defn leap-year? [year]
  (cond
    (not (divides? 4 year)) false
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))


(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false

; '_______'
