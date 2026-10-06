package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwkp113", "/app.webwkp113"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwkp113 extends GXWebObjectStub
{
   public webwkp113( )
   {
   }

   public webwkp113( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwkp113.class ));
   }

   public webwkp113( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwkp113_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwkp113_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Maquinas a Imprimir";
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

