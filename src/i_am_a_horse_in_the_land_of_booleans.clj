(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil)(= x false))
    false
    true
    )
)




(defn abs [x]
  (max x (- x))
  )


(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false)
  )

(defn fizzbuzz [n]
  (cond
    (and (divides? 15 n)(divides? 3 n)) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"

    :else "")
)

(defn teen? [age]
  (if (or (< age 13)(> age 19))
    false
    true
    )
)

(defn not-teen? [age]
  (if (teen? age)
    false
    true)
  )

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x)(vector? x)) (* (count x) 2)
    :else true)

  )

(defn leap-year? [year]
  (cond
    (zero? (mod year 400)) true
    (zero? (mod year 100)) false
    (zero? (mod year 4)) true
    :default false)
  )

; '_______'
