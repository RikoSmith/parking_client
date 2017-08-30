$(document).ready(function(){


    var fade_out = function() {
      $(".alert").fadeOut().empty();
    };

    setTimeout(fade_out, 7000);

    $(".b_tab_main").click( function() {
            $(".a_tabs").addClass("hidden");
            $("#tab_main").removeClass("hidden");
    });
    
    $(".b_tab_lots").click( function() {
            $(".a_tabs").addClass("hidden");
            $("#tab_lots").removeClass("hidden");
    });
    
    $(".b_tab_requests").click( function() {
            $(".a_tabs").addClass("hidden");
            $("#tab_requests").removeClass("hidden");
    });
    
    $(".b_tab_users").click( function() {
            $(".a_tabs").addClass("hidden");
            $("#tab_users").removeClass("hidden");
    });
    
    $(".b_tab_cars").click( function() {
            $(".a_tabs").addClass("hidden");
            $("#tab_cars").removeClass("hidden");
    });
    
    $(".b_tab_other").click( function() {
            $(".a_tabs").addClass("hidden");
            $("#tab_other").removeClass("hidden");
    });
    
});