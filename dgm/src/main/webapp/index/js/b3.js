/* v1.1 */
$(document).on('mouseover', '.dropdown-submenu', function(){
	if($(window).width() >= 767){
		$(this).find('.dropdown-menu').fadeIn('fast').css('display', 'block');
	}
});

$(document).on('mouseleave', '.dropdown-submenu', function(){
	if($(window).width() >= 767){
		$(this).find('.dropdown-menu').fadeOut('fast').css('display', 'none');
	}
});

$(window).on('resize', function(){
	if($(window).width() < 767){
		$('.dropdown-submenu .dropdown-menu, .dropdown-submenu:hover .dropdown-menu').css({
			'display': 'block',
			'position': 'static',
			'padding': '5px 25px'
		});
		$('.navbar-form').css('margin', 'auto');
	}
});

/** Navigation bar active link **/
$(document).on('click','.navbar-default .navbar-nav>li>a', function(){
	$(this).closest('.navbar-default').find('.navbar-nav>li').each(function(){
		if($(this).hasClass('active')){		
			$(this).removeClass('active');
			$(this).children('a').css('background-color', 'transparent');
		}
	});
	$(this).parent().addClass('active');
	$(this).parent().each(function(){
		if($(this).hasClass('active')){
			$(this).children('a').css({
				'background-color': '#00B599'
			});
		}
	});
});

$(document).on('click','.navbar-inverse .navbar-nav>li>a', function(){
	$(this).closest('.navbar-inverse').find('.navbar-nav>li').each(function(){
		if($(this).hasClass('active')){		
			$(this).removeClass('active');
			
		}
	});
	$(this).parent().addClass('active');
	
});