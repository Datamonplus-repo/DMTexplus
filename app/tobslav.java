package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tobslav", "/app.tobslav"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobslav extends GXWebObjectStub
{
   public tobslav( )
   {
   }

   public tobslav( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobslav.class ));
   }

   public tobslav( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobslav_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobslav_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES DISPOS. CLIENTE";
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

