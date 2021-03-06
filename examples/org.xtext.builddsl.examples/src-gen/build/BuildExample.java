package build;

import java.io.File;
import java.util.Collection;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.builddsl.lib.BuildScript;
import org.xtext.builddsl.lib.ClassExtensions;
import org.xtext.builddsl.lib.DependsOn;
import org.xtext.builddsl.lib.DirectoryCleaner;
import org.xtext.builddsl.lib.FileExtensions;
import org.xtext.builddsl.lib.JavaCompiler;
import org.xtext.builddsl.lib.JavaCompilerParams;
import org.xtext.builddsl.lib.Param;

@SuppressWarnings("all")
public class BuildExample extends BuildScript {
  @Param
  public File project = new Function0<File>() {
    public File apply() {
      File _file = FileExtensions.file("example-project");
      return _file;
    }
  }.apply();
  
  @Param
  public File source = new Function0<File>() {
    public File apply() {
      File _divide = FileExtensions.operator_divide(BuildExample.this.project, "src");
      return _divide;
    }
  }.apply();
  
  @Param
  public File target = new Function0<File>() {
    public File apply() {
      File _divide = FileExtensions.operator_divide(BuildExample.this.project, "target");
      return _divide;
    }
  }.apply();
  
  @Param
  public File jar = new Function0<File>() {
    public File apply() {
      File _divide = FileExtensions.operator_divide(BuildExample.this.project, "result");
      File _divide_1 = FileExtensions.operator_divide(_divide, "foo.jar");
      return _divide_1;
    }
  }.apply();
  
  public static void main(final String... args) {
    BuildExample script = new BuildExample();
    if (script.showHelp(args)) {
    	System.exit(HELP);
    }
    System.exit(script.doBuild(args));
    
  }
  
  @DependsOn("Compile")
  protected void Jar() {
    FileExtensions.zip(this.target, this.jar);
  }
  
  @DependsOn("Clean")
  protected void Compile() {
    final Procedure1<JavaCompilerParams> _function = new Procedure1<JavaCompilerParams>() {
      public void apply(final JavaCompilerParams it) {
        Collection<File> _sources = it.getSources();
        _sources.add(BuildExample.this.source);
        it.setDestination(BuildExample.this.target);
      }
    };
    JavaCompiler.javac(_function);
  }
  
  @DependsOn("Jar")
  protected void Run() {
    try {
      final ClassLoader classpath = JavaCompiler.newClasspath(this.jar);
      final Class<? extends Object> clazz = classpath.loadClass("helloworld.HelloWorld");
      ClassExtensions.runMain(clazz);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @DependsOn()
  protected void Clean() {
    DirectoryCleaner.deleteDirectoryContents(this.target);
    this.jar.delete();
  }
}
