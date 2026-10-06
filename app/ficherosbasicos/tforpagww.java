package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tforpagww", "/app.ficherosbasicos.tforpagww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforpagww extends GXWebObjectStub
{
   public tforpagww( )
   {
   }

   public tforpagww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforpagww.class ));
   }

   public tforpagww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforpagww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforpagww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " FORMAS DE PAGO";
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

