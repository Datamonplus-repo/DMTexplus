package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.trevendww", "/app.ficherosbasicos.trevendww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trevendww extends GXWebObjectStub
{
   public trevendww( )
   {
   }

   public trevendww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trevendww.class ));
   }

   public trevendww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trevendww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trevendww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Revendores";
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

