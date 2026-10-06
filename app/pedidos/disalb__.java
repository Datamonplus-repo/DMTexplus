package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disalb__", "/app.pedidos.disalb__"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disalb__ extends GXWebObjectStub
{
   public disalb__( )
   {
   }

   public disalb__( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disalb__.class ));
   }

   public disalb__( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disalb___impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disalb___impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido ";
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

