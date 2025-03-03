package com.example.winterseminar.controller;

import com.example.winterseminar.domain.Post;
import com.example.winterseminar.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public String showPostsPage(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "posts";
    }

    @GetMapping("/{id}")
    public String showPostDetail(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id);
        if (post == null) {
            return "redirect:/posts";
        }
        model.addAttribute("post", post);
        return "postDetail";
    }

    @GetMapping("/create")
    public String showCreatePostPage() {
        return "create_post";
    }

    @PostMapping("/create")
    public String createPost(@RequestParam String title, @RequestParam String content) {
        postService.createPost(title, content);
        return "redirect:/posts";
    }
}
