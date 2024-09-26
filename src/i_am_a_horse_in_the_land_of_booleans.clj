(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x] (if (< x 0) (- x) x))

(defn divides? [divisor n] (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else    ""
  )
)

(defn teen? [x] (<= 13 x 19))

(defn not-teen? [x] (not (teen? x)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (list? x)  (* (count x) 2)
    (vector? x)  (* (count x) 2)
    :else   true
    )

)

(defn leap-year? [n]
  (cond
    (divides? 400 n) true
    (divides? 100 n) false
    (divides? 4 n) true
    :else    false
  )
)

; '_______'
