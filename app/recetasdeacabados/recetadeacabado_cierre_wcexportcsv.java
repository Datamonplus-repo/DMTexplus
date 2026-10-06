package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabados.recetadeacabado_cierre_wcexportcsv", "/app.recetasdeacabados.recetadeacabado_cierre_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadeacabado_cierre_wcexportcsv extends GXWebObjectStub
{
   public recetadeacabado_cierre_wcexportcsv( )
   {
   }

   public recetadeacabado_cierre_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadeacabado_cierre_wcexportcsv.class ));
   }

   public recetadeacabado_cierre_wcexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadeacabado_cierre_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadeacabado_cierre_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetade Acabado_Cierre_WCExport CSV";
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

