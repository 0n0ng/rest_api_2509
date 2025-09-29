import { useState } from "react"

function ArticleList( ) {
    const [articleList, setArticleList] = useState([])

    fetch("http//localhost:8090/api/vq/articles")
    // 받아졌을 때 .then
        .then((res) => res.json())
        .then((res) => {
            console.log(res)
        })

    return ( 
        <>  
    <ul>
        {articleList.map((article) => (
            <li key={article.id}>{article.subject}</li>
        ))}
    </ul>
</>
    )

}
export default ArticleList