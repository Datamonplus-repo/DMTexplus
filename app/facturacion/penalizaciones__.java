package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.penalizaciones__", "/app.facturacion.penalizaciones__"})
@jakarta.servlet.annotation.MultipartConfig
public final  class penalizaciones__ extends GXWebObjectStub
{
   public penalizaciones__( )
   {
   }

   public penalizaciones__( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( penalizaciones__.class ));
   }

   public penalizaciones__( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new penalizaciones___impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new penalizaciones___impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Penalizaciones";
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

