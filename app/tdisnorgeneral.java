package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisnorgeneral", "/app.tdisnorgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisnorgeneral extends GXWebObjectStub
{
   public tdisnorgeneral( )
   {
   }

   public tdisnorgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisnorgeneral.class ));
   }

   public tdisnorgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisnorgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisnorgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDISNORGeneral";
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

