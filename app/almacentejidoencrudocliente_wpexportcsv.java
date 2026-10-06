package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudocliente_wpexportcsv", "/app.almacentejidoencrudocliente_wpexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudocliente_wpexportcsv extends GXWebObjectStub
{
   public almacentejidoencrudocliente_wpexportcsv( )
   {
   }

   public almacentejidoencrudocliente_wpexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudocliente_wpexportcsv.class ));
   }

   public almacentejidoencrudocliente_wpexportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudocliente_wpexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudocliente_wpexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejidoencrudo Cliente_WPExport CSV";
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

