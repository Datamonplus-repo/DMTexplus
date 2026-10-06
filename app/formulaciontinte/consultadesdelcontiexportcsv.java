package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultadesdelcontiexportcsv", "/app.formulaciontinte.consultadesdelcontiexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadesdelcontiexportcsv extends GXWebObjectStub
{
   public consultadesdelcontiexportcsv( )
   {
   }

   public consultadesdelcontiexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadesdelcontiexportcsv.class ));
   }

   public consultadesdelcontiexportcsv( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadesdelcontiexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadesdelcontiexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consultadesde Lconti Export CSV";
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

