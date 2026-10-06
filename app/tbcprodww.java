package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbcprodww", "/app.tbcprodww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbcprodww extends GXWebObjectStub
{
   public tbcprodww( )
   {
   }

   public tbcprodww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbcprodww.class ));
   }

   public tbcprodww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbcprodww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbcprodww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Productos";
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

