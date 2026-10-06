package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprofsa", "/app.tprofsa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprofsa extends GXWebObjectStub
{
   public tprofsa( )
   {
   }

   public tprofsa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprofsa.class ));
   }

   public tprofsa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprofsa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprofsa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA PROCESO ACABADO";
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

