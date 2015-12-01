(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ( if x true false )
)

(defn abs [x]
  ( if (< x 0) (* -1 x) (* 1 x) )

)

(defn divides? [divisor n]
  ( if (== (mod n divisor) 0)
    true
    false
  )
)

(defn devisible_by_3? [n]
  (divides? 3 n)
)

(defn devisible_by_5? [n]
  (divides? 5 n)
)

(defn devisible_by_15? [n]
  (divides? 15 n)
)

(defn fizzbuzz [n]
  (cond
    (devisible_by_15? n) "gotcha!"
    (devisible_by_3? n)  "fizz"
    (devisible_by_5? n)  "buzz"
    :else                ""
  )
)

(defn teen? [age]
    ( <= 13 age 19 )
)

(defn not-teen? [age]
  (not (teen? age))
)

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x)  nil
    (list? x)   ( * 2 (count x) )
    (vector? x) ( * 2 (count x) )
    :else       true
  )
)

(defn leap-year? [year]
  (cond (divides? 400 year) true
        (divides? 100 year) false
        (divides? 4 year)   true
        :else               false)
)

; '_______'
