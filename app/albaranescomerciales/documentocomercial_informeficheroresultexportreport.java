package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.documentocomercial_informeficheroresultexportreport", "/app.albaranescomerciales.documentocomercial_informeficheroresultexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercial_informeficheroresultexportreport extends GXWebObjectStub
{
   public documentocomercial_informeficheroresultexportreport( )
   {
   }

   public documentocomercial_informeficheroresultexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercial_informeficheroresultexportreport.class ));
   }

   public documentocomercial_informeficheroresultexportreport( int remoteHandle ,
                                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercial_informeficheroresultexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercial_informeficheroresultexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Comercial_Informe Fichero RESULTExport Report";
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

