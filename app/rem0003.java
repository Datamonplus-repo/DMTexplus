package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rem0003", "/app.rem0003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rem0003 extends GXWebObjectStub
{
   public rem0003( )
   {
   }

   public rem0003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rem0003.class ));
   }

   public rem0003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rem0003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rem0003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO DE EMPESAS DETALLADO";
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

