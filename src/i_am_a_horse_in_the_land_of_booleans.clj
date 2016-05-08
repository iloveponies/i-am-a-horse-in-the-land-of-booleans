(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))




(defn teen? [age]
  (if (and (<= age 19)(>= age 13))
           true
           false))

(defn not-teen? [age]
  (if (and (<= age 19)(>= age 13))
           false
           true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))


(defn leap-year? [year]
  (if (not (divides? 4 year)) false
    (if (divides? 400 year) true
      (if (divides? 100 year) false
        (if (divides? 4 year) true
          false
        )
      )
    )
  )
)


; '_______'
