package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt001ww", "/app.ficherosbasicos.tnxt001ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt001ww extends GXWebObjectStub
{
   public tnxt001ww( )
   {
   }

   public tnxt001ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt001ww.class ));
   }

   public tnxt001ww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt001ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt001ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Desarrollos";
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

