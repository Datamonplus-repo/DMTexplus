package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listconsultaproduccionexportcsv", "/app.listconsultaproduccionexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listconsultaproduccionexportcsv extends GXWebObjectStub
{
   public listconsultaproduccionexportcsv( )
   {
   }

   public listconsultaproduccionexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listconsultaproduccionexportcsv.class ));
   }

   public listconsultaproduccionexportcsv( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listconsultaproduccionexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listconsultaproduccionexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "List Consulta Produccion Export CSV";
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

