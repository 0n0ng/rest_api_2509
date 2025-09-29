import { useState, useEffect } from "react"
import { useParams } from "react-router-dom"

function ArticleDetail( ) {
    const [article, setArticle] = useState({})
    const param = useParams()

    useEffect(() => {
            fetch(`http//localhost:8090/api/vq/articles/${param.id}`)
    // 받아졌을 때 .then
        .then((res) => res.json())
        .then((res) => {
            setArticle(res.data.article) 
        })
    }, [])

    return ( 
        <>  
    <h2>게시글 상세</h2>

           <div>
                <h4>{article.subject}</h4>
                <p>{artilce.content}</p>
                <p>{artilce.author}</p>
           </div>
</>
    )

}
export default Article