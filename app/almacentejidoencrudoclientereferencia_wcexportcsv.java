package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudoclientereferencia_wcexportcsv", "/app.almacentejidoencrudoclientereferencia_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudoclientereferencia_wcexportcsv extends GXWebObjectStub
{
   public almacentejidoencrudoclientereferencia_wcexportcsv( )
   {
   }

   public almacentejidoencrudoclientereferencia_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudoclientereferencia_wcexportcsv.class ));
   }

   public almacentejidoencrudoclientereferencia_wcexportcsv( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudoclientereferencia_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudoclientereferencia_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejidoencrudo Cliente Referencia_WCExport CSV";
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

