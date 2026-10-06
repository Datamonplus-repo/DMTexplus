package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tzongeoww", "/app.ficherosbasicos.tzongeoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tzongeoww extends GXWebObjectStub
{
   public tzongeoww( )
   {
   }

   public tzongeoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tzongeoww.class ));
   }

   public tzongeoww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tzongeoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tzongeoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Zonas Geograficas";
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

