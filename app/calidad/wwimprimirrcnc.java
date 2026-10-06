package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwimprimirrcnc", "/app.calidad.wwimprimirrcnc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwimprimirrcnc extends GXWebObjectStub
{
   public wwimprimirrcnc( )
   {
   }

   public wwimprimirrcnc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwimprimirrcnc.class ));
   }

   public wwimprimirrcnc( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwimprimirrcnc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwimprimirrcnc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Imprimir RC e NC";
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

