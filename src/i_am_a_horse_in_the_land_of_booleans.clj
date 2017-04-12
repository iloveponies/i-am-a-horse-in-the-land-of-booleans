(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
 (if (= x nil)
    false
    (if (= x false)
      false
      true
    )
  )
)

(defn abs [x]
   (cond
   (> 0 x) (- x)
   :else x)
)

(defn divides? [divisor n]
 (if (= 0 (mod n divisor))
   true
   false
   )
)

(defn fizzbuzz [n]
  (cond
    (= true (divides? 15 n)) "gotcha!"
    (= true (divides? 3 n)) "fizz"
    (= true (divides? 5 n)) "buzz"
  :else "")
)

(defn teen? [age]
 ( if (< 12 age 20)
    true
    false
   )
)

(defn not-teen? [age]
  (cond
    (= true (teen? age)) false
    :else true)
)

(defn generic-doublificate [x]
    (cond
      (number? x ) (* x 2)
      (= true (empty? x)) nil
      (= true (list? x)) (* 2(count x))
      (= true (vector? x)) (* 2(count x))
      :else true)
)

(defn leap-year? [year]
  (cond
      (not (= true (= 0 (mod year 4)))) false
      (not (= true (= 0 (mod year 100)))) true
      (not (= true (= 0 (mod year 400)))) false
    :else true)
)

; '_______'
