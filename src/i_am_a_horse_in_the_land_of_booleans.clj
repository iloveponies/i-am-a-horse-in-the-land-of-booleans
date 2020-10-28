(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
      (= (mod n 15) 0) "gotcha!"
      (= (mod n 3) 0) "fizz"
      (= (mod n 5) 0) "buzz"
      :else ""))


(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (if (teen? age)
  false
  true
  ))

(defn generic-doublificate [x]
  (cond
    (number? x) (+ x x)
    (or (list? x) (vector? x))
     (cond
       (empty? x) nil
       :else (* (count x) 2)
       )
    :else true
    )
)

(defn leap-year? [year]
  (cond
    (> (mod year 4) 0) false
    (> (mod year 100) 0) true
    (> (mod year 400) 0) false
    :else true
    )
  )

; '_______'
