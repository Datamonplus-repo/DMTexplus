package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ejemploudpobtenerqrcurl", "/app.ejemploudpobtenerqrcurl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ejemploudpobtenerqrcurl extends GXWebObjectStub
{
   public ejemploudpobtenerqrcurl( )
   {
   }

   public ejemploudpobtenerqrcurl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ejemploudpobtenerqrcurl.class ));
   }

   public ejemploudpobtenerqrcurl( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ejemploudpobtenerqrcurl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ejemploudpobtenerqrcurl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ejemplo Uso Udp Procedure ObtenerQrcURL";
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

