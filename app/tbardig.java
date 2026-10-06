package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbardig", "/app.tbardig"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbardig extends GXWebObjectStub
{
   public tbardig( )
   {
   }

   public tbardig( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbardig.class ));
   }

   public tbardig( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbardig_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbardig_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COMINACIONES DIGITAL";
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

