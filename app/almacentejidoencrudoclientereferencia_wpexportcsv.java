package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudoclientereferencia_wpexportcsv", "/app.almacentejidoencrudoclientereferencia_wpexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudoclientereferencia_wpexportcsv extends GXWebObjectStub
{
   public almacentejidoencrudoclientereferencia_wpexportcsv( )
   {
   }

   public almacentejidoencrudoclientereferencia_wpexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudoclientereferencia_wpexportcsv.class ));
   }

   public almacentejidoencrudoclientereferencia_wpexportcsv( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudoclientereferencia_wpexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudoclientereferencia_wpexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejidoencrudo Cliente Referencia_WPExport CSV";
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

