package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dislin____ww", "/app.pedidos.dislin____ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dislin____ww extends GXWebObjectStub
{
   public dislin____ww( )
   {
   }

   public dislin____ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dislin____ww.class ));
   }

   public dislin____ww( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dislin____ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dislin____ww_impl(context).cleanup();
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

