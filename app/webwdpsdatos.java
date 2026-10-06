package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwdpsdatos", "/app.webwdpsdatos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwdpsdatos extends GXWebObjectStub
{
   public webwdpsdatos( )
   {
   }

   public webwdpsdatos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwdpsdatos.class ));
   }

   public webwdpsdatos( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwdpsdatos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwdpsdatos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ver datos HDR";
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

