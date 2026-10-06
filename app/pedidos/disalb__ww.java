package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disalb__ww", "/app.pedidos.disalb__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disalb__ww extends GXWebObjectStub
{
   public disalb__ww( )
   {
   }

   public disalb__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disalb__ww.class ));
   }

   public disalb__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disalb__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disalb__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entradas de Almacén";
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

