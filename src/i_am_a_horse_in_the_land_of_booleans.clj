(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (<= 0 x)
    x
    (* x -1)
  )
)

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
  true
  false
  )
)

(defn fizzbuzz [x]
  (cond
   (== (mod x 15) 0) "gotcha!"
   (== (mod x 3) 0) "fizz"
   (== (mod x 5) 0) "buzz"
   (= nil) ""
  ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
  (number? x) (* x 2)
  (empty? x) nil
  (vector? x) (* 2 (count x))
  (list? x) (* 2 (count x))
  (= nil) true
   )
)

(defn leap-year? [year]
  (or
  (and (== (mod year 4) 0) (== (mod year 100) 0) (== (mod year 400) 0))
  (and (== (mod year 4) 0) (< 0 (mod year 100))))
)

; '_______'
