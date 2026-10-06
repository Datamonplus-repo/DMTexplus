package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tinthnp", "/app.tinthnp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinthnp extends GXWebObjectStub
{
   public tinthnp( )
   {
   }

   public tinthnp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinthnp.class ));
   }

   public tinthnp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinthnp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinthnp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INTERVALOS HORAS NO PROD/DIA";
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

