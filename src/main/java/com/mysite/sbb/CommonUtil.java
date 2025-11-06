package com.mysite.sbb;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {

    public String markdown(String markdown) {
        Parser parser = Parser.builder().build();              // 마크다운 파서(Parser) 생성
        Node document = parser.parse(markdown);                // 입력된 문자열(markdown)을 파싱하여 Node 트리로 변환
        HtmlRenderer renderer = HtmlRenderer.builder().build();// HTML 렌더러 생성
        return renderer.render(document);                      // Node 트리를 HTML 문자열로 렌더링하여 반환
    }
}
