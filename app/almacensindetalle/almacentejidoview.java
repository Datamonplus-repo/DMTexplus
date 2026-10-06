package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.almacentejidoview", "/app.almacensindetalle.almacentejidoview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoview extends GXWebObjectStub
{
   public almacentejidoview( )
   {
   }

   public almacentejidoview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoview.class ));
   }

   public almacentejidoview( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido View";
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

