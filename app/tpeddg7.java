package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpeddg7", "/app.tpeddg7"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpeddg7 extends GXWebObjectStub
{
   public tpeddg7( )
   {
   }

   public tpeddg7( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpeddg7.class ));
   }

   public tpeddg7( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpeddg7_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpeddg7_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tratamientos Quimicos";
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

