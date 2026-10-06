package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudodistribucion_wcexportcsv", "/app.almacentejidoencrudodistribucion_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudodistribucion_wcexportcsv extends GXWebObjectStub
{
   public almacentejidoencrudodistribucion_wcexportcsv( )
   {
   }

   public almacentejidoencrudodistribucion_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudodistribucion_wcexportcsv.class ));
   }

   public almacentejidoencrudodistribucion_wcexportcsv( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudodistribucion_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudodistribucion_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejidoencrudo Distribucion_WCExport CSV";
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

