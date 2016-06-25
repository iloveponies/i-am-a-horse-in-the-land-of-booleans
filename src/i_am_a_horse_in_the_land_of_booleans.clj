(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if(or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if( < x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
   (if(= 0 (mod n divisor ))
     true
     false))

(defn fizzbuzz [n]
  (cond
    (divides?  15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (if(teen? age)
    false
    true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))


(defn leap-year? [year]
  (if(and (divides? 4 year) (or (not (divides? 25 year)) (divides? 16 year)))
    true
    false))

; '_______'
