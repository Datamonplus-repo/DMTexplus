package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultamaquinasexportcsv", "/app.consultamaquinasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultamaquinasexportcsv extends GXWebObjectStub
{
   public consultamaquinasexportcsv( )
   {
   }

   public consultamaquinasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultamaquinasexportcsv.class ));
   }

   public consultamaquinasexportcsv( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultamaquinasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultamaquinasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Maquinas Export CSV";
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

