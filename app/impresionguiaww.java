package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.impresionguiaww", "/app.impresionguiaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionguiaww extends GXWebObjectStub
{
   public impresionguiaww( )
   {
   }

   public impresionguiaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionguiaww.class ));
   }

   public impresionguiaww( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionguiaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionguiaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Impression de Guias";
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

