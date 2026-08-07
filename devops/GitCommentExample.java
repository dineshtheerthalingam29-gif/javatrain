import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import java.io.File;
import java.io.IOException;

public class GitCommentExample {

    public static void main(String[] args) {

        try {
            // Path to your local Git repository folder
            File repoDir = new File("path/to/your/repo");

            // Open existing repository
            Git git = Git.open(repoDir);

            // Add all changed files to the index (staging)
            git.add().addFilepattern(".").call();

            // Commit with a comment/message
            git.commit()
                    .setMessage("Initial commit with JGit example comment")
                    .call();

            System.out.println("Commit done successfully!");

            // Optional: print last commit details
            System.out.println("Latest Commit Message: " +
                    git.log().setMaxCount(1).call().iterator().next().getFullMessage());

        } catch (IOException | GitAPIException e) {
            e.printStackTrace();
        }
    }
}