import TrafficLight from "./components/TrafficLights/TrafficLight";
import TodoList from "./components/TodoList/TodoList";
import "./components/TodoList/style.css"
import FetchGithubUsers from "./components/GithubUsers.jsx/FetchGithubUsers";
import FetchGithubRepo from "./components/GithubRepoAPI/FetchGithubRepo";

function App() {
  return(
    <div className="App">
      {/*<TrafficLight initialValue={0} />*/}
      {/*<TrafficLight initialValue={1} />*/}
      {/* <TodoList /> */}
      {/* <FetchGithubUsers /> */}
      <FetchGithubRepo />

    </div>
  );
}

export default App;