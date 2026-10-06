package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.ensayosparacerrarutilidad_wc", "/app.gestionlaboratorio.ensayosparacerrarutilidad_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ensayosparacerrarutilidad_wc extends GXWebObjectStub
{
   public ensayosparacerrarutilidad_wc( )
   {
   }

   public ensayosparacerrarutilidad_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ensayosparacerrarutilidad_wc.class ));
   }

   public ensayosparacerrarutilidad_wc( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ensayosparacerrarutilidad_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ensayosparacerrarutilidad_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos para Cerrar Utilidad";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

