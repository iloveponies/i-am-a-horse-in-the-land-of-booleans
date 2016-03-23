(boolean "foo") ;=> true
(boolean nil) ;=> false
(boolean (+ 2 3)) ;=> true
(boolean true) ;=> true
(boolean false) ;=> false


(defn boolean [x]
  (if x true false)
)


(boolean 1)


(neg? -1)
