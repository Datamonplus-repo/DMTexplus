package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disalb___ww", "/app.pedidos.disalb___ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disalb___ww extends GXWebObjectStub
{
   public disalb___ww( )
   {
   }

   public disalb___ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disalb___ww.class ));
   }

   public disalb___ww( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disalb___ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disalb___ww_impl(context).cleanup();
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

