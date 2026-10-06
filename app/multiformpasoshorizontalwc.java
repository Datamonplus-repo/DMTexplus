package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.multiformpasoshorizontalwc", "/app.multiformpasoshorizontalwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class multiformpasoshorizontalwc extends GXWebObjectStub
{
   public multiformpasoshorizontalwc( )
   {
   }

   public multiformpasoshorizontalwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( multiformpasoshorizontalwc.class ));
   }

   public multiformpasoshorizontalwc( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new multiformpasoshorizontalwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new multiformpasoshorizontalwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pasos horizontales";
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

