package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tactem", "/app.tactem"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tactem extends GXWebObjectStub
{
   public tactem( )
   {
   }

   public tactem( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tactem.class ));
   }

   public tactem( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tactem_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tactem_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO ACTIVIDAD EMPAQUETAR";
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

