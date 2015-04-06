(ns easy)

(defn last_element [col] (if (or (nil? col) (empty? col)) nil
                           (nth col (- (count col) 1))))

(defn second_to_last [col] (if (or (nil? col) (< (count col) 2)) nil (nth (sort col) (- (count col) 2))))
