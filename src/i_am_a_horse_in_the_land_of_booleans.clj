(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (< x 0)
    (- x)
    (+ x)
  )
)

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false
  )
)

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 3)) "fizz"
    (= 0 (mod n 5)) "buzz"
    :else            ""
  )
)

(defn teen? [age]
  (< 12 age 20)
)

(defn not-teen? [age]
  (or (< age 13) (> age 19))
)

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true
  )
)

(defn leap-year? [year]
  (cond
    (== 0 (mod year 100)) (== 0 (mod year 400))
    (== 0 (mod year 4)) true
    :else false
  )
)

; '_______'
