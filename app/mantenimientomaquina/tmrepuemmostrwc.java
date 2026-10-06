package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrepuemmostrwc", "/app.mantenimientomaquina.tmrepuemmostrwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepuemmostrwc extends GXWebObjectStub
{
   public tmrepuemmostrwc( )
   {
   }

   public tmrepuemmostrwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepuemmostrwc.class ));
   }

   public tmrepuemmostrwc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepuemmostrwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepuemmostrwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRepue MMOSTRWC";
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

