/** 
 *  Copyright (c) 2015 The original author or authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.reveno.atp.test.utils;

import java.io.File;
import java.io.IOException;

public abstract class FileUtils {

	public static void delete(File f) throws IOException {
		clearFolder(f);
		f.delete();
	}

	public static void clearFolder(File f) throws IOException {
		if (f.isDirectory()) {
			for (File c : f.listFiles())
				delete(c);
		}
	}

	public static File findFile(String folder, String start) throws IOException {
		File dir = new File(folder);
		File[] files = dir.listFiles((f,n) -> n.startsWith(start));
		if (files.length == 0) {
			return null;
		} else {
			return files[0];
		}
	}

}
