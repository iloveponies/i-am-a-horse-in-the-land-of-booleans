(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]

    (if x true false)
  )

(defn abs [x]

  (if (> 0 x) (- 0 x) x)

)

(defn divides? [divisor n]

  (if ( == 0 (mod n divisor)) true false)

  )

(defn fizzbuzz [n]

  (cond

   (== (mod n 15) 0) "gotcha!"
   (== (mod n 3) 0) "fizz"
   (== (mod n 5) 0) "buzz"

   :else
   ""
   )

  )

(defn teen? [age]

    (<= 13 age 19)

  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]

  (cond

      (number? x) (* 2 x)
      (empty? x) nil
      (or (list? x) (vector? x)) (* 2 (count x))
      :else
      true

   )

  )

(defn leap-year? [year]
   (
    cond
    (and (== 0 (mod year 4)) (not (== 0 (mod year 100))) ) true
    (and (== 0 (mod year 4)) (== 0 (mod year 100)) (== 0 (mod year 400) )) true
    :else
    false
    )
 )


; '_______';
