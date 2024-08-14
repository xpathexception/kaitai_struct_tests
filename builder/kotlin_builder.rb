require 'fileutils'
require 'set'

require_relative 'partial_builder'
require_relative 'shellconfig'

class KotlinBuilder < PartialBuilder
  def initialize
    super

    @spec_dir     = File.join('spec', 'kotlin', 'src', 'commonMain','kotlin')
    @compiled_dir = File.join("#{@config['FORMATS_COMPILED_DIR']}", 'kotlin')
    @project_file = File.join("#{@compiled_dir}", 'src_list.txt')

    @kotlin_runtime_dir = @config['KOTLIN_RUNTIME_DIR'] or raise "KOTLIN_RUNTIME_DIR is undefined"
    @kotlin_runtime_dir = File.absolute_path(@kotlin_runtime_dir)

    # @java_classes_dir = "#{@compiled_dir}/bin"
    # @java_classes_dir = File.absolute_path(@java_classes_dir)
    # @java_classpath   = [@java_classes_dir, @java_testng_jar].join(File::PATH_SEPARATOR)

    @test_out_dir = "#{@config['TEST_OUT_DIR']}/kotlin"
    @test_out_dir = File.absolute_path(@test_out_dir)
  end

  def list_mandatory_files
    Dir.glob(File.join("#{@kotlin_runtime_dir}", 'kotlin', 'src', 'commonMain', '**/*.kt'))
  end

  def list_disposable_files
    Dir.glob(File.join("#{@spec_dir}", '**/*.kt')) +
    Dir.glob(File.join("#{@compiled_dir}", 'src', '**/*.kt'))
  end

  def create_project(mand_files, disp_files)
    File.open(@project_file, 'w') { |f|
      (mand_files + disp_files).each { |l| f.puts "\"#{l}\"" }
    }
    @project_file
  end

  def build_project(log_file)
    project_directory = 'spec/kotlin'

    # Build command for gradle using the gradlew wrapper
    cmd = %w[./gradlew build]

    # Change to the project directory where the gradlew is located
    Dir.chdir(project_directory) do
      # Execute the Gradle build command and return the process exit status
      run_and_tee({}, cmd, log_file).exitstatus
    end
  end

  def parse_failed_build(log_file)
    list = Set.new

    File.open(log_file, 'r') { |f|
      f.each_line { |l|
        l.chomp!
        if l =~ /^*(.+?\.kt):(\d+): error: (.*?)$/
          filename = $1.gsub('\\', '/')
          #row = $2
          #msg = $3
          list << filename
        end
      }
    }

    list
  end

  def file_to_test(filename)
    # File.basename only forwards with forward slashes, so we normalize for that first
    fn = File.basename(filename.gsub(/\\/, '/'))
    if fn =~ /^Test(.*)\.kt$/
      return [:spec, $1]
    else
      return [:format, fn.gsub(/\.kt$/, '')]
    end
  end

  def run_tests
    orig_dir = Dir.pwd

    # Ensure the output directory for test results exists and is clean
    FileUtils.mkdir_p(@test_out_dir)
    FileUtils.rm_rf(File.join("#{@test_out_dir}", 'junitreports'))

    # Gradle command to run tests
    cmd = %w[./gradlew test]

    out_log = File.join(@test_out_dir, 'test_run.stdout')

    # Change to the project directory that contains the gradlew script
    Dir.chdir('spec/kotlin')

    # Run the tests using the Gradle wrapper
    run_and_tee({}, cmd, out_log)

    # Return to the original directory
    Dir.chdir(orig_dir)

    # Check if the test reports directory exists as a basic way to verify test run
    File.exist?(File.join(@test_out_dir, 'junitreports'))
  end
end
