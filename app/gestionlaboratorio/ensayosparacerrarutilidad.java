package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.ensayosparacerrarutilidad", "/app.gestionlaboratorio.ensayosparacerrarutilidad"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ensayosparacerrarutilidad extends GXWebObjectStub
{
   public ensayosparacerrarutilidad( )
   {
   }

   public ensayosparacerrarutilidad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ensayosparacerrarutilidad.class ));
   }

   public ensayosparacerrarutilidad( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ensayosparacerrarutilidad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ensayosparacerrarutilidad_impl(context).cleanup();
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

