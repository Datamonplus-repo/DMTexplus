package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbde5", "/app.talbde5"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbde5 extends GXWebObjectStub
{
   public talbde5( )
   {
   }

   public talbde5( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbde5.class ));
   }

   public talbde5( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbde5_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbde5_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALTA ALBARANES PIEZA (Mts./Kg)";
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

