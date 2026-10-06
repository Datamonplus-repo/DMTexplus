package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dislin___ww", "/app.pedidos.dislin___ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dislin___ww extends GXWebObjectStub
{
   public dislin___ww( )
   {
   }

   public dislin___ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dislin___ww.class ));
   }

   public dislin___ww( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dislin___ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dislin___ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Proceso";
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

