package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdeftip", "/app.tdeftip"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdeftip extends GXWebObjectStub
{
   public tdeftip( )
   {
   }

   public tdeftip( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdeftip.class ));
   }

   public tdeftip( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdeftip_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdeftip_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS DEFECTOS, MX";
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

