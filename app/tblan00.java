package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tblan00", "/app.tblan00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tblan00 extends GXWebObjectStub
{
   public tblan00( )
   {
   }

   public tblan00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tblan00.class ));
   }

   public tblan00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tblan00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tblan00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA VELOCIDADES";
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

