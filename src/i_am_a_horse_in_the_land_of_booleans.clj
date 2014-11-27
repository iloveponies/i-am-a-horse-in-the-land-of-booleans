(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
   (= 0 (mod n 15)) "gotcha!"
   (= 0 (mod n 5)) "buzz"
   (= 0 (mod n 3)) "fizz"
   :else ""
        ))

(defn teen? [age]
  (and (< age 20) (> age 12))
)

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate
"doubles it if it is a number,
returns nil if it is an empty collection,
if it is a list or a vector, returns two times the length of it
returns true otherwise."
  [x]
  (cond
   (number? x) (* 2 x)
   (empty? x)  nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   )
)

(defn leap-year?
  "A year is a leap year if it is divisible by 4, except if it is divisible by 100, in which case it still is a leap year if it is divisible by 400."
  [year]
  (cond (= 0 (mod year 400)) true
        (= 0 (mod year 100)) false
        (= 0 (mod year 4)) true
        :else false
        )
  )

; '_______'
