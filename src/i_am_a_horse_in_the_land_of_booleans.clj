(ns i-am-a-horse-in-the-land-of-booleans
    (:refer-clojure :exclude [boolean]))

(defn boolean [x]
    ((if x nil)
        ("falsy")
        ((if x false)
            ("falsy")
            ("truthy"))))

(defn abs [x]
    (if (< x 0)
        (* x -1)
        (x)))

(defn divides? [divisor n]
    (== 0 (mod n divisor)))


(defn fizzbuzz [n]
    (cond
        (divides? 3 n)  "fizz"
        (divides? 5 n)  "buzz"
        (divides? 15 n) "gotcha!"
        :else           ""))

(defn teen? [age]
    (and (<= age 19) (>= age 13))
)

(defn not-teen? [age]
    (not (teen? age))
)

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
