(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0)
    x
    (- x)
    ))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false
    )
  )

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""
   )
  )

(defn teen? [age]
  (if (and (> age 12) (< age 20))
    true
    false)
  )

(defn not-teen? [age]
   (not (teen? age))
 )


(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
    )
   )

(defn leap-year? [year]
  (if
   ( or (divides? 400 year)
   (and (divides? 4 year) (not (divides? 100 year))))
    true
    false
   ))

(teen? 12) ;=> false
(teen? 13) ;=> true
(teen? 15) ;=> true
(teen? 19) ;=> true
(teen? 20) ;=> false
(teen? 27) ;=> false

(not-teen? 13) ;=> false
(not-teen? 25) ;=> true
(not-teen? 12) ;=> true
(not-teen? 19) ;=> false
(not-teen? 20) ;=> true

; '_______'
