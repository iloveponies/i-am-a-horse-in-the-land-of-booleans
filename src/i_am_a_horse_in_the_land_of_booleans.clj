(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

(defn abs [x]
  (if (< x 0) (- x) x)
)

(defn divides? [divisor n]
  (== (mod n divisor) 0)
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
      true false
    )
  false
  )
)

(defn teen2? [age]
  (if (and (< age 20) (> age 12)) true false)
)



(defn not-teen? [age]
  (not (teen? age))
  )

(defn double-coll [x]
        (* 2 (count x))
        )


(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (double-coll x)
   (vector? x) (double-coll x)
   :else true
   )

  )

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else false
   )

  )

; '_______'
