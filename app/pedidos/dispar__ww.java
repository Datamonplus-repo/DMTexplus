package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dispar__ww", "/app.pedidos.dispar__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dispar__ww extends GXWebObjectStub
{
   public dispar__ww( )
   {
   }

   public dispar__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dispar__ww.class ));
   }

   public dispar__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dispar__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dispar__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Parámetros";
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

