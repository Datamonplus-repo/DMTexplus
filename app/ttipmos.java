package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipmos", "/app.ttipmos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmos extends GXWebObjectStub
{
   public ttipmos( )
   {
   }

   public ttipmos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmos.class ));
   }

   public ttipmos( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS MUESTRAS";
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

