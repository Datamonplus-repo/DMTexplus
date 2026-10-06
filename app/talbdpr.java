package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdpr", "/app.talbdpr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdpr extends GXWebObjectStub
{
   public talbdpr( )
   {
   }

   public talbdpr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdpr.class ));
   }

   public talbdpr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdpr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdpr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARAN RECEPCION (Pzas/Ref.)";
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

