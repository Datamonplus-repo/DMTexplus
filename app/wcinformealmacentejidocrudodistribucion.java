package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcinformealmacentejidocrudodistribucion", "/app.wcinformealmacentejidocrudodistribucion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcinformealmacentejidocrudodistribucion extends GXWebObjectStub
{
   public wcinformealmacentejidocrudodistribucion( )
   {
   }

   public wcinformealmacentejidocrudodistribucion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcinformealmacentejidocrudodistribucion.class ));
   }

   public wcinformealmacentejidocrudodistribucion( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcinformealmacentejidocrudodistribucion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcinformealmacentejidocrudodistribucion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCInforme Almacen Tejido Crudo (Distribucion)";
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

