package xyz.mzc6838.qrscanner.baseClass;

import java.util.List;

public class ResponseFromServer {

//    public class ImgInfo{
//        public Long out_id;
//        public String image_url;
//
//        public Long getOut_id() {
//            return out_id;
//        }
//
//        public void setOut_id(Long out_id) {
//            this.out_id = out_id;
//        }
//
//        public String getImage_url() {
//            return image_url;
//        }
//
//        public void setImage_url(String image_url) {
//            this.image_url = image_url;
//        }
//    }

    public class Data{
        public List<ImgInfo> list;
        public int more;

        public List<ImgInfo> getList() {
            return list;
        }

        public void setList(List<ImgInfo> list) {
            this.list = list;
        }

        public int getMore() {
            return more;
        }

        public void setMore(int more) {
            this.more = more;
        }
    }


    public int status;
    public Data data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}