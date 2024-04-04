    package com.assigment3.Assigment3;

    import com.assigment3.Assigment3.Model.User;

    public final class Server {
        private static Server instance;
        private static User user;

        private Server(int localhost, String username, String password, String database) {
            user = new User(localhost, username, password, database);
        }

        public static synchronized Server getInstance(int localhost, String username, String password, String database) {
            if (instance == null) {
                instance = new Server(localhost, username, password, database);
                System.out.println("First Object Localhost: " + user.getHostname());
            }
            System.out.println("Localhost: " + user.getHostname());
            return instance;
        }
        public static String getServerInfo() {
            return user.toString();
        }
    }
