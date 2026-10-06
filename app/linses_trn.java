package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.linses_trn", "/app.linses_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class linses_trn extends GXWebObjectStub
{
   public linses_trn( )
   {
   }

   public linses_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( linses_trn.class ));
   }

   public linses_trn( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new linses_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new linses_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LINSES_TRN";
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

