package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.obsalb_trn", "/app.obsalb_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class obsalb_trn extends GXWebObjectStub
{
   public obsalb_trn( )
   {
   }

   public obsalb_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( obsalb_trn.class ));
   }

   public obsalb_trn( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new obsalb_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new obsalb_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones del Albaran";
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

