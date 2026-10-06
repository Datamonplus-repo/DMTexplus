package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte_cierre2_wcexportcsv", "/app.formulaciontinte.recetadetinte_cierre2_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte_cierre2_wcexportcsv extends GXWebObjectStub
{
   public recetadetinte_cierre2_wcexportcsv( )
   {
   }

   public recetadetinte_cierre2_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte_cierre2_wcexportcsv.class ));
   }

   public recetadetinte_cierre2_wcexportcsv( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte_cierre2_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte_cierre2_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetade Tinte_Cierre2_WCExport CSV";
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

