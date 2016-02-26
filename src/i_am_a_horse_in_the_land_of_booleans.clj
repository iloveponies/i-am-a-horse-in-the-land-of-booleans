(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true
      )))

(defn abs [x]
  (if (< x 0)
    (- x (* x 2))
    x
    ))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
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
  (if (< age 20)
    (if (> age 12)
      true
      false
      )
    false
    ))

(defn not-teen? [age]
  (not (teen? age))
  )

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
  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true
   )
  )


; '_______'
