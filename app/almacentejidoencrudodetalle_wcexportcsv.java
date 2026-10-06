package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudodetalle_wcexportcsv", "/app.almacentejidoencrudodetalle_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudodetalle_wcexportcsv extends GXWebObjectStub
{
   public almacentejidoencrudodetalle_wcexportcsv( )
   {
   }

   public almacentejidoencrudodetalle_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudodetalle_wcexportcsv.class ));
   }

   public almacentejidoencrudodetalle_wcexportcsv( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudodetalle_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudodetalle_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejidoencrudo Detalle_WCExport CSV";
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

