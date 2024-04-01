import "./App.css";
import Hello from "./Hello";
import { useEffect, useState } from "react";

function App() {
  const [message, setMessage] = useState("");
  useEffect(() => {
    const name = "Gloria"
    fetch(`http://localhost:8080/hello?name=${name}`).then((response) => {
      response.text().then((stringText) => {
        setMessage(stringText);
        console.log(stringText);
      });
    });
  }, [message]);
  return <Hello name={message} />;
}

export default App;
