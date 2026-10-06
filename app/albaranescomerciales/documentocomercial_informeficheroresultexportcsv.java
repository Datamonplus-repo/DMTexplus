package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.documentocomercial_informeficheroresultexportcsv", "/app.albaranescomerciales.documentocomercial_informeficheroresultexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentocomercial_informeficheroresultexportcsv extends GXWebObjectStub
{
   public documentocomercial_informeficheroresultexportcsv( )
   {
   }

   public documentocomercial_informeficheroresultexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentocomercial_informeficheroresultexportcsv.class ));
   }

   public documentocomercial_informeficheroresultexportcsv( int remoteHandle ,
                                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentocomercial_informeficheroresultexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentocomercial_informeficheroresultexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Comercial_Informe Fichero RESULTExport CSV";
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

