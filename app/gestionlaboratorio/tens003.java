package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tens003", "/app.gestionlaboratorio.tens003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tens003 extends GXWebObjectStub
{
   public tens003( )
   {
   }

   public tens003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tens003.class ));
   }

   public tens003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tens003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tens003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENSAYOS, ACEPTACION";
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

