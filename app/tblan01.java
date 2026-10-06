package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tblan01", "/app.tblan01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tblan01 extends GXWebObjectStub
{
   public tblan01( )
   {
   }

   public tblan01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tblan01.class ));
   }

   public tblan01( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tblan01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tblan01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALCULO VELOCIDAD";
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

