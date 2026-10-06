package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpreest", "/app.tpreest"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpreest extends GXWebObjectStub
{
   public tpreest( )
   {
   }

   public tpreest( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpreest.class ));
   }

   public tpreest( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpreest_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpreest_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO CALIDAD ESTAMPACION";
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

