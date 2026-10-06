package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disalb__wc", "/app.pedidos.disalb__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disalb__wc extends GXWebObjectStub
{
   public disalb__wc( )
   {
   }

   public disalb__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disalb__wc.class ));
   }

   public disalb__wc( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disalb__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disalb__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entrada de Almacén";
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

