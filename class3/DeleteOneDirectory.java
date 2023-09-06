package class3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class DeleteOneDirectory {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:\\Users\\RR495GT\\OneDrive - EY\\Desktop\\file2");
		Files.delete(p);
		System.out.println("One Directory got deleted");
		
		Path p2 = Paths.get("C:\\Users\\RR495GT\\OneDrive - EY\\Desktop\\file2");
		BasicFileAttributeView view= Files.getFileAttributeView(p, BasicFileAttributeView.class);
		BasicFileAttributes attr = view.readAttributes();
		
		FileTime creatinTime = attr.creationTime();
		System.out.println("Creation Time of my file was"+ creatinTime);
		
		FileTime lastAccessedTime = attr.lastAccessTime();
		System.out.println("Last Accessed Time of my file was"+ lastAccessedTime);
		
		FileTime modifiedTime = attr.lastModifiedTime();
		System.out.println("Modified Time of my file was"+ modifiedTime);

	}

}
