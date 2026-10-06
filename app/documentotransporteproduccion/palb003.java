package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.palb003", "/app.documentotransporteproduccion.palb003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class palb003 extends GXWebObjectStub
{
   public palb003( )
   {
   }

   public palb003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( palb003.class ));
   }

   public palb003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new palb003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new palb003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Albaranes Produccion";
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

