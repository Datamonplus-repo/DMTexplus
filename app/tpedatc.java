package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedatc", "/app.tpedatc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedatc extends GXWebObjectStub
{
   public tpedatc( )
   {
   }

   public tpedatc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedatc.class ));
   }

   public tpedatc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedatc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedatc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Complementos";
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

