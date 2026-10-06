package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.duplicararticulos_1", "/app.ficherosbasicos.duplicararticulos_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class duplicararticulos_1 extends GXWebObjectStub
{
   public duplicararticulos_1( )
   {
   }

   public duplicararticulos_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( duplicararticulos_1.class ));
   }

   public duplicararticulos_1( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new duplicararticulos_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new duplicararticulos_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicar Articulos ";
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

