package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.manutencionusuariosexportcsv", "/app.core.manutencionusuariosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class manutencionusuariosexportcsv extends GXWebObjectStub
{
   public manutencionusuariosexportcsv( )
   {
   }

   public manutencionusuariosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( manutencionusuariosexportcsv.class ));
   }

   public manutencionusuariosexportcsv( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new manutencionusuariosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new manutencionusuariosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Manutencion Usuarios Export CSV";
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

