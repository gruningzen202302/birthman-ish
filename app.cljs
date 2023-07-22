(ns app
  (:require ["moment$default" :as moment]
            ["inquirer$default" :as inquirer]
            [promesa.core :as p]))

(println "Questionaire ")

(def questions (clj->js[{ :name "name" 
                          :type "input"
                          :message "Who's birthday is it?"}]))

(p/let [x (inquirer/prompt questions)]
  (println x)) 

(comment
  moment () .year ()
  (.year (moment))
  )
