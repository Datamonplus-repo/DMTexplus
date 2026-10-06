package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consumoscolorservice_wcexportcsv", "/app.formulaciontinte.consumoscolorservice_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumoscolorservice_wcexportcsv extends GXWebObjectStub
{
   public consumoscolorservice_wcexportcsv( )
   {
   }

   public consumoscolorservice_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumoscolorservice_wcexportcsv.class ));
   }

   public consumoscolorservice_wcexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumoscolorservice_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumoscolorservice_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumos Color Service_WCExport CSV";
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

