package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rpr0027dt", "/app.rpr0027dt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rpr0027dt extends GXWebObjectStub
{
   public rpr0027dt( )
   {
   }

   public rpr0027dt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rpr0027dt.class ));
   }

   public rpr0027dt( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rpr0027dt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rpr0027dt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Paros Data Time";
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

