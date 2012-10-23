(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if (boolean x) true false))

(defn abs [x]
  (
   if (< x 0)
   (- x)
   x
  ))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""
  ))

(defn teen? [age]
  (if (>= age 13)
    (if (<= age 19)
      true
      false
    )
    false
  ))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (+ x x)
   (empty? x) nil
   (vector? x) (* 2 (count x))
   (list? x) (* 2 (count x))
   :else true
  ))

(defn leap-year? [year]
  (cond
   (= (mod year 400) 0) true
   (= (mod year 100) 0) false
   (= (mod year 4) 0) true
   :else false
  )
)