package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pprc165", "/app.pprc165"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pprc165 extends GXWebObjectStub
{
   public pprc165( )
   {
   }

   public pprc165( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pprc165.class ));
   }

   public pprc165( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pprc165_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pprc165_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Simulacion Coste COLOR";
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

