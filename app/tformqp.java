package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tformqp", "/app.tformqp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tformqp extends GXWebObjectStub
{
   public tformqp( )
   {
   }

   public tformqp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tformqp.class ));
   }

   public tformqp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tformqp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tformqp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RELACION COLOR-MAQ-PROGRAMAS";
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

