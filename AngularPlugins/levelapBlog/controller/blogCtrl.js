/*!
 * blogCtrl.js - v0.1
 * http://www.levelapsoftware.com
 * License: MIT
 * Requirements:
 * - RESTful Web Services
 * - openRest factory
 */
angular.module('LevelapBlog').controller('BlogCtrl', function($scope, $rootScope, $state, importantBlogs, categories, tags, blogsPreview, openRest) {
    importantBlogs.$promise.then(function(data) {
        $scope.importantBlogs = data.content;
        $scope.importantBlogs.forEach(function(preview) {
            preview.crop = {
                width: '238px',
                transform: 'translate(-98px,-10px)'
            };
        });
    });
    categories.$promise.then(function(data) {
        $scope.categories = data;
    });
    tags.$promise.then(function(data) {
        $scope.tags = data;
    });
    blogsPreview.$promise.then(function(data) {
        setPageMostSeen(data);
    });
    $scope.searchArticles = function() {
        $state.go('levelapBlog.blog.search', {text: $scope.search.value});
    };
    $scope.$watch('currentPageMostSeen', function(newValue, oldValue) {
        if(newValue != null && newValue != oldValue) {
            openRest("levelapBlog/findArticles").post({isMostSeen: true, page: newValue}, function(data) {
                setPageMostSeen(data);
            });
        }
    });
    function setPageMostSeen(data) {
        $scope.blogsPreview = data.content;
        $scope.blogsPreview.forEach(function(preview) {
            preview.crop = {
                width: '330px',
                transform: 'translate(-80px,0)'
            };
        });
        $scope.totalPagesMostSeen = data.totalPages;
    }
    if ($state.current.name == 'levelapBlog.blog') {
        $state.go('levelapBlog.blog.home');
    }
});
