package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwopesat", "/app.webwopesat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwopesat extends GXWebObjectStub
{
   public webwopesat( )
   {
   }

   public webwopesat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwopesat.class ));
   }

   public webwopesat( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwopesat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwopesat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLAVE ESPECIAL -TIPO ARTICULO-";
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

