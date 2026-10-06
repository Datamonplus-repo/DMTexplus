package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcacpep", "/app.tcacpep"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcacpep extends GXWebObjectStub
{
   public tcacpep( )
   {
   }

   public tcacpep( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcacpep.class ));
   }

   public tcacpep( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcacpep_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcacpep_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPTURA PARAMETROS PERCHA";
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

