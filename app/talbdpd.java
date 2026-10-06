package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdpd", "/app.talbdpd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdpd extends GXWebObjectStub
{
   public talbdpd( )
   {
   }

   public talbdpd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdpd.class ));
   }

   public talbdpd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdpd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdpd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARANES RECEPCION Pzs/Rf.Dis";
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

