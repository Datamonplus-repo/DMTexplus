package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcinformesproducciondetalle", "/app.wcinformesproducciondetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcinformesproducciondetalle extends GXWebObjectStub
{
   public wcinformesproducciondetalle( )
   {
   }

   public wcinformesproducciondetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcinformesproducciondetalle.class ));
   }

   public wcinformesproducciondetalle( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcinformesproducciondetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcinformesproducciondetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCInformes Produccion Detalle";
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

