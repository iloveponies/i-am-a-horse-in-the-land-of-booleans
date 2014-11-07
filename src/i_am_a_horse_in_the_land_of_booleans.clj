(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x) )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false) )

(defn fizzbuzz [n]
  (if (=(mod n 15) 0)
       "gotcha!"
       (if(= (mod n 3) 0)
          "fizz"
          (if (=(mod n 5) 0)
              "buzz"
              ""))))

(defn teen? [age]
  (< 12 age 20) )

(defn not-teen? [age]
   (not (teen? age)) )

(defn generic-doublificate [x]
  (if (number? x)
    (* x 2)
    (if (empty? x)
      nil
      (if ( or ( list? x) (vector? x) )
        (* 2 (count x))
        true
        ))))

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
