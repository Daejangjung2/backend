package backend.greatjourney.domain.community.controller.response;



import backend.greatjourney.domain.community.entity.Community_Comment;
import backend.greatjourney.domain.community.entity.Posting;
import backend.greatjourney.domain.login.domain.User;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public class PostResponseDTO {


    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public static class postDetail {
        //createdAt하고 comment등도 들어가게 되면 추가해서 코드를 확장해 나가면 됨
        private Long postId;
        private String image_url;
        private String title;
        private String contents;
        private String location;
        private List<Community_Comment> communityComment;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Long view;
        private String nickname;
        private String profile_image_url;

//        public static postDetail of(Posting post, User user){
//            return postDetail.builder()
//                    .postId(post.getPostId())
//                    .content(post.getContent())
//                    .userInfo(post.getUser())
//                    .comments(post.getComments() != null ? post.getComments() : null)
//                    .emotion(post.getEmotion() != null ? post.getEmotion() : null)
//                    .situation1(post.getSituation1())
//                    .situation2(post.getSituation2())
//                    .situation3(post.getSituation3())
//                    .music(post.getMusic() != null ? post.getMusic() : null)
//                    .likeCount(post.getPostLike() != null ? post.getPostLike().size() : null)
//                    .commentCount(post.getComments()!= null ? post.getComments().size() : null)
//                    .isLiked(post.getPostLike() != null ? post.getPostLike().contains(user) : false)
//                    .createdAt(post.getCreatedAt())
//                    .updatedAt(post.getUpdateAt())
//                    .build();
//        }
        //이게 객체로 만들어서 넘기는 함수이다.
        public static postDetail of(Posting post){
            return postDetail.builder()
                    .postId(post.getPostId())
                    .contents(post.getContents())
                    .image_url(post.getImage_url())
                    .location(post.getLocation())
                    .communityComment(post.getCommunityComments())
                    .createdAt(post.getCreatedAt())
                    .updatedAt(post.getUpdateAt())
                    .view(post.getView())
                    .title(post.getTitle())
                    .build();
        }

        public static postDetail ofDetail(Posting post,User user){
            return postDetail.builder()
                    .postId(post.getPostId())
                    .contents(post.getContents())
                    .image_url(post.getImage_url())
                    .location(post.getLocation())
                    .communityComment(post.getCommunityComments())
                    .createdAt(post.getCreatedAt())
                    .updatedAt(post.getUpdateAt())
                    .view(post.getView())
                    .title(post.getTitle())
                    .nickname(user.getNickname())
                    .profile_image_url(user.getProfileImageUrl())
                    .build();
        }
//        public static List<postDetail> of(Slice<Post> posts, User user){
//            return posts.stream().map(post ->postDetail.of(post,user)).collect(Collectors.toList());
//        }
//        public static List<postDetail> of(List<Post> posts, User user){
//            return posts.stream().map(post ->postDetail.of(post,user)).collect(Collectors.toList());
//        }
//        public static List<postDetail> from(Slice<Post> posts){
//            return posts.stream().map(post ->postDetail.of(post)).collect(Collectors.toList());
//        }
    }



}
