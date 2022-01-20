import { BrowserRouter, Routes, Route } from "react-router-dom";
import Welcome from "./pages/Welcome";
import ApplicationForm from "./pages/ApplicationForm";

const App = () => {


  return (
    
    <BrowserRouter>
      <Routes>

        <Route path="/" element={<Welcome />}/>
        <Route path="/apply" element={<ApplicationForm />}/>

      </Routes>
    </BrowserRouter>

  );
}

export default App;
