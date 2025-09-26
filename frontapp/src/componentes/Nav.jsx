import { Link } from 'react-router-dom'

function Nav() {
    return (
        <ul>
            <li>
                {/* Link태그는 클릭시 페이지가 넘어감 */}
                <Link to="/">홈</Link>
                {/* a태그는 클릭시 새로고침이 됨 */}
                {/* <a href="/">홈a</a> */}
            </li>
            <li>
                <Link to="/auth/login">로그인</Link>
            </li>
            <li>
                <Link to="/article/list">게시글 목록</Link>
            </li>
        </ul>
    )
}

export default Nav