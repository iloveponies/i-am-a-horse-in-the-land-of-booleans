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
    (and (<= age 19) (>= age 13)))

(defn not-teen? [age]
    (not (teen? age)))

(defn generic-doublificate [x]
    (cond
        (number? x)                 (* x 2)
        (empty? x)                  true
        (or (list? x) (vector? x))  (* (count x) 2)
        :else                       true))

(defn leap-year? [year]
    (cond
        (and (divisible? 100 year) (divisible? 400 year))   true
        (divisible? 4 year)                                 true
        :else                                               false))

; '_______'
