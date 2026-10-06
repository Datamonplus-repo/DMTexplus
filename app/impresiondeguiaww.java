package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.impresiondeguiaww", "/app.impresiondeguiaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresiondeguiaww extends GXWebObjectStub
{
   public impresiondeguiaww( )
   {
   }

   public impresiondeguiaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresiondeguiaww.class ));
   }

   public impresiondeguiaww( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresiondeguiaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresiondeguiaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Albaran de Produccion";
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

