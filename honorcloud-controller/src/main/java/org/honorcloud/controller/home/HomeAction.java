package org.honorcloud.controller.home;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.io.FileNotFoundException;

import org.honorcloud.common.constant.PageConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sumoon
 * @since 2020-03-09
 */
@Api("主頁管理")
@Controller
@RequestMapping("/")
public class HomeAction {
	
	@Value("${customize.index}")
	private String customizeIndex;
	
	@ApiOperation("默认主页")
	@RequestMapping("/")
	public String index() {
		return PageConstant.INDEX;
	}
	@ApiOperation("根据msg信息跳转对应主页")
	@RequestMapping("index/{msg}")
	public String customizeIndex(@ApiParam @PathVariable(value = "msg")int msg) {
		if(StringUtils.isNotEmpty(customizeIndex)) {
			return customizeIndex;
		}
		String path = PageConstant.DEFAULT_INDEX;
		switch (msg) {
			case 1:
				path = PageConstant.CUSTOMIZE_INDEX;
				break;
				
			case 2:
				path = PageConstant.DARK_INDEX;
				break;
	
			default:
				path = PageConstant.INDEX;
				break;
		}
		return path;
	}

}

