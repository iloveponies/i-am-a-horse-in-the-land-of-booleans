(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs [x]
  (if (<= x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
   :else ""))

(defn teen? [age]
  (>= 19 age 13))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))


(defn leap-yearCond? [year]
  (cond
   (= (mod year 400) 0) true
   (= (mod year 100) 0) false
   (= (mod year 4) 0) true
   :else false))

(defn leap-year? [year]
  (or (= (mod year 400) 0)
      (and (= (mod year 4) 0)
           (not (= (mod year 100) 0)))))

; '_______'


