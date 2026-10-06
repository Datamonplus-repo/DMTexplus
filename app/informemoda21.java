package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemoda21", "/app.informemoda21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemoda21 extends GXWebObjectStub
{
   public informemoda21( )
   {
   }

   public informemoda21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemoda21.class ));
   }

   public informemoda21( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemoda21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemoda21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion (copy RPRM019)";
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

