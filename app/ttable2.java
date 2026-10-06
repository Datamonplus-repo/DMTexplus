package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttable2", "/app.ttable2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttable2 extends GXWebObjectStub
{
   public ttable2( )
   {
   }

   public ttable2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttable2.class ));
   }

   public ttable2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttable2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttable2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA DE ENSAYOS";
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

