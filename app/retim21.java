package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.retim21", "/app.retim21"})
@jakarta.servlet.annotation.MultipartConfig
public final  class retim21 extends GXWebObjectStub
{
   public retim21( )
   {
   }

   public retim21( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( retim21.class ));
   }

   public retim21( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new retim21_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new retim21_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ETIQUETA RAMA";
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

