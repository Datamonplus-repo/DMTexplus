package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.arpr0001r", "/app.arpr0001r"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arpr0001r extends GXWebObjectStub
{
   public arpr0001r( )
   {
   }

   public arpr0001r( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arpr0001r.class ));
   }

   public arpr0001r( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arpr0001r_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arpr0001r_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RESUMEN P/OPERARIO";
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

