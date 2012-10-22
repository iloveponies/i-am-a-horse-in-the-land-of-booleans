(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if (or (= x false) (= x nil)) 
        false
        true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3  n) "fizz"
    (divides? 5  n) "buzz"
     :else          ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (cond
     (number? x) (* 2 x)
     (empty? x) nil
     (list? x) (map #(* 2 %1) x)
     (vector? x) (map #(* 2 %1) x)
     :else true
    ))

(defn leap-year? [year]
  (cond 
     (= (mod year 400) 0) true
     (= (mod year 100) 0) false
     (= (mod year 4)   0) true
     :else                false
  ))
; '_______'
