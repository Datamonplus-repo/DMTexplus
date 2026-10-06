package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens025", "/app.gestionlaboratorio.rens025"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens025 extends GXWebObjectStub
{
   public rens025( )
   {
   }

   public rens025( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens025.class ));
   }

   public rens025( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens025_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens025_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIEMPO MEDIO APROBACION";
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

