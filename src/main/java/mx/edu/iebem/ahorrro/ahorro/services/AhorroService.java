package mx.edu.iebem.ahorrro.ahorro.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import mx.edu.iebem.ahorrro.ahorro.model.Ahorromodel;

@Service
public class AhorroService {
    @Autowired
    private JdbcTemplate jdbc;
    
    
    public void insertInfo(Ahorromodel ahorro) {
        final String sql = "insert into TRegistro_ahorro (rfc,curp,nombre_completo,correo_institucional,clave_presupuestal,centro_trabajo,telefono_local,telefono_cel) values (?,?,?,?,?,?,?,?);";
        
        
       
         this.jdbc.update(sql, 
        ahorro.getRfc(),
        ahorro.getCurp(),
        ahorro.getNombre_completo(),
        ahorro.getCorreo_institucional(),
        ahorro.getClave_presupuestal(),
        ahorro.getCentro_trabajo(),
        ahorro.getTelefono_local(),
        ahorro.getTelefono_cel() );
        
        
        
    }
    
    

    public void  GuardarPDFS (String rfcs,String curp, String nombre_completo,String correo_institucional,String clave_presupuestal, String centro_trabajo,String telefono_local,String telefono_cel, MultipartFile ine,MultipartFile comprobante,MultipartFile curps,MultipartFile nombramiento,MultipartFile afore,MultipartFile historia) throws IOException {
        // final String uploadsPath="c:\\ahorro";
        // File uploadsPath = new File("C:\\ahorro\\"+rfcs);
         File uploadsPath = new File("/opt/spring_boot_app/ahorro/"+rfcs);
         if(!uploadsPath.exists()){
        //  linux
        // File uploadsPath = new File("/opt/spring_boot_app/ahorro");
         uploadsPath.mkdir();
        //  String ine_path = ine.getOriginalFilename();
        //  String comprobante_path = comprobante.getOriginalFilename();
        //  String curps_path = curps.getOriginalFilename();
        //  String nombramiento_path = nombramiento.getOriginalFilename();
        //  String afore_path = afore.getOriginalFilename();
        //  String historia_path = historia.getOriginalFilename();
          
          Path ine_path = Paths.get(uploadsPath+"/"+ine.getOriginalFilename());
          Path comprobante_path = Paths.get(uploadsPath+"/"+comprobante.getOriginalFilename());
          Path curps_path = Paths.get(uploadsPath+"/"+curps.getOriginalFilename());
          Path nombramiento_path = Paths.get(uploadsPath+"/"+nombramiento.getOriginalFilename());
          Path afore_path = Paths.get(uploadsPath+"/"+afore.getOriginalFilename());
          Path historia_path = Paths.get(uploadsPath+"/"+historia.getOriginalFilename());

         
         ine.transferTo(ine_path);
         comprobante.transferTo(comprobante_path);
         curps.transferTo(curps_path);
         nombramiento.transferTo(nombramiento_path);
         afore.transferTo(afore_path);
         historia.transferTo(historia_path);
         File ine_re = new File(uploadsPath+"/"+ine.getOriginalFilename());
         File ine_rem = new File(uploadsPath+"/ine_"+rfcs+".pdf");
         File comprobante_re = new File(uploadsPath+"/"+comprobante.getOriginalFilename());
         File comprobante_rem = new File(uploadsPath+"/comprobante_"+rfcs+".pdf");
         File curp_re = new File(uploadsPath+"/"+curps.getOriginalFilename());
         File curp_rem = new File(uploadsPath+"/curp_"+rfcs+".pdf");
         File nombramiento_re = new File(uploadsPath+"/"+nombramiento.getOriginalFilename());
         File nombramiento_rem = new File(uploadsPath+"/nombramiento_"+rfcs+".pdf");
         File afore_re = new File(uploadsPath+"/"+afore.getOriginalFilename());
         File afore_rem = new File(uploadsPath+"/afore_"+rfcs+".pdf");
         File historia_re = new File(uploadsPath+"/"+historia.getOriginalFilename());
         File historia_rem = new File(uploadsPath+"/historia_"+rfcs+".pdf");
         
         
        ine_re.renameTo(ine_rem);
        comprobante_re.renameTo(comprobante_rem);
        curp_re.renameTo(curp_rem);
        nombramiento_re.renameTo(nombramiento_rem);
        historia_re.renameTo(historia_rem);
        afore_re.renameTo(afore_rem);
        
        final String sql = "insert into TRegistro_ahorro (rfc,curp,nombre_completo,correo_institucional,clave_presupuestal,centro_trabajo,telefono_local,telefono_cel,ine_ruta,comprobante_ruta,curp_ruta,nombramiento_ruta,afore_ruta,historia_ruta) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        this.jdbc.update(sql, 
        rfcs,
        curp,
        nombre_completo,
        correo_institucional,
        clave_presupuestal,
        centro_trabajo,
        telefono_local,
        telefono_cel,
        ine_rem.toString(),
        comprobante_rem.toString(),
        curp_rem.toString(),
        nombramiento_rem.toString(),
        afore_rem.toString(),
        historia_rem.toString()
        );
    }
    }
    
}
