(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (> 0 x)
    (- x)
    x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (if (divides? 3 n)
    (if (divides? 5 n)
      "gotcha!"
      "fizz")
    (if (divides? 5 n)
      "buzz"
      ""
    )))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
    (if (empty? x)
      nil
      (if (or (list? x) (vector? x))
        (* 2 (count x))
        true
      )
    )
  )
)

(defn leap-year? [year]
  (if (divides? 400 year)
    true
    (if (divides? 100 year)
      false
      (if (divides? 4 year)
        true
        false
      )
    )
  )
)