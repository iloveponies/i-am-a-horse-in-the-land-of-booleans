(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


(defn boolean [x]    (if (or (= x false  ) (= x nil  ) ) false true  ))


(defn abs [x] (if (> x 0 ) x (* x -1) ))

(defn divides? [divisor n] (if (== ( mod n divisor) 0) true false ) )

(defn fizzbuzz [n]
  (cond
   ( divides? 15 n   ) "gotcha!"
   ( divides? 5 n   )  "buzz"
   ( divides? 3 n   ) "fizz"

   :else         "" )
)



(defn teen? [age] (if (and (>= age 13  )  (<= age 19  ) ) true false  ) )


(defn not-teen? [age]

  (cond
   (teen? age ) false

     :else true )
   )

(defn generic-doublificate [x]
 (cond
     ( number? x ) (* x 2)
     (empty? x) nil
     (list? x ) (* (count x) 2)
     (vector? x)  (* (count x) 2)

  :else true )

    )


(defn leap-year? [year]
  ( if (not (divides? 4 year) )
   false

  ( if ( not( divides? 100 year))
    true

    ( if  ( not( divides? 400 year))
     false
     true

   )
  )


 )
)
