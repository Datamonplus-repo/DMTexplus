package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcomdig", "/app.tcomdig"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcomdig extends GXWebObjectStub
{
   public tcomdig( )
   {
   }

   public tcomdig( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcomdig.class ));
   }

   public tcomdig( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcomdig_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcomdig_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COMBINACIONES DIGITAL";
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

