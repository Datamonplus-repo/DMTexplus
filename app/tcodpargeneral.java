package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcodpargeneral", "/app.tcodpargeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodpargeneral extends GXWebObjectStub
{
   public tcodpargeneral( )
   {
   }

   public tcodpargeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodpargeneral.class ));
   }

   public tcodpargeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodpargeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodpargeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCODPARGeneral";
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

