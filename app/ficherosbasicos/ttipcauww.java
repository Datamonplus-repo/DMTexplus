package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipcauww", "/app.ficherosbasicos.ttipcauww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcauww extends GXWebObjectStub
{
   public ttipcauww( )
   {
   }

   public ttipcauww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcauww.class ));
   }

   public ttipcauww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcauww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcauww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Causas del Defecto";
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

