;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(use 'i-am-a-horse-in-the-land-of-booleans)

(boolean 1)
(boolean 0)
(boolean 'something)
(boolean "aThing")
(boolean true)
(boolean false)
(boolean :aKey)


(abs -144/64)

(teen? 19)

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(sign (- 12 34))

(def z 34)

(defn divides2? [divisor n]
  (== (mod n divisor) 0))

(divides? 30 30)

(= 0(mod 30 3) )

(defn fb [x]
  (cond
   (divides? 15 x) "gotcha"
   (divides? 3 x) "fizz"
   (divides? 5 x) "buzz"
   :else ""
   ))

(fb 70)










