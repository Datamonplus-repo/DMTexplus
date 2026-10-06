package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclipagww", "/app.tclipagww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclipagww extends GXWebObjectStub
{
   public tclipagww( )
   {
   }

   public tclipagww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclipagww.class ));
   }

   public tclipagww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclipagww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclipagww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " DOMICILIOS PAGO CLIENTES";
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

