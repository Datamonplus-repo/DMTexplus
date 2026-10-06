package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultamaquinasproduccionwwexportcsv", "/app.consultamaquinasproduccionwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultamaquinasproduccionwwexportcsv extends GXWebObjectStub
{
   public consultamaquinasproduccionwwexportcsv( )
   {
   }

   public consultamaquinasproduccionwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultamaquinasproduccionwwexportcsv.class ));
   }

   public consultamaquinasproduccionwwexportcsv( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultamaquinasproduccionwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultamaquinasproduccionwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Maquinas Produccion WWExport CSV";
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

