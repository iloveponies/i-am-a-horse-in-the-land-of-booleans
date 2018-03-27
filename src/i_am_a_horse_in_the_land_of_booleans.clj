(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (>= x 0) x (- x)))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (zero? (mod n 15)) "gotcha!"
    (zero? (mod n 5))  "buzz"
    (zero? (mod n 3))  "fizz"
    :else              ""))

(mod 9 3)
(zero? (mod 9 3))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x)    (* x 2)
    (empty? x)     nil
    (or
      (list? x)
      (vector? x)) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
  (cond
    (zero? (mod year 400)) true
    (zero? (mod year 100)) false
    (zero? (mod year 4))   true
    :else false))

; '_______'

(comment 
  (if "foo" "truthy" "falsey")
  (if 0 "truthy" "falsey")
  (if [] "truthy" "falsey")
  (if false "truthy" "falsey")
  (if nil "truthy" "falsey")
  (boolean "foo")
  (boolean nil)
  (boolean (+ 2 3))
  (boolean true)
  (boolean false)
  (teen? 20)
  (not-teen? 12)
  (abs  1)
  (divides? 2 5)
  (fizzbuzz 2)
  (fizzbuzz 45)
  (fizzbuzz 48)
  (fizzbuzz 70)
  (generic-doublificate 1)
  (generic-doublificate [1 2])
  (generic-doublificate '(65 21))
  (generic-doublificate {})
  (generic-doublificate [])
  (generic-doublificate {:a 1})
  (leap-year? 100)
  (leap-year? 200)
  (leap-year? 400)
  (leap-year? 12)
  (leap-year? 20)
  (leap-year? 15)
  )
