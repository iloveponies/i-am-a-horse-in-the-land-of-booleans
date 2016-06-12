(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if(< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (if (= (mod n 3) 0)
    (if (= (mod n 5) 0)
      "gotcha!"
      "fizz")
    (if (= (mod n 5) 0)
      "buzz"
      "")))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (or (> 13 age) (< 19 age)))

(defn generic-doublificate [x]
  (cond
    (number? x) 2
    (empty? x) nil
    (or (vector? x) (list? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (if (= (mod year 4) 0)
    (if (= (mod year 100) 0)
      (if (= (mod year 400) 0)
        true
        false)
      true)
    false))

; '_______'
