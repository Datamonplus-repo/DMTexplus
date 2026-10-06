package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.rens026", "/app.gestionlaboratorio.rens026"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens026 extends GXWebObjectStub
{
   public rens026( )
   {
   }

   public rens026( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens026.class ));
   }

   public rens026( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens026_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens026_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENSAYOS REALIZADOS";
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

