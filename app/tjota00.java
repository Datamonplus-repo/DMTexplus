package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tjota00", "/app.tjota00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tjota00 extends GXWebObjectStub
{
   public tjota00( )
   {
   }

   public tjota00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tjota00.class ));
   }

   public tjota00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tjota00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tjota00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA CODIGOS DEPOSITOS";
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

