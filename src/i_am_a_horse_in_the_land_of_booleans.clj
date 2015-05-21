(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  [x]
  (if (or (nil? x) (false? x))
    false
    true
  )
)


(defn abs [x]
  (if (< x 0)
    (- x)
    x
  )
)



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



(defn
  teen?
  [age]
  (if (and (> age 12) (< age 20))
    true
    false
  )
)



(defn not-teen? [age]
  (if (not (teen? age))
    true
    false
    )
  )


(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   )
  )



(defn leap-year? [year]
  (cond
   (= 0 (mod year 400)) true
   (and (= 0 (mod year 4)) (= 0 (mod year 100))) false
   (= 0 (mod year 4)) true
   :else false
   )
  )

; '_______'
