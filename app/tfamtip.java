package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfamtip", "/app.tfamtip"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfamtip extends GXWebObjectStub
{
   public tfamtip( )
   {
   }

   public tfamtip( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfamtip.class ));
   }

   public tfamtip( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfamtip_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfamtip_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FAMILIAS";
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

