angular.module('loginApp', [])
    .controller('LoginController', function() {
        var vm = this;

        vm.login = function() {
            // Simulate login process
            if (vm.username === 'admin' && vm.password === 'password') {
                alert('Login successful');
                // Redirect to dashboard or another page
            } else {
                vm.errorMessage = 'Invalid username or password';
            }
        };
    });
