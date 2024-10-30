package film.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeControllers {
        @GetMapping("/Login")
        public String hello() {
            return "Home/Login";
        }
        @GetMapping("/Home")
        public String home() {
        return "Home/Home";
    }
        @GetMapping("/DetailVideo/{IDChapter}")
        public String DetailVideo() {
            return "Home/Detail";
        }
        @GetMapping("/Signup")
        public String Signup() {
            return "Home/Signup";
        }
        @GetMapping("/Home/UserInfor")
        public String UserInfor() {
            return "Home/UserInfor";
        }
        @GetMapping("/Home/UserChangePassword")
        public String UserChangePassword() {
        return "Home/ChangePassword";
    }
    public String layChuoiSauDauCham(String chuoi) {
        int viTriDauCham = chuoi.lastIndexOf('.');
        if (viTriDauCham >= 0 && viTriDauCham < chuoi.length() - 1) {
            return chuoi.substring(viTriDauCham + 1);
        }
        return "";
    }


}
