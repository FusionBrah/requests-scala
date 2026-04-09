package requests

import java.net.http.HttpClient

object PlatformCompat {
  def closeHttpClient(httpClient: HttpClient): Unit = {
    httpClient.close()
  }
}
