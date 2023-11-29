package abp.abpfollow.service;

import abp.abpfollow.model.Peak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PeakService {
   public ResponseEntity getPeaks() {
       ArrayList<Peak> peaks = new ArrayList<>();

       ArrayList<String> other = new ArrayList<>();
       other.add("Monte Perdido");
         other.add("Pico Posets");

       peaks.add(new Peak("Aneto", 3404, "Pirineos", "Huesca", other));
   return ResponseEntity.ok(peaks); // 200
   }
}
