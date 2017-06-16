(ns smith-waterman.algorithm)

(defn size [x,y] (
     (doseq [m y]
       (println (str m x)))
))

(size "helloWorld" "wow")