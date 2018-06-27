(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(println "Cleanliness is next to godliness")

(defn train
  []
  (println "Choo choo!"))

(defn error-message
  [severity]
  (str "SHIT NO"
    (if (= severity :mild)
      "OH NO"
      "AAAAAAHHHHHHHHHHHH")))

(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
"NON-BINARY EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))
