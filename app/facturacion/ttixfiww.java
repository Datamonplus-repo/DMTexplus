package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.ttixfiww", "/app.facturacion.ttixfiww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttixfiww extends GXWebObjectStub
{
   public ttixfiww( )
   {
   }

   public ttixfiww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttixfiww.class ));
   }

   public ttixfiww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttixfiww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttixfiww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TIxFI";
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

