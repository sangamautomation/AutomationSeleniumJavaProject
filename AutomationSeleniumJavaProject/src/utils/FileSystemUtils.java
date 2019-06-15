package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Description : File & Folder Utility Functions
 * 
 * @author Sangam
 */
public class FileSystemUtils {

	// Create Directory, if does not exists.

	public static void createFolder(String folderPath) {
		try {
			File theDir = new File(folderPath);
			if (!theDir.exists()) {
				theDir.mkdirs();
				System.out.println("Folder created @ " + folderPath);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Create a file

	public static void createFile(String folderPath, String fileName, String extension) {
		try {
			File myFile = new File(folderPath + fileName + extension);
			if (myFile.createNewFile()) {
				System.out.println("createFile -Success!" + folderPath + fileName + extension);
			} else {
				System.out.println("createFile -Failure!" + folderPath + fileName + extension);
			}
		} catch (IOException ioe) {
			System.out.println("createFile -Failure!" + folderPath + fileName + extension);

			ioe.printStackTrace();
		}
	}

	// Create new file and write to it

	public static void createFileWithContent(String folderPath, String fileName, String extension) {
		try {
			String content = "This is the content to write into create file";
			// String path="D:\\a\\hi.txt";
			String path = folderPath + fileName + extension;

			File file = new File(path);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			// write in file
			bw.write(content);
			// close connection
			bw.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// Delete files with extensions
	public static void deleteFilesWithExtension(String directory, String extensionWithDot) {
		try {
			File folder = new File(directory);
			File fList[] = folder.listFiles();

			for (File f : fList) {
				if (f.getName().endsWith(extensionWithDot)) {
					f.delete();
				}
			}
			System.out.println("All files in " + directory + " with extension " + extensionWithDot + " got deleted!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Delete files with matchingFileName
	public static void deleteFilesContains(String directory, String matchingFileName) {
		try {
			File folder = new File(directory);
			File fList[] = folder.listFiles();

			for (File f : fList) {
				if (f.getName().contains(matchingFileName)) {
					f.delete();
				}
			}
			System.out.println("All files in " + directory + " containing text " + matchingFileName + " got deleted!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Delete files with matchingFileName
	public static void deleteFilesMatching(String directory, String matchingFileName) {
		try {
			File folder = new File(directory);
			File fList[] = folder.listFiles();

			for (File f : fList) {
				if (f.getName().matches(matchingFileName)) {
					f.delete();
				}
			}
			System.out.println("All files in " + directory + " matching file name " + matchingFileName + " got deleted!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Delete All Files in a folder
	public static void deleteFiles(File folder) {
		try {
			File[] files = folder.listFiles();
			for (File file : files) {
				if (file.isFile()) {
					String fileName = file.getName();
					boolean del = file.delete();
					System.out.println(fileName + " : got deleted ? " + del);
				} else if (file.isDirectory()) {
					deleteFiles(file);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Raname file
	public static void renameFile(String oldNameWithPath, String newNameWithPath) {

		try {
			Files.move(Paths.get(oldNameWithPath), Paths.get(newNameWithPath));
			System.out.println("File renamed as -" + newNameWithPath);
		} catch (Exception e) {
			FileSystemUtils.file_Rename(oldNameWithPath, newNameWithPath);
			// System.out.println("File NOT renamed as -"+newNameWithPath);
			e.printStackTrace();
		}
	}

	/**
	 * file_Rename (using java.io instead of java.nio which is causing excp in
	 * old JRE)
	 */
	public static void file_Rename(String oldFileFullPath, String newFileFullPath) {
		File oldName = new File(oldFileFullPath); // "D:/program.txt"
		File newName = new File(newFileFullPath); // "D:/java.txt"
		// oldName.renameTo(newName); // need not call as below if will rename
		if (oldName.renameTo(newName)) {
			System.out.println("Rename succesful");
		} else {
			System.out.println("Rename failed");
		}

	}

	// Move file
	public static void moveFile(String sourcePath, String destinationPath) {

		try {
			Files.move(Paths.get(sourcePath), Paths.get(destinationPath));
			System.out.println("File moved to -" + destinationPath);
		} catch (Exception e) {
			System.out.println("File NOT moved to -" + destinationPath);
			e.printStackTrace();
		}
	}

	// Delete All Files in a folder

	public static void deleteFiles(String folder) {
		try {
			File folderx = new File(folder);
			File[] files = folderx.listFiles();
			for (File file : files) {
				if (file.isFile()) {
					String fileName = file.getName();
					boolean del = file.delete();
					System.out.println(fileName + " : got deleted ? " + del);
				} else if (file.isDirectory()) {
					deleteFiles(file);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("xxx Deleting Folder Completed xxx");
		}
	}
}
