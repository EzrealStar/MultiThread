package future.custom;

import future.custom.data.Data;
import future.custom.data.FutureData;
import future.custom.data.RealData;

public class Client {

	public Data request(String queryStr) {
		FutureData futureData = new FutureData();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				RealData realData = new RealData(queryStr);
				futureData.setRealData(realData);
			}
		}).start();
		return futureData;
	}
}
