(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
   (if (or (nil? x) (false? x)) false true)
  )



(defn abs [x]
  (if(neg? x)
  (* x -1)
  (* x 1)
  ))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0 )
    true
    false
  ))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""
   ))

(defn teen? [age]
  (if (and (> age 12) (< age 20)) true false)
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   ))

(defn leap-year? [year]
  (if (not (divides? 4 year))
    false
    (if (not (divides? 100 year))
      true
      (if (not (divides? 400 year))
        false
        true)
     )
 ))
; '_______'
