package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.almacentejidowwexportcsv", "/app.almacensindetalle.almacentejidowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidowwexportcsv extends GXWebObjectStub
{
   public almacentejidowwexportcsv( )
   {
   }

   public almacentejidowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidowwexportcsv.class ));
   }

   public almacentejidowwexportcsv( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido WWExport CSV";
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

