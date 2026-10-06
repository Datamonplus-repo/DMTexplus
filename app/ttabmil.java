package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttabmil", "/app.ttabmil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttabmil extends GXWebObjectStub
{
   public ttabmil( )
   {
   }

   public ttabmil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttabmil.class ));
   }

   public ttabmil( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttabmil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttabmil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA MILITAR";
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

