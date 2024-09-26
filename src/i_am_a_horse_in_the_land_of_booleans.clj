(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 5) 0)  "buzz"
    (= (mod n 3) 0)  "fizz"
    :else            ""))

(defn teen? [age]
  (>= 19 age 13))

(defn not-teen? [age]
  (or (< age 13) (> age 19) ))

(defn generic-doublificate [x]
  (cond
    (number? x)  (* x 2)
    (empty? x)   nil
    (list? x)    (* (count x) 2)
    (vector? x)  (* (count x) 2)
    :else        true))

(defn leap-year? [year]
  (or
      (and
        (= (mod year 4) 0)
        (not= (mod year 100) 0)
      )
      (and
        (= (mod year 100) 0)
        (= (mod year 400) 0)
      )
  ))

; '_______'
