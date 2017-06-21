(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  [x]
  (if (or (= x nil) (= x false))
    false
    true))


(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn divides?
  [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? n 3) "fizz"
    (divides? n 5) "buzz"
    (divides? n 15) "gotcha!"
    :else "")

(defn teen?
  [age]
  (if (<= age 19)
    true
    false))

(defn not-teen?
  [age]
  (if (teen? age)
    false
    true))

(defn generic-doublificate
  [x]
  (cond
    (number? x) (+ n n)
    (empty? x) nil
    (list? x) (+ (count x) (count x))
    (vector? x) (+ (count x) (count x))
    :else true)

 (defn leap-year? [year]
   (cond
     (not (divides? 4 year))         false
     (not (divides? 100 year))       true
     (not (divides? 400 year))       false
     :else                            true))

; '_______'
