(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "boolean function override"
  (if (= x nil)
    false
    (if (= x false)
      false
      true
    )
  )
)

(defn abs [x]
  (if (> x 0)
    x
    (- x))
)


(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false)
)

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 5 n) "buzz"
     (divides? 3 n) "fizz"
     :else "")
)

(defn teen? [age]
  (<= 13 age 19)
)

(defn not-teen? [age]
  (not (teen? age))
)


(defn generic-doublificate [x]
  (cond
     (number? x) (* x 2)
     (empty? x)  nil
     (or (list? x) (vector? x)) (* (count x) 2)
     :else true
  )
)


(defn leap-year? [year]
  (if (not (divides? 4 year))
    false
    (if (not (divides? 100 year))
      true
      (if (not (divides? 400 year))
        false
        true
      )
    )
  )
)
; '_______'
