package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lectoroptico.lector__", "/app.lectoroptico.lector__"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lector__ extends GXWebObjectStub
{
   public lector__( )
   {
   }

   public lector__( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lector__.class ));
   }

   public lector__( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lector___impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lector___impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Tabla LECTOR";
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

