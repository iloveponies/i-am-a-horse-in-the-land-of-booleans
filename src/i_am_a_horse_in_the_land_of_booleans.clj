
	(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


(defn
  boolean
  "Boolen or no"
  [x]
  (if (= x false) false (if (= x nil) false true)))

(defn
  abs
  "absolute valu"
  [x]
  (if (< x 0) (* -1 x) x))

(defn
  divides?
  "No remainder?"
  [divisor n]
  (if (= 0 (mod n divisor)) true false)
  )

(defn
  fizzbuzz
  "F-B!"
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else   ""
    )
  )

(defn
  teen?
  "13-19?"
  [age]
  (< 12 age 20))

(defn
  not-teen?
  "NOT teen?"
  [age]
  (not (teen? age)))

(defn
  generic-doublificate
  [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x)  (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
  ))


(defn
  leap-year?
  "is leapyear??"
  [year]
  (or (= 0 (mod year 400))(and (= 0 (mod year 4)) (not (= 0 (mod year 100))))))
; =\______/=
