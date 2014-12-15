<!DOCTYPE html>
<html lang="zh-CN">
	<head>
	<title>Lazy Party</title>
	<%@ page contentType="text/html;charset=UTF-8" language="java"%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="a party for laziers">
    <meta name="author" content="lazy party">
    <link href="../globle/css/bootstrap.css" rel="stylesheet">
    <link href="../globle/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="../globle/css/holder.css" rel="stylesheet">
    <link href="css/article.css" rel="stylesheet">
	   
        <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/apple-touch-icon-114-precomposed.png">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/apple-touch-icon-72-precomposed.png">
                    <link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-57-precomposed.png">
                                   <link rel="shortcut icon" href="img/favicon.png">
    <%@ taglib prefix="s" uri="/struts-tags"%>
    </head>
  <body>
  	<div class="navbar-wrapper">
		<!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
		<div class="container">
	<%@ include file="../globle/head.jsp"%>
	
<div class="row">
    <div class="span9" id="articleListWrap">
    <s:iterator value="articles" var="article">
        <div>
            <h3>
                <a href="http://www.yqhome.net/zh-cn/archive/1">Yqblog1.3发布</a>
            </h3>
            <p class="article_list_meta">
                <a href="http://www.yqhome.net/zh-cn/author/admin               " class="text-inline"><s:property value="author"/></a>
                发表于 <p class="text-info text-inline"  >2013-10-31</p>
                    <span class="ui-icon ui-icon-folder-collapsed"></span> 
				Yqblog
                    <span class="ui-icon ui-icon-comment"></span>
                    <a class="grayUnderlineA" > 22 条评论</a>
            <p><a href="http://www.yqhome.net/zh-cn/archive/1" class="btn">查看详情 »</a></p>
        </div>
        <hr class="site-separator">
        </s:iterator>
        <hr class="site-separator">
<div class="pagination pull-left"></div>
<script type="text/javascript">
        $(function () {
            $(".pagination").pager({ pagenumber: 1, pagecount: 0, buttonClickCallback: ArticlePageClick });
        });
