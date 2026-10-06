package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disfas__ww", "/app.pedidos.disfas__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disfas__ww extends GXWebObjectStub
{
   public disfas__ww( )
   {
   }

   public disfas__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disfas__ww.class ));
   }

   public disfas__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disfas__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disfas__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Fase del proceso";
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

