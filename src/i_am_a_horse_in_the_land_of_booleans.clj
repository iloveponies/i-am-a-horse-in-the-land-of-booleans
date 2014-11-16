(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

;(boolean (+ 3 4))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x)
  )

(abs 5)

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false
    )
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
  (<= 13 age 19)
  )

(teen? 19)

(defn not-teen? [age]
  (if (teen? age)
    false
    true)
  )

  (not-teen? 20)

(defn generic-doublificate [x]
  (cond
     (number? x) (* 2 x)
     (empty? x) nil
     (list? x) (* (count x) 2)
     (vector? x) (* (count x) 2)
     :else true
   )
  )

(generic-doublificate 434)

(defn leap-year? [year]
  (if (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year)
        true
        false
        )
      true)
    false
    )
  )

; '_______'

(fizzbuzz 45)
