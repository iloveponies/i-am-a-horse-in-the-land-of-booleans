(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil))
    false
    true
    )
  )

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x)
  )

(defn divides? [divisor n]
  (if (= (rem n divisor) 0)
    true
    false
    )
  )

(defn fizzbuzz [n]
  (cond
    (and (= (rem n 3) 0) (= (rem n 5) 0)) "gotcha!"
    (= (rem n 5) 0) "buzz"
    (= (rem n 3) 0) "fizz"
    :else ""

    )
  )

(defn teen? [age]
  (if (and (< age 20) (> age 12))
    true
    false
    )
  )

(defn not-teen? [age]
  (if-not (teen? age)
    true
    false
    )
  )

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (vector? x) (list? x)) (* (count x) 2)
    :else true
    )
  )

(defn leap-year? [year]
  (cond
    (not= (rem year 4) 0) false
    (not= (rem year 100) 0) true
    (not= (rem year 400) 0) false
    :else true
    )
  )

; '_______'
