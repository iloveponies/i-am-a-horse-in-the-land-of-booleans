(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x (if nil false true) false)
)

(defn teen? [x]
  (if (and (>= x 13) (<= x 19))  true false)
)

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(defn abs [x]
  (if (= (sign x) "-") (- x) x)
)

(defn divides? [x y]
  (if (= (mod y x) 0) true false)
)

(defn fizzbuzz [number]
  (cond
    (divides? 15 number) "gotcha!"
    (divides? 3 number) "fizz"
    (divides? 5 number) "buzz"
    :else         ""))

(defn generic-doublificate [input]
  (cond
    (number? input) (* input 2)
    (empty? input) nil
    (list? input) (* (count input) 2)
    (vector? input) (* (count input) 2)
    :else         true))

(defn not-teen? [age]
  (not (teen? age))
  )

(defn leap-year? [year]
  (if (divides? 400 year) true (if (divides? 100 year) false (if (divides? 4 year) true false)  ))
  )