</script>    </div>

    <div class="span3 sidebar">
        <div class="rss_info">
            <span class="ui-icon ui-icon-signal-diag"></span>
            <a href="/zh-cn/commentrss" class="rss_comment grayUnderlineA" target="_blank">评论</a> 
            <a href="/zh-cn/rss" class="rss_article grayUnderlineA" target="_blank">文章</a>
        </div>
        
        <div class="input-append search">
            <input class="span2" id="searchKey" type="text" autocomplete="off">
            <button class="btn btn-inverse" type="button" id="searchBtn">搜索</button>
        </div>

        <div id="datepicker" class="hasDatepicker">
        <div class="ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all" style="display: block;"><div class="ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all"><a class="ui-datepicker-prev ui-corner-all" data-handler="prev" data-event="click" title="<上月"><span class="ui-icon ui-icon-circle-triangle-w">&lt;上月</span></a><a class="ui-datepicker-next ui-corner-all" data-handler="next" data-event="click" title="下月>"><span class="ui-icon ui-icon-circle-triangle-e">下月&gt;</span></a><div class="ui-datepicker-title"><span class="ui-datepicker-year">2014</span>年&nbsp;<span class="ui-datepicker-month">十二月</span></div></div><table class="ui-datepicker-calendar"><thead><tr><th><span title="星期一">一</span></th><th><span title="星期二">二</span></th><th><span title="星期三">三</span></th><th><span title="星期四">四</span></th><th><span title="星期五">五</span></th><th class="ui-datepicker-week-end"><span title="星期六">六</span></th><th class="ui-datepicker-week-end"><span title="星期日">日</span></th></tr></thead><tbody><tr><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">1</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">2</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">3</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">4</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">5</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">6</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">7</a></td></tr><tr><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">8</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">9</a></td><td class=" ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today" data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default ui-state-highlight ui-state-active" href="#">10</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">11</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">12</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">13</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">14</a></td></tr><tr><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">15</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">16</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">17</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">18</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">19</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">20</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">21</a></td></tr><tr><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">22</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">23</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">24</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">25</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">26</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">27</a></td><td class=" ui-datepicker-week-end " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">28</a></td></tr><tr><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">29</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">30</a></td><td class=" " data-handler="selectDay" data-event="click" data-month="11" data-year="2014"><a class="ui-state-default" href="#">31</a></td><td class=" ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled">&nbsp;</td><td class=" ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled">&nbsp;</td><td class=" ui-datepicker-week-end ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled">&nbsp;</td><td class=" ui-datepicker-week-end ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled">&nbsp;</td></tr></tbody></table></div></div>

        <div>
            <h3>归档</h3>
            <ul>
                    <li><a href="http://www.yqhome.net/zh-cn/archives/2013/12/">2013年12月 (1)</a></li>
                    <li><a href="http://www.yqhome.net/zh-cn/archives/2013/11/">2013年11月 (6)</a></li>
                    <li><a href="http://www.yqhome.net/zh-cn/archives/2013/10/">2013年10月 (3)</a></li>
            </ul>   
        </div>

        <div>
            <h3>浏览最多</h3>
            <ul>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">Yqblog1.3发布(1648)</a></li>
                    <li><a title="如何新增新的皮肤(样式模板)" href="http://www.yqhome.net/zh-cn/archive/183">如何新增新的皮肤(样式模板)(618)</a></li>
                    <li><a title="Bootstrap以及Jquery UI 提供的小图标" href="http://www.yqhome.net/zh-cn/archive/182">Bootstrap以及Jquery UI 提供的小图标(560)</a></li>
                    <li><a title="Yqblog1.3beta Bug报告" href="http://www.yqhome.net/zh-cn/archive/3">Yqblog1.3beta Bug报告(491)</a></li>
                    <li><a title="Git Pull,Push时报错 disconnected no supported authentication methods available" href="http://www.yqhome.net/zh-cn/archive/181">Git Pull,Push时报错 disconnected no supported authentication methods available(464)</a></li>
                    <li><a title="Visual Studio 常用快捷键总结" href="http://www.yqhome.net/zh-cn/archive/200">Visual Studio 常用快捷键总结(464)</a></li>
                    <li><a title="ERROR: The version of SQL Server in use does not support datatype “datetime2”" href="http://www.yqhome.net/zh-cn/archive/2">ERROR: The version of SQL Server in use does not support datatype “datetime2”(381)</a></li>
                    <li><a title="IE8不支持header,footer等html5标签" href="http://www.yqhome.net/zh-cn/archive/27">IE8不支持header,footer等html5标签(275)</a></li>
                    <li><a title="后缀ttf woff eot字体文件在VS下发布不成功 " href="http://www.yqhome.net/zh-cn/archive/28">后缀ttf woff eot字体文件在VS下发布不成功 (241)</a></li>
                    <li><a title="firefox下flash按钮不可用" href="http://www.yqhome.net/zh-cn/archive/25">firefox下flash按钮不可用(183)</a></li>
            </ul>   
        </div>

        <div>
            <h3>评论最多</h3>
            <ul>
                    <li><a title="Yqblog1.3beta Bug报告" href="http://www.yqhome.net/zh-cn/archive/3">Yqblog1.3beta Bug报告(25)</a></li>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">Yqblog1.3发布(22)</a></li>
                    <li><a title="Visual Studio 常用快捷键总结" href="http://www.yqhome.net/zh-cn/archive/200">Visual Studio 常用快捷键总结(4)</a></li>
                    <li><a title="如何新增新的皮肤(样式模板)" href="http://www.yqhome.net/zh-cn/archive/183">如何新增新的皮肤(样式模板)(3)</a></li>
                    <li><a title="IE8不支持header,footer等html5标签" href="http://www.yqhome.net/zh-cn/archive/27">IE8不支持header,footer等html5标签(3)</a></li>
                    <li><a title="后缀ttf woff eot字体文件在VS下发布不成功 " href="http://www.yqhome.net/zh-cn/archive/28">后缀ttf woff eot字体文件在VS下发布不成功 (3)</a></li>
                    <li><a title="Bootstrap以及Jquery UI 提供的小图标" href="http://www.yqhome.net/zh-cn/archive/182">Bootstrap以及Jquery UI 提供的小图标(1)</a></li>
                    <li><a title="firefox下flash按钮不可用" href="http://www.yqhome.net/zh-cn/archive/25">firefox下flash按钮不可用(1)</a></li>
            </ul>   
        </div>

        <div class="article_latest_replies">
            <h3>最新评论</h3>
            <ul>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">re:Yqblog1.3发布</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/1?f=22"><span class="ui-icon ui-icon-document"></span></a>&lt;script&gt;alert('test');&lt;/script&gt;a</div>
                        <div class="muted">
                            &lt;script&gt;alert('test' 发表于 2013-10-31 13:37
                        </div>
                    </li>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">re:Yqblog1.3发布</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/1?f=21"><span class="ui-icon ui-icon-document"></span></a>a's'd'f啊水电费</div>
                        <div class="muted">
                            a's'd'f              发表于 2013-10-31 13:37
                        </div>
                    </li>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">re:Yqblog1.3发布</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/1?f=20"><span class="ui-icon ui-icon-document"></span></a>rwerwer</div>
                        <div class="muted">
                            34                   发表于 2013-10-31 13:37
                        </div>
                    </li>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">re:Yqblog1.3发布</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/1?f=19"><span class="ui-icon ui-icon-document"></span></a>法国恢复供货</div>
                        <div class="muted">
                            个体用户                 发表于 2013-10-31 13:37
                        </div>
                    </li>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">re:Yqblog1.3发布</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/1?f=18"><span class="ui-icon ui-icon-document"></span></a>dasasa</div>
                        <div class="muted">
                            aaaaa                发表于 2013-10-31 13:37
                        </div>
                    </li>
                    <li><a title="Visual Studio 常用快捷键总结" href="http://www.yqhome.net/zh-cn/archive/200">re:Visual Studio 常用快捷键总结</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/200?f=4"><span class="ui-icon ui-icon-document"></span></a>sdf</div>
                        <div class="muted">
                            sdf                  发表于 2013-12-11 14:43
                        </div>
                    </li>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">re:Yqblog1.3发布</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/1?f=17"><span class="ui-icon ui-icon-document"></span></a>博主,你源码注释都没有?请问有没有说明文档?</div>
                        <div class="muted">
                            eeterter             发表于 2013-10-31 13:37
                        </div>
                    </li>
                    <li><a title="Yqblog1.3发布" href="http://www.yqhome.net/zh-cn/archive/1">re:Yqblog1.3发布</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/1?f=16"><span class="ui-icon ui-icon-document"></span></a>下了源码，没有数据库数据啊，，，，，</div>
                        <div class="muted">
                            test123456           发表于 2013-10-31 13:37
                        </div>
                    </li>
                    <li><a title="Visual Studio 常用快捷键总结" href="http://www.yqhome.net/zh-cn/archive/200">re:Visual Studio 常用快捷键总结</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/200?f=3"><span class="ui-icon ui-icon-document"></span></a>fewefeww</div>
                        <div class="muted">
                            reer                 发表于 2013-12-11 14:43
                        </div>
                    </li>
                    <li><a title="Visual Studio 常用快捷键总结" href="http://www.yqhome.net/zh-cn/archive/200">re:Visual Studio 常用快捷键总结</a>
                        <div><a href="http://www.yqhome.net/zh-cn/archive/200?f=2"><span class="ui-icon ui-icon-document"></span></a>retttwe</div>
                        <div class="muted">
                            t34                  发表于 2013-12-11 14:43
                        </div>
                    </li>
            </ul>   
        </div>

        <div>
            <h3>标签</h3>
            <div class="tags"> 
                    <a class="grayBoxA" href="http://www.yqhome.net/zh-cn/tag/jquery%20ui">jquery ui</a>
                    <a class="grayBoxA" href="http://www.yqhome.net/zh-cn/tag/Yqblog">Yqblog</a>
                    <a class="grayBoxA" href="http://www.yqhome.net/zh-cn/tag/Bootstrap">Bootstrap</a>
            </div>   
        </div> 

        <div>
            <h3>统计</h3>
            <div>
                文章: 10
                <br>
                相册: 4
                <br>
                留言: 14
                <br>
                文章评论: 62
                <br>
                相册评论: 2
            </div>   
        </div>

    </div>
</div>
</div>

        </div>
    <script src="../globle/js/jquery.js"></script>
    <script src="../globle/js/bootstrap.js"></script>
    <script src="../globle/js/ui/jquery.ui.core.js"></script>
	<script src="../globle/js/ui/jquery.ui.widget.js"></script>
	<script src="../globle/js/ui/jquery.ui.mouse.js"></script>
	<script src="../globle/js/ui/jquery.ui.button.js"></script>
	<script src="../globle/js/ui/jquery.ui.draggable.js"></script>
	<script src="../globle/js/ui/jquery.ui.position.js"></script>
	<script src="../globle/js/ui/jquery.ui.resizable.js"></script>
	<script src="../globle/js/ui/jquery.ui.button.js"></script>
	<script src="../globle/js/ui/jquery.ui.dialog.js"></script>
	<script src="../globle/js/ui/jquery.ui.effect.js"></script>
    <script src="js/index.js"></script>
</body>
</html>
