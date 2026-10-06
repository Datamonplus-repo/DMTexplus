package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclimarcasww", "/app.ficherosbasicos.tclimarcasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimarcasww extends GXWebObjectStub
{
   public tclimarcasww( )
   {
   }

   public tclimarcasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimarcasww.class ));
   }

   public tclimarcasww( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimarcasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimarcasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " ClientesvsMarcas";
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

