package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabado05_wcexportcsv", "/app.recetasdeacabado05_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetasdeacabado05_wcexportcsv extends GXWebObjectStub
{
   public recetasdeacabado05_wcexportcsv( )
   {
   }

   public recetasdeacabado05_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetasdeacabado05_wcexportcsv.class ));
   }

   public recetasdeacabado05_wcexportcsv( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetasdeacabado05_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetasdeacabado05_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetasde Acabado05_WCExport CSV";
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

