(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil))
    false
    true )
  )

(defn abs [x]
  (if (< x 0 )
    (* x -1 )
    x )
  )


(defn divides? [divisor n]
    (if (= (mod n divisor) 0)
    true
    false )
  )

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    )
  )

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false )
  )

(defn not-teen? [age]
    (not (teen? age))
  )

(defn generic-doublificate [x]
  (cond
    (number? x)(* 2 x)
    (empty? x) nil
    (or (list? x)(vector? x))(* (count x) 2)
    :else
    true)
  )

(defn check-hundreds? [year]
  (if (divides? 100 year)
    (do
      (if (divides? 400 year)
        true
        false ) )
    true)
  )

(defn leap-year? [year]
  (cond
    (and (divides? 4 year) (check-hundreds? year))  true
    :else
    false
    )
  )

; '_______'
