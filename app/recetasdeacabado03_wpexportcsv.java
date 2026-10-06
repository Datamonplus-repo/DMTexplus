package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recetasdeacabado03_wpexportcsv", "/app.recetasdeacabado03_wpexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetasdeacabado03_wpexportcsv extends GXWebObjectStub
{
   public recetasdeacabado03_wpexportcsv( )
   {
   }

   public recetasdeacabado03_wpexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetasdeacabado03_wpexportcsv.class ));
   }

   public recetasdeacabado03_wpexportcsv( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetasdeacabado03_wpexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetasdeacabado03_wpexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetasde Acabado03_WPExport CSV";
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

