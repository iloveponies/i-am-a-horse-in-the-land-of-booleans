(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond (= x false) false
        (= x nil) false
        :else true)
)

(defn abs [x]
   (if (>= x 0) x (* -1 x))
  )

(defn divides? [divisor n]
   (if (== 0 (mod n divisor)) true false)
)

(defn fizzbuzz [n]
   (cond (== 0 (mod n 15)) "gotcha!"
         (== 0 (mod n 3)) "fizz"
         (== 0 (mod n 5)) "buzz"
         :else "")
)

(defn teen? [age]
  (cond (< age 13) false
        (> age 19) false
        :else true)
)


(defn not-teen? [age]
     (not (teen? age))
  )

(defn generic-doublificate [x]
     (cond (= true (number? x)) (* 2 x)
           (= true (empty? x)) nil
           (= true (list? x)) (* 2 (count x))
           (= true (vector? x)) (* 2 (count x))
           :else true

  )
)

(defn leap-year? [year]
      (cond (== 0 (mod year 400)) true
            (== 0 (mod year 100)) false
            (== 0 (mod year 4)) true
            :else false
            )
  )


