package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tclapenww", "/app.ficherosbasicos.tclapenww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclapenww extends GXWebObjectStub
{
   public tclapenww( )
   {
   }

   public tclapenww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclapenww.class ));
   }

   public tclapenww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclapenww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclapenww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipos de Familias";
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

