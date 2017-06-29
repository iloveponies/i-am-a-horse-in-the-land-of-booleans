(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x)
)

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false)
)

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 5)) "buzz"
    (= 0 (mod n 3)) "fizz"
    :default ""
  )
)

(defn teen? [age]
  (= true (< age 20) (> age 12))
)

(defn not-teen? [age]
  (= false (teen? age))
)

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :default true
  )
)

(defn leap-year? [year]
  (cond
    (zero? (mod year 400)) true
    (zero? (mod year 100)) false
    (zero? (mod year 4)) true
    :default false)
)

; '_______'
