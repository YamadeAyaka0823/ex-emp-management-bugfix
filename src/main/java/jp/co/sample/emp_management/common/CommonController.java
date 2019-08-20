package jp.co.sample.emp_management.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 共通コントローラ.
 * 
 * @author ayaka.yamade
 *
 */
@Controller
@RequestMapping("/common")
public class CommonController {
	/**
	 * エラー画面に遷移する.
	 * 
	 * @return 遷移先画面
	 */
	@RequestMapping("/maintenance")
	public String maintenance() {
		return "error/500";
	}

}
