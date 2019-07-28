(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (nil? x) false (if (false? x) false true)))

(defn abs [x]
  (if (< x 0) (- x) x ) )

(defn divides? [divisor n]
  [divisor n] (if (= (mod n divisor) 0) true false) )

(defn fizzbuzz [n]
    (cond
  (divides? 15 n) "gotcha!"
  (divides? 3 n) "fizz"
  (divides? 5 n) "buzz"
  :else  ""))


(defn teen? [age]
   (if (>= age 13) (if (<= age 19) true false) false) )

(defn not-teen? [age]
  (not (teen? age)))

 (defn generic-doublificate [x] 
    (cond 
    (number? x) (* 2 x)
    (empty? x)  nil
    (list? x)  (* 2 (count x)) 
    (vector? x) (* 2 (count x))
    (map? x) true
  ))

(defn leap-year? [year] (if (not (= 0 (mod year 4))) false (if (not (= 0 (mod year 100))) true (if (not (= 0 (mod year 400))) false true)))) 


; '_______'
