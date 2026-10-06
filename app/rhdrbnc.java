package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rhdrbnc", "/app.rhdrbnc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rhdrbnc extends GXWebObjectStub
{
   public rhdrbnc( )
   {
   }

   public rhdrbnc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rhdrbnc.class ));
   }

   public rhdrbnc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rhdrbnc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rhdrbnc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "BOLETIM DE NAO CONFORMIDADE";
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

