package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.documentotransportecomercial.documentotransportecomercial_lineas_trn", "/app.documentotransportecomercial.documentotransportecomercial_lineas_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentotransportecomercial_lineas_trn extends GXWebObjectStub
{
   public documentotransportecomercial_lineas_trn( )
   {
   }

   public documentotransportecomercial_lineas_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentotransportecomercial_lineas_trn.class ));
   }

   public documentotransportecomercial_lineas_trn( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentotransportecomercial_lineas_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentotransportecomercial_lineas_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Transporte Comercial_Lineas_Trn";
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

