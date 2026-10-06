package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwwkp89", "/app.webwwkp89"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwwkp89 extends GXWebObjectStub
{
   public webwwkp89( )
   {
   }

   public webwwkp89( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwwkp89.class ));
   }

   public webwwkp89( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwwkp89_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwwkp89_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control existencias UPQ";
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

