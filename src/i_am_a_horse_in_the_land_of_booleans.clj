(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) false true))


(defn abs [x]
  (if (< x 0) (* x -1) x))


(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (if (= (mod n 15) 0) "gotcha!"
      (if (= (mod n 5) 0) "buzz"
          (if (= (mod n 3) 0) "fizz" "")
          )))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true
   ))

(defn leap-year? [year]
  (if (= (mod year 400) 0) true
      (if (= (mod year 100) 0) false 
          (if (= (mod year 4) 0) true false))))

