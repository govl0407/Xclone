
import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
  const [data, setdata] = useState({ id: '', password: '' })

  useEffect(() => {
    axios.get('http://localhost:8080/testapi')
        .then(response => setdata(response.data))
        .catch(error => console.log(error))
  }, []);

  return (
      <div>
          apiid = {data.id} <br />
          apipw = {data.password}
      </div>
  );
}

export default App;