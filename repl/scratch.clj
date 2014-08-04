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


(abs 144/64)

(teen? 19)

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

