package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevcruww", "/app.tdevcruww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevcruww extends GXWebObjectStub
{
   public tdevcruww( )
   {
   }

   public tdevcruww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevcruww.class ));
   }

   public tdevcruww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevcruww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevcruww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Devolucion Entradas en Almacen";
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

