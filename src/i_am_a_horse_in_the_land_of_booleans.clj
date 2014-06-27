(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (nil? x) (not x))))
;;  (if (or (nil? x) (not x)) (false)
;;    (true)))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (== (mod n 15) 0) "gotcha!"
    (== (mod n 5) 0) "buzz"
    (== (mod n 3) 0) "fizz"
    :else ""
  ))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (or (< age 13)(> age 19)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
   :else true 
  )
  )

(defn leap-year? [year]
  (and
  (== (mod year 4) 0)
  (or (not(== (mod year 100) 0))
      (== (mod year 400) 0))
  ))

; '_______'
