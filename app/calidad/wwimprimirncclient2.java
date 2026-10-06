package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwimprimirncclient2", "/app.calidad.wwimprimirncclient2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwimprimirncclient2 extends GXWebObjectStub
{
   public wwimprimirncclient2( )
   {
   }

   public wwimprimirncclient2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwimprimirncclient2.class ));
   }

   public wwimprimirncclient2( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwimprimirncclient2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwimprimirncclient2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NC por cliente 2";
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

