package org.xtext.builddsl.lib;

import com.google.common.io.Files;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FileExtensions {
  private static void collectFiles(final File root, final List<File> result) {
    File[] _listFiles = root.listFiles();
    for (final File it : _listFiles) {
      boolean _isFile = it.isFile();
      if (_isFile) {
        result.add(it);
      } else {
        boolean _isDirectory = it.isDirectory();
        if (_isDirectory) {
          FileExtensions.collectFiles(it, result);
        }
      }
    }
  }
  
  public static ArrayList<File> listAllFiles(final File file) {
    final ArrayList<File> files = CollectionLiterals.<File>newArrayList();
    FileExtensions.collectFiles(file, files);
    return files;
  }
  
  public static void zip(final File directory, final File zipFile) {
    try {
      final ArrayList<File> files = FileExtensions.listAllFiles(directory);
      FileOutputStream _fileOutputStream = new FileOutputStream(zipFile);
      BufferedOutputStream _bufferedOutputStream = new BufferedOutputStream(_fileOutputStream);
      JarOutputStream _jarOutputStream = new JarOutputStream(_bufferedOutputStream);
      final JarOutputStream out = _jarOutputStream;
      try {
        out.setMethod(JarOutputStream.DEFLATED);
        final Procedure1<File> _function = new Procedure1<File>() {
            public void apply(final File file) {
              try {
                File _relativeTo = FileExtensions.relativeTo(file, directory);
                String _path = _relativeTo.getPath();
                ZipEntry _zipEntry = new ZipEntry(_path);
                final ZipEntry entry = _zipEntry;
                out.putNextEntry(entry);
                Files.copy(file, out);
                out.closeEntry();
              } catch (Exception _e) {
                throw Exceptions.sneakyThrow(_e);
              }
            }
          };
        IterableExtensions.<File>forEach(files, _function);
        out.flush();
      } finally {
        out.close();
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static File operator_divide(final File file, final String name) {
    boolean _isDirectory = file.isDirectory();
    boolean _not = (!_isDirectory);
    if (_not) {
      String _plus = ("This is not a directory: " + file);
      IllegalStateException _illegalStateException = new IllegalStateException(_plus);
      throw _illegalStateException;
    }
    URI _uRI = file.toURI();
    URI _resolve = _uRI.resolve(name);
    File _file = new File(_resolve);
    return _file;
  }
  
  public static File relativeTo(final File target, final File base) {
    File _absoluteFile = base.getAbsoluteFile();
    URI _uRI = _absoluteFile.toURI();
    URI _uRI_1 = target.toURI();
    URI _relativize = _uRI.relativize(_uRI_1);
    String _string = _relativize.toString();
    File _file = new File(_string);
    return _file;
  }
}
