package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pfo0019", "/app.pfo0019"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pfo0019 extends GXWebObjectStub
{
   public pfo0019( )
   {
   }

   public pfo0019( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pfo0019.class ));
   }

   public pfo0019( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pfo0019_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pfo0019_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO HDRS, CON INCIDENCIAS";
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

