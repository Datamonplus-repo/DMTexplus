package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte03_wpexportcsv", "/app.formulaciontinte.recetadetinte03_wpexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte03_wpexportcsv extends GXWebObjectStub
{
   public recetadetinte03_wpexportcsv( )
   {
   }

   public recetadetinte03_wpexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte03_wpexportcsv.class ));
   }

   public recetadetinte03_wpexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte03_wpexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte03_wpexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetade Tinte03_WPExport CSV";
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

