package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbvpr", "/app.talbvpr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbvpr extends GXWebObjectStub
{
   public talbvpr( )
   {
   }

   public talbvpr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbvpr.class ));
   }

   public talbvpr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbvpr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbvpr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRASPASO PROCESOS ALBARANES";
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

