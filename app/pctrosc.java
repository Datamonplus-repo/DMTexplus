package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pctrosc", "/app.pctrosc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pctrosc extends GXWebObjectStub
{
   public pctrosc( )
   {
   }

   public pctrosc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pctrosc.class ));
   }

   public pctrosc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pctrosc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pctrosc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTROL OS CREADAS";
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

