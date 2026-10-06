package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpreatx", "/app.tpreatx"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpreatx extends GXWebObjectStub
{
   public tpreatx( )
   {
   }

   public tpreatx( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpreatx.class ));
   }

   public tpreatx( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpreatx_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpreatx_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PREATX";
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

