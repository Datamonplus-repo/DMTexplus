package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tmarcasww", "/app.ficherosbasicos.tmarcasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcasww extends GXWebObjectStub
{
   public tmarcasww( )
   {
   }

   public tmarcasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcasww.class ));
   }

   public tmarcasww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Marcas Cliente";
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

