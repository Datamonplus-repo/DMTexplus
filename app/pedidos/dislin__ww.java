package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dislin__ww", "/app.pedidos.dislin__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dislin__ww extends GXWebObjectStub
{
   public dislin__ww( )
   {
   }

   public dislin__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dislin__ww.class ));
   }

   public dislin__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dislin__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dislin__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Procesos";
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

