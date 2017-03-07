(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs [n]
  (if (> n 0)
    n
    (* n -1)))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n)  "buzz"
    (divides? 3 n)  "fizz"
    :else           ""))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false))

(defn not-teen? [age]
    (if (teen? age)
    false
    true))

(defn generic-doublificate [x]
  (cond
    (number? x)                 (* x 2)
    (empty? x)                  nil  
    (or (list? x) (vector? x))  (* (count x) 2)
    :else                       true))

(defn leap-year? [year]
  (cond
    (not (= 0 (mod year 4)))          false
    (and (= 0 (mod year 4)) 
         (not (= 0 (mod year 100))))  true
    (and (= 0 (mod year 4)) 
         (= 0 (mod year 100)) 
         (= 0 (mod year 400)))        true
    :else                             false))

; '_______'