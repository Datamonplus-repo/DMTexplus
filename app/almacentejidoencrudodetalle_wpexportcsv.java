package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudodetalle_wpexportcsv", "/app.almacentejidoencrudodetalle_wpexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudodetalle_wpexportcsv extends GXWebObjectStub
{
   public almacentejidoencrudodetalle_wpexportcsv( )
   {
   }

   public almacentejidoencrudodetalle_wpexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudodetalle_wpexportcsv.class ));
   }

   public almacentejidoencrudodetalle_wpexportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudodetalle_wpexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudodetalle_wpexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejidoencrudo Detalle_WPExport CSV";
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

