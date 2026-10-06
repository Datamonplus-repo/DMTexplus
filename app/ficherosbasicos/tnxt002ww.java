package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt002ww", "/app.ficherosbasicos.tnxt002ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt002ww extends GXWebObjectStub
{
   public tnxt002ww( )
   {
   }

   public tnxt002ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt002ww.class ));
   }

   public tnxt002ww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt002ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt002ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Departamentos";
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

