package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial.documentotransportecomercial_observaciones", "/app.documentotransportecomercial.documentotransportecomercial_observaciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransportecomercial_observaciones extends GXWebObjectStub
{
   public documentotransportecomercial_observaciones( )
   {
   }

   public documentotransportecomercial_observaciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransportecomercial_observaciones.class ));
   }

   public documentotransportecomercial_observaciones( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransportecomercial_observaciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransportecomercial_observaciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Transporte Comercial_Observaciones";
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

