package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tforpag", "/app.ficherosbasicos.tforpag"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforpag extends GXWebObjectStub
{
   public tforpag( )
   {
   }

   public tforpag( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforpag.class ));
   }

   public tforpag( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforpag_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforpag_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Formas de Pago";
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

