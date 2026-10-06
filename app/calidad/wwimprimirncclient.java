package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwimprimirncclient", "/app.calidad.wwimprimirncclient"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwimprimirncclient extends GXWebObjectStub
{
   public wwimprimirncclient( )
   {
   }

   public wwimprimirncclient( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwimprimirncclient.class ));
   }

   public wwimprimirncclient( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwimprimirncclient_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwimprimirncclient_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ww Imprimir NC por Cliente";
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

