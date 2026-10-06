package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_informeficheroresultexportcsv", "/app.trabajosexternos.trabajoexterno_informeficheroresultexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_informeficheroresultexportcsv extends GXWebObjectStub
{
   public trabajoexterno_informeficheroresultexportcsv( )
   {
   }

   public trabajoexterno_informeficheroresultexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_informeficheroresultexportcsv.class ));
   }

   public trabajoexterno_informeficheroresultexportcsv( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_informeficheroresultexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_informeficheroresultexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajo Externo_Informe Fichero RESULTExport CSV";
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

