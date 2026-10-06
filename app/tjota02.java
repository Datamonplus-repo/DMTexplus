package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tjota02", "/app.tjota02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tjota02 extends GXWebObjectStub
{
   public tjota02( )
   {
   }

   public tjota02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tjota02.class ));
   }

   public tjota02( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tjota02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tjota02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA REBAJES";
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

