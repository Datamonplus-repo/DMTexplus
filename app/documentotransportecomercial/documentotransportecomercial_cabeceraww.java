package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial.documentotransportecomercial_cabeceraww", "/app.documentotransportecomercial.documentotransportecomercial_cabeceraww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransportecomercial_cabeceraww extends GXWebObjectStub
{
   public documentotransportecomercial_cabeceraww( )
   {
   }

   public documentotransportecomercial_cabeceraww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransportecomercial_cabeceraww.class ));
   }

   public documentotransportecomercial_cabeceraww( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransportecomercial_cabeceraww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransportecomercial_cabeceraww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Documento Transporte Comercial ";
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

