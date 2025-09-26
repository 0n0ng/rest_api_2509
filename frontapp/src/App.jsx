import { BrowserRouter, Routes, Route } from "react-router-dom"
import Main from "./pages/Main" // 페이지를 불러올 때 무조건!
import Login from "./pages/Login"
import ArticleList from "./pages/ArticleList"
import Nav from "./componentes/Nav"

function App() {
    return (
        <>
            <BrowserRouter>
                <Nav></Nav>
                <Routes>
                    <Route index element={<Main/>} />
                    <Route path="/auth/login" element={<Login/>} />
                    <Route path="/article/list" element={<ArticleList/>} />
                </Routes>
            </BrowserRouter>
        </>
    )
}

export default App
