(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
 (if (< x 0)
    (* -1 x)
   x
   )
)

(defn divides? [divisor n]
 (if (< (mod divisor n) 1)
    false
   true
   )
)

(defn fizzbuzz [n]
    (if (= (mod n 15) 0)
    "gotcha!"
       (if (= (mod n 3) 0)
    "fizz"
         (if (= (mod n 3) 1)
           "buzz"
    ""
))))


(defn teen? [age]
 (if (and (>= age 13) (<= age 19))
    true
    false)
)

(defn not-teen? [age]
  (if(teen? age)false true))

(defn generic-doublificate [x]
  (cond
   (number? x) (if (> x 1) (* x x) 2)
   (empty? x) nil
   (list? x) (* (count x) (count x))
   (vector? x) (* (count x) (count x))
   :else true)
  )

(defn leap-year? [year]
  ":(")

; '_______'
