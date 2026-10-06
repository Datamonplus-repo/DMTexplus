package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransporteproduccion.documentotransportedeproduccion_11", "/app.documentotransporteproduccion.documentotransportedeproduccion_11"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransportedeproduccion_11 extends GXWebObjectStub
{
   public documentotransportedeproduccion_11( )
   {
   }

   public documentotransportedeproduccion_11( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransportedeproduccion_11.class ));
   }

   public documentotransportedeproduccion_11( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransportedeproduccion_11_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransportedeproduccion_11_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada codigo de AT MANUAL";
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

