(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil)) false true))

(defn abs [x]
  (if (> x 0) x (* -1 x)))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
   (== (mod n 15) 0) "gotcha!"
   (== (mod n 3) 0) "fizz"
   (== (mod n 5) 0) "buzz"
   :else ""))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (vector? x) (* 2 (count x) )
   (list? x) (* 2 (count x)  )
  :else true) )

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (or (< age 13) (> age 19)))


(defn leap-year? [year]
    (and (= (mod year 4) 0)
       (or (not= (mod year 100) 0)
           (= (mod year 400) 0))))

; '_______'
