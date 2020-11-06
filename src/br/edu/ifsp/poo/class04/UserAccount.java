package br.edu.ifsp.poo.class04;

public class UserAccount {
    private String email;
    private String username;

    private Post[] timeline = new Post[10];
    private Post[] myPosts = new Post[1000];
    private UserAccount[] followers = new UserAccount[1000];

    private int countMyPosts, countTimeline, countFollowers;

    public UserAccount(String email, String username) {
        this.email = email;
        this.username = username;
    }

    public void publish(String quote) {
        if (quote != null && !quote.isEmpty()) {
            Post newPost = publishAndPutInMyPosts(quote);
            requestFollowersToUpdateTimeline(newPost);
        }
    }

    private Post publishAndPutInMyPosts(String quote) {
        Post newPost = new Post(quote, this);
        myPosts[countMyPosts] = newPost;
        countMyPosts++;
        return newPost;
    }

    private void requestFollowersToUpdateTimeline(Post newPost) {
        for (int i = 0; i < countFollowers; i++) {
            UserAccount follower = followers[i];
            follower.updateTimeline(newPost);
        }
    }

    public void updateTimeline(Post newPost) {
        /*timeline[countTimeline % 10] = newPost;
        countTimeline ++;*/

        /*if (countTimeline >= 10)
            countTimeline = 0;
        timeline[countTimeline] = newPost;
        countTimeline++;*/

        if(countTimeline < timeline.length){
            timeline[countTimeline] = newPost;
            countTimeline++;
        }else{
            for(int i = 0; i <  timeline.length - 1; i ++){
                timeline[i] = timeline[i+1];
            }
            timeline[timeline.length - 1] = newPost;
        }
    }

        public boolean deletePost ( int postIndex){
            if (postIndex >= 0 && postIndex < countMyPosts) {
                myPosts[postIndex] = null;
                return true;
            }
            return false;
        }

        public String showTimeline () {
            StringBuilder sb = new StringBuilder();
            for (Post post : timeline) {
                if (post != null) {
                    String postContent = post.show();
                    sb.append("\n");
                    sb.append(postContent);
                }
            }
            return sb.toString();
        }

        public String showMyPosts () {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < countMyPosts; i++) {
                Post post = myPosts[i];
                if (post != null) {
                    String postContent = post.show();
                    sb.append(postContent);
                }
            }
            return sb.toString();
        }

        public String showMyFollowers () {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < countFollowers; i++) {
                UserAccount follower = followers[i];
                if (follower != null) {
                    sb.append("Username: " + follower.getUsername() + " Email: " + follower.getEmail());
                }
            }
            return sb.toString();
        }

        public void clapPost ( int postIndex){
            if (postIndex >= 0 && postIndex < 10) {
                Post post = timeline[postIndex];
                post.clap();
            }
        }

        public void booPost ( int postIndex){
            if (postIndex >= 0 && postIndex < 10) {
                Post post = timeline[postIndex];
                post.boo();
            }
        }

        public void acceptFollower (UserAccount newFollower){
            followers[countFollowers] = newFollower;
            countFollowers++;
        }

        public void blockFollower (UserAccount follower){
            for (int i = 0; i < countFollowers; i++) {
                UserAccount f = followers[i];
                if (f != null && f.equals(follower)) {
                    followers[i] = null;
                }
            }
        }

        public void setUsername (String username){
            this.username = username;
        }

        public String getEmail () {
            return email;
        }

        public String getUsername () {
            return username;
        }
    }
