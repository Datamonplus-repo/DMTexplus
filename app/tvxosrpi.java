package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxosrpi", "/app.tvxosrpi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxosrpi extends GXWebObjectStub
{
   public tvxosrpi( )
   {
   }

   public tvxosrpi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxosrpi.class ));
   }

   public tvxosrpi( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxosrpi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxosrpi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estructura OSERPI en Vertex";
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

