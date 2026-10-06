package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial.documentodetransporte_lectura_result", "/app.documentotransportecomercial.documentodetransporte_lectura_result"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentodetransporte_lectura_result extends GXWebObjectStub
{
   public documentodetransporte_lectura_result( )
   {
   }

   public documentodetransporte_lectura_result( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentodetransporte_lectura_result.class ));
   }

   public documentodetransporte_lectura_result( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentodetransporte_lectura_result_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentodetransporte_lectura_result_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Fichero RESULT.xml";
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

